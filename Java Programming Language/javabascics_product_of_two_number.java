import java.util.Scanner;

public class javabascics_product_of_two_number {
    public static void main(String arg[]) {
        try (// Product of two number
                Scanner vi = new Scanner(System.in)) {
            int a = vi.nextInt();
            int b = vi.nextInt();
            int product = a * b;
            System.out.println(product);
        }

    }

}
