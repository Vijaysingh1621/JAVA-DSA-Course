import java.util.Scanner;

public class Statement_question {
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            do {
                int n = vi.nextInt();
                System.out.println(n);
                if (n % 10 == 0) {
                    break;
                }
            } while (true);
        }

    }
}
