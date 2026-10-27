package stream.ioTest;

import java.util.Scanner;

public class IOex3 {
    public static void main(String[] args) {
        char[] arr1 = new char[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr1[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ "");
        }
    }
}
