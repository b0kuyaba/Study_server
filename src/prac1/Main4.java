package prac1;

import java.util.ArrayList;
import java.util.Scanner;

class Car {
    private static int serialNum = 101;
    private int num;
    private String carNumber;
    private String carType;
    private int dailyPrice;
    private boolean rented;

    Car(String carNumber, String carType, int dailyPrice) {
        this.num = serialNum++;
        this.carNumber = carNumber;
        this.carType = carType;
        this.dailyPrice = dailyPrice;
    }

    public int rent(int days) {
        rented = true;
        return days * dailyPrice;
    }

    public void showInfo() {
        System.out.println("관리번호: " + num);
        System.out.println("차량번호: " + carNumber);
        System.out.println("차종: " + carType);
        System.out.println("1일 대여 요금: " + dailyPrice);
        System.out.println("대여 상태: " + rented);
        System.out.println();
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = 0;
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("234하5678", "teslar", 100000));
        cars.add(new Car("555허2158", "sonata", 70000));
        cars.add(new Car("123호4567", "genesis", 90000));

        System.out.println("대여 차량(1.teslar, 2.sonata, 3.genesis)와 대여일수를 입력하세요.");
        int n = scanner.nextInt();
        int date = scanner.nextInt();

        if (n >= 3 || n <= 0) {
            System.out.println("잘못된 입력입니다,");
        } else {
            int select = cars.get(n - 1).rent(date);
            totalPrice += select;
            for (Car c : cars) {
                c.showInfo();
            }
            System.out.println("총 대여금액: " + totalPrice);
        }
    }
}