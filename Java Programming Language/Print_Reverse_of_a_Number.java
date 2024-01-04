import java.util.Scanner;

public class Print_Reverse_of_a_Number {
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("enter the number");
            int n = vi.nextInt();
            System.out.println("reverse of the number1234");
            while (n > 0) {
                int last_digit = n % 10;
                System.out.print(last_digit);
                n = n / 10;

            }
            // METHOD 2
            // int rev=0;
            // while(n>0){
            // last digit = n%10;
            // rev = (rev*10)+last digit;
            // n = n/10;
        }

    }
}
