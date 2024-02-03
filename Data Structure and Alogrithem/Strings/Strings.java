
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("Enter name");
            String name = vi.nextLine();
            System.out.println(name);
            System.out.println(name.length());
        }

    }

}
