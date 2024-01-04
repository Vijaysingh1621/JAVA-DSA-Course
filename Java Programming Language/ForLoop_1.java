import java.util.Scanner;

public class ForLoop_1 {
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            String ch = vi.nextLine();
            for (int i = 1; i <= 10; i++) {
                System.out.println(ch);
            }
        }
    }
}
