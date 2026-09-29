package cooperation;

public class Student {
    String studentName;
    int grade;
    int money;

    public Student (String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1100);
        this.money -= 1100;
    }

    public void takeSubway(Subway subway) {
        subway.take(1050);
        this.money -= 1050;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
    }
}
