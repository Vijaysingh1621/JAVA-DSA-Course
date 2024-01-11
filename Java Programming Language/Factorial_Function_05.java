import java.util.Scanner;

public class Factorial_Function_05 {
    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;
    }

    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("ENTER NUMBER");
            int n = vi.nextInt();
            int fact = Factorial(n);
            System.out.println("Factorial : " + fact);
        }

    }
}
