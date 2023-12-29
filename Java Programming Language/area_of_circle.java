import java.util.Scanner;

public class area_of_circle {
    public static void main(String arg[]) {
        try (// area of circle
                Scanner vi = new Scanner(System.in)) {
            int radius = vi.nextInt();
            float area = (3.14f) * (radius) * (radius);
            System.out.println(area);
        }

    }

}
