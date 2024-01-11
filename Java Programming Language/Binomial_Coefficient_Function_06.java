import java.util.Scanner;

public class Binomial_Coefficient_Function_06 {
    public static int BinomialCoeff(int n, int r) {
        int N = 1;
        int R = 1;
        for (int i = 1; i <= n; i++) {
            N = N * i;
        }
        for (int i = 1; i <= r; i++) {
            R = R * i;
        }
        int D = 1;
        for (int i = 1; i <= (n - r); i++) {
            D = D * i;
        }
        int coeff = N / (R * D);
        return coeff;
    }

    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("Enter the numbers");
            int n = vi.nextInt();
            int r = vi.nextInt();
            int BinoCoeff = BinomialCoeff(n, r);
            System.out.println("Binomial coefficient : " + BinoCoeff);
        }
    }
}
