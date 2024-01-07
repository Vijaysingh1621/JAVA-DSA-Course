import java.util.Scanner;

public class Factorial_Of_a_Number {
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("enter the number");
            int n = vi.nextInt();
            int Fact = 1;

            int i = 1;
            for (i = 1; i <= n; i++) {
                Fact = Fact * i;

            }
            System.out.println("Factorial :" + Fact);
        }

    }
}
