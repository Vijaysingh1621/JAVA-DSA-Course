import java.util.Scanner;

public class Print_Table_Of_A_Number {
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("enter the number");
            int n = vi.nextInt();
            for (int i = 1; i <= 10; i++) {

                System.out.println(n + "X" + i + "=" + n * i);
            }
        }
    }
}
