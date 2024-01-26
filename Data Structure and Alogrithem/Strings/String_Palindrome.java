import java.util.Scanner;

public class String_Palindrome {
    public static boolean ispalindrome(String name) {
        char str1, str2;
        for (int i = 0; i < name.length(); i++) {
            str1 = name.charAt(i);
            for (int j = name.length() - 1; j > 0; j--) {
                str2 = name.charAt(j);
                if (str1 == str2) {
                    System.out.println("palindrome");
                    return true;
                    

                }
            }
        }
        System.out.println("not palindrome");
        return false;

    }

    public static void main(String[] args) {
        Scanner vi = new Scanner(System.in);
        System.out.println("enter word");
        String name = vi.nextLine();
        System.out.println(ispalindrome(name));

    }
}
