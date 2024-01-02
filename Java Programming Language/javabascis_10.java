import java.util.Scanner;

public class javabascis_10 {
    public static void main(String arg[]) {

        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("enter the value of a");
            int a = vi.nextInt();
            System.out.println("enter the value of b");
            int b = vi.nextInt();
            if (a >= b) {
                System.out.println(" a is greater than b");

            } else {
                System.out.println("b is greater than a");
            }
        }
    }

}
