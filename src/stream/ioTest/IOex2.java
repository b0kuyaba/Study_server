package stream.ioTest;

import java.util.Scanner;

public class IOex2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr1[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " ");
        }
    }
}
