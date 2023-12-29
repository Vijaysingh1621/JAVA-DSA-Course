import java.util.Scanner;

public class javabascics_sum {
    public static void main(String arg[]) {
        // cal of sum
        int a = 5;
        int b = 8;
        int sum = a + b;
        System.out.println(sum);

        try (Scanner vi = new Scanner(System.in)) {
            int c = vi.nextInt();
            int d = vi.nextInt();
            int sum_ = c + d;
            System.out.println(sum_);
        }
    }
}
