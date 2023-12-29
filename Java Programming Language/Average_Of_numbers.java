import java.util.Scanner;

public class Average_Of_numbers {
    // average of the three numbers

    public static void main(String arg[]) {
        try (Scanner vi = new Scanner(System.in)) {
            int a = vi.nextInt();
            int b = vi.nextInt();
            int c = vi.nextInt();
            int average = (a + b + c) / 2;
            System.out.println(average);
        }

    }
}