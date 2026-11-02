package stream.ioTest.car;

import java.util.Scanner;

public class CarStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("차종/색상/가격을 순서대로 입력해주세요.");

            String model = scanner.nextLine();
            String color = scanner.nextLine();
            int price = scanner.nextInt();
            scanner.nextLine();

            cars[i] = new Car(model, color, price);

        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println("차종: " + (i + 1));
            cars[i].showCar();
        }
    }
}
