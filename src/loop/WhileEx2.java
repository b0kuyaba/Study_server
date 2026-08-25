package loop;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        do {
            sum += num;
            num++;

        } while (num <= 0);

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
        System.out.println("num값은 " + num + "입니다.");
    }
}
