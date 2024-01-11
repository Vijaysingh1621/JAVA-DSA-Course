import java.util.Scanner;

public class Decimal_to_Binary {
    public static int dectoBin(int n) {
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;

            n = n / 2;

        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner vi = new Scanner(System.in);
        System.out.println("enter the number");
        int n = vi.nextInt();
        int bin = dectoBin(n);
        System.out.println("binary of " + n + " : " + bin);
    }
}
