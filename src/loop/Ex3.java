package loop;

public class Ex3 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 100) {
            if (i% 3 == 0 && i % 4 != 0 && i % 7 != 0)
                System.out.println(i);
            i++;
        }
    }
}
