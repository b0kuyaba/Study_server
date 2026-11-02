package prac1;

import java.util.Scanner;

class Customer {
    private String name;
    private int reservedSeats;

    public Customer(String name) {
        this.name = name;
        this.reservedSeats = 0;
    }

    public void addReservation(int seats) {
        reservedSeats += seats;
    }

    public void showInfo() {
        System.out.println(name + ": " + reservedSeats + "석");
    }
}

class Cinema {
    private String title;
    private int availableSeats;

    public Cinema(String title, int availableSeats) {
        this.title = title;
        this.availableSeats = availableSeats;
    }

    public void reserve(Customer customer, int count) {
        if (count <= 0) {
            System.out.println("올바른 좌석 수를 입력하세요.");
        } else if (count > availableSeats) {
            System.out.println("예약 가능한 좌석이 부족합니다.");
        } else {
            availableSeats -= count;
            customer.addReservation(count);
        }
    }

    public void showInfo() {
        System.out.println("영화 제목: " + title);
        System.out.println("남은 좌석: " + availableSeats + "석");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cinema cinema = new Cinema("어벤져스", 10);
        Customer c1 = new Customer("홍길동");
        Customer c2 = new Customer("김철수");

        int seats1 = sc.nextInt();
        int seats2 = sc.nextInt();

        cinema.reserve(c1, seats1);
        cinema.reserve(c2, seats2);

        System.out.println("==예약 결과==");
        c1.showInfo();
        c2.showInfo();
        cinema.showInfo();
    }
}