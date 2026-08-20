package Ifexample;

public class ConditionEx2 {
    public static void main(String[] args) {
        int temp = 23;
        String data = "";
        if (temp >= 30) {
            data = "더운";
        } else if (temp >= 20) {
            data = "따뜻한";
        } else if (temp >= 10) {
            data = "쌀쌀한";
        }
        else {
            data = "추운";
        }
        System.out.println(data + " 날씨입니다.");
    };
}
