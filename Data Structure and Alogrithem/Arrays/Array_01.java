import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            int marks[] = new int[50];
            marks[0] = vi.nextInt();
            marks[1] = vi.nextInt();
            marks[2] = vi.nextInt();
            System.out.println("phy :" + marks[0]);
            System.out.println("chem :" + marks[1]);
            System.out.println("maths:" + marks[2]);
        }

    }

}
