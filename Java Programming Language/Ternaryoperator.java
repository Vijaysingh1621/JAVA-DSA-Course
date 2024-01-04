import java.util.Scanner;

public class Ternaryoperator {

    public static void main(String arg[]) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("enter the number");
            int a = vi.nextInt();
            String type = (a % 2 == 0) ? "even" : "odd";
            System.out.println(type);
        }

    }
}