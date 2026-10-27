package stream.ioTest;

import java.util.Scanner;

public class IOex1 {
    public static void main(String[] args) {
        int sum = 0;
        int n;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            n = scanner.nextInt();
            sum += n;
        }

        System.out.printf("합: " + sum + " 평균: %.1f", (float) sum / 10);
    }
}
