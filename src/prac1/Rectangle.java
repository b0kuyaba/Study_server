package prac1;

import java.util.Scanner;

class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getRerimeter() {
        return 2 * (width + height);
    }

    public void showInfo() {
        System.out.println("가로: " + width);
        System.out.println("세로: " + height);
        System.out.println("넓이: " + getArea());
        System.out.println("둘레: " + getRerimeter());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(scanner.nextInt(), scanner.nextInt());
        rectangle.showInfo();
    }
}
