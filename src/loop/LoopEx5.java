package loop;

public class LoopEx5 {
    public static void main(String[] args) {
        int i,j;
        int num = 1;

        for ( i = 0; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
