import java.util.Scanner;

public class area_of_square {

    public static void main(String arg[]) {
        try (Scanner vi = new Scanner(System.in)) {
            int a = vi.nextInt();
            int area = a * a;
            System.out.println(area);
        }
    }
}