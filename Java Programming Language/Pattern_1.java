import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            int line = vi.nextInt();
            for (int i = 1; i <= line; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

}
