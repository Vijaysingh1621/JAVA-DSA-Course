import java.util.Scanner;

public class Pattern_04 {
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            int n = vi.nextInt();
            char ch = 'A';
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch);
                    ch++;

                }
                System.out.println();
            }
        }
    }
}
