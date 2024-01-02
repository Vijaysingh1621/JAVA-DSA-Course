import java.util.Scanner;

public class javabascis_12 {
    public static void main(String arg[]) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("enter your income");
            int a = vi.nextInt();
            if (a <= 500000) {
                System.out.println("your income tax :10%");
            } else if (a >= 500000) {
                System.out.println("your income tax:20%");
            } else {
                System.out.println("your income tax: 30%");
            }
        }
    }
}
