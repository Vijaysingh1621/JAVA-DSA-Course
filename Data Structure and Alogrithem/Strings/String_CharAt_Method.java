import java.util.Scanner;

public class String_CharAt_Method {
    public static void printletter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner vi = new Scanner(System.in);
        System.out.println("enter name");
        String str = vi.nextLine();
        printletter(str);
    }
}
