import java.util.Scanner;

public class Product_of_a_numbers_Function_04 {
    public static int Multiply(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("Enter the numbers");
            int a = vi.nextInt();
            int b = vi.nextInt();
            int multi = Multiply(a, b);
            System.out.println("product of the numbers " + multi);
        }

    }
}
