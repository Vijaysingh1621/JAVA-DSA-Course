import java.util.Scanner;

public class Inverted_Star_Pattern_02 {

    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            int line = vi.nextInt();
            for (int i = 1; i <= line; i++) {
                for (int j = line; j >= i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
