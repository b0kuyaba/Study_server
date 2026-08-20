package Ifexample;

public class ConditionEx7 {
    public static void main(String[] args) {
        int month = 8;
        String season = "";

        switch (month) {
            case 3, 4, 5 -> season = "봄";
            case 6, 7, 8 -> season = "여름";
            case 9, 10, 11 -> season = "가을";
            case 12, 1, 2 -> season = "겨울";
            default -> season = "잘못된 입력";
        }
        System.out.println(season + "입니다.");
    };
}
