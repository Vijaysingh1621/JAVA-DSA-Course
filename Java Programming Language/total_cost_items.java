import java.util.Scanner;

public class total_cost_items {
    public static void main(String arg[]) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("enter price of pencil");
            float a = vi.nextFloat();
            System.out.println("enter price of pen");
            float b = vi.nextFloat();
            System.out.println("enter price of eraser");
            float c = vi.nextFloat();
            float sum = a + b + c;
            System.out.println("total cost " + sum);
            System.out.println("total cost with adding 18% gst " + (sum + sum * 0.18));
        }
    }
}