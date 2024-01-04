import java.util.Scanner;

public class SumofFirstNaturalNumber {
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("enter the number");
            int n = vi.nextInt();
            int counter = 1;
            while (counter <= n) {
                System.out.println(counter);
                counter++;

            }
            System.out.print("sum : ");
            int sum = n * (n + 1) / 2;
            System.out.print(sum);
        }
    }
}
