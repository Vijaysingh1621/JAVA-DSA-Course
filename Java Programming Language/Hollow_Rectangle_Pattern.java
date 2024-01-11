import java.util.Scanner;

public class Hollow_Rectangle_Pattern {
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            int n = vi.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j == 2)
                        System.out.print(" * ");

                }
                System.out.println();
            }
        }
    }
}
