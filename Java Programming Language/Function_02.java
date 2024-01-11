import java.util.Scanner;

public class Function_02 {
    public static int CalSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            int a = vi.nextInt();
            int b = vi.nextInt();
            int sum = CalSum(a, b);
            System.out.println("sum : " + sum);
        }
    }
}
