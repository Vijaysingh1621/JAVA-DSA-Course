import java.util.Scanner;

public class PrintNumber1_n {
    public static void main(String arg[]) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("enter the number ");
            int n = vi.nextInt();
            int counter = 0;
            while (counter < n) {
                counter++;
                System.out.println(counter);
            }
        }
    }
}
