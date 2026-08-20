package Ifexample;

public class ConditionEx3 {
    public static void main(String[] args) {
        double distance = 8.5;
        String vehicle = "";
        if (distance <= 1) {
            vehicle = "도보";
        } else if (distance <= 10) {
            vehicle = "자전거";
        } else if (distance <= 50) {
            vehicle = "버스";
        } else {
            vehicle = "기차";
        }
        System.out.println("추천 이동 수단: " + vehicle);
    };
}
