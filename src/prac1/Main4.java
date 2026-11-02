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

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public int rent(int days) {
        return dailyPrice * days;
    }

    void showInfo() {
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
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car("234하5678", "teslar", 100000));
        list.add(new Car("555허2158", "sonata", 70000));
        list.add(new Car("123호4567", "genesis", 90000));

        System.out.println("대여 차량(1.teslar, 2.sonata, 3.genesis)와 대여일수를 입력하세요.");
        int n = scanner.nextInt();

        if (n == 1) {
        }
    }
}