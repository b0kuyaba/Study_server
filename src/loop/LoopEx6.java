package loop;

public class LoopEx6 {
    public static void main(String[] args) {
        int i,j;
        int num = 1;

        for ( i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                for (j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + i*j);
                }
                System.out.println();
            }
        }
    }
}
