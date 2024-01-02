import java.util.Scanner;

public class javabascis_11 {
    public static void main(String arg[]) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("enter the number");
            int a = vi.nextInt();
            if (a % 2 == 0) {
                System.out.println("even");

            } else {
                System.out.println("odd");
            }
        }
    }

}
