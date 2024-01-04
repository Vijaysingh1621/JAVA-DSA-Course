import java.util.Scanner;

public class Do_While_loop {
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            String ch = vi.nextLine();
            int counter = 1;
            do {
                System.out.println(ch);
                counter++;
            } while (counter < 10);
        }
    }
}
