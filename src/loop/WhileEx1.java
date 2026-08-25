package loop;

public class WhileEx1 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 0) {
            sum += num++;
        }

        System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
        System.out.println("num값은 " + num + "입니다.");
    }
}
