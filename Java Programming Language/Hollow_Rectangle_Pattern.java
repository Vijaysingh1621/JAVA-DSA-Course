import java.util.Scanner;

public class Hollow_Rectangle_Pattern {
    public static void HollowRect(int Rows, int Cols) {
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Cols; j++) {
                if (i == 1 || i == Rows || j == 1 || j == Cols) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner vi = new Scanner(System.in);
        System.out.println("Enter colums");
        int Rows = vi.nextInt();
        System.out.println("Enter rows");
        int Cols = vi.nextInt();
        HollowRect(Rows, Cols);

    }

}
