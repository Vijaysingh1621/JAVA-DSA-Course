import java.util.Scanner;

public class cal_switch {
    public static void main(String arg[]) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("enter the first number");
            int a = vi.nextInt();
            System.out.println("enter the second number");
            int b = vi.nextInt();
            System.out.println("enter the operator ");
            char ch = vi.next().charAt(0);

            switch (ch) {
                case '+':
                    System.out.println("sum=" + (a + b));

                    break;

                case '-':
                    System.out.println("subtraction =" + (a - b));
                    break;

                case '*':
                    System.out.println("Multiply =" + (a * b));
                    break;

                case '%':
                    System.out.println("Divide" + (a % b));
                    break;

                default:
                    System.out.println("operator is invalid");
            }
        }
    }
}
