package Ifexample;

public class ConditionEx8 {
    public static void main(String[] args) {
        int menu = 3;
        String message = switch (menu) {
            case 1 -> "선택한 메뉴: 아메리카노";
            case 2 -> "선택한 메뉴: 카페라떼";
            case 3 -> "선택한 메뉴: 초코라떼";
            case 4 -> "선택한 메뉴: 녹차";
            default -> "없는 메뉴입니다.";
            };
        System.out.println(message);
    }
}
