import java.util.Scanner;

public class Binary_to_decimal {
    public static int BintoDec(int n) {
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int last_digit = n % 10;
            dec = dec + (last_digit * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;

        }
        return dec;

    }

    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("Enter binary number");
            int n = vi.nextInt();
            int bintodec = BintoDec(n);
            System.out.println(" decimal of " + n + "  :   " + bintodec);
        }
    }
}
