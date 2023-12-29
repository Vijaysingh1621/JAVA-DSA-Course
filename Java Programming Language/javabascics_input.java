import java.util.Scanner;

public class javabascics_input {
    public static void main(String arg[]) {
        try (// takimg input
                Scanner vi = new Scanner(System.in)) {
            String name = vi.nextLine();
            System.out.println(name);
        }
    }
}
