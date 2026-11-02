package stream.ioTest.car;

public class Car {
    private String model;
    private String color;
    private int price;

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void showCar() {
        System.out.println("차 종: " + model + "\n색: " + color + "\n가격: " + price);
    }
}
