package prac1;

import java.util.Scanner;

class VendingMachine {
    private String name;
    private int price;
    private int stock;

    public VendingMachine (String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void sell(int num) {
        if (num < 1 || stock < num) {
            System.out.println("음료를 판매할 수 없습니다");
        } else {
            stock -= num;
        }
    }

    public void showInfo() {
        System.out.println("==판매 후==");
        System.out.println("음료 이름: " + name);
        System.out.println("가격: " + price);
        System.out.println("남은 재고: " + stock);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine("콜라", 1500, 10);
        vendingMachine.sell(scanner.nextInt());
        vendingMachine.showInfo();
    }
}