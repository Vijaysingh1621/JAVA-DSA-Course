import java.util.Scanner;

public class Whileloop_01 {
    public static void main(String arg[]) {
        try (Scanner vi = new Scanner(System.in)) {
            String ch = vi.nextLine();
            int counter = 0;
            while (counter < 10) {
                System.out.println(ch);
                counter++;

            }
        }

    }
}
