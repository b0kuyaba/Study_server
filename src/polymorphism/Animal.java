package polymorphism;

public class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        AnimalTest aTest = new AnimalTest();
        aTest.moveAnimal(new Humun());
        aTest.moveAnimal(new Tiger());
        aTest.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
class Humun extends Animal {
    public void move() {
        System.out.println("사람이 걷습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 달립니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 날아갑니다.");
    }
}