
import java.util.Scanner;

public class Input_By_User_2D_Matrix {

    public static boolean search(int arr[][], int key) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("key found at (" + i + "," + j + ")");
                    return true;
                }
            }

        }
        System.out.println("key not found");
        return false;

    }

    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("Enter Rows Of Matrix");
            int a = vi.nextInt();
            System.out.println("enter colums of matrix");
            int b = vi.nextInt();
            int arr[][] = new int[a][b];
            int n = arr.length, m = arr[0].length;

            System.out.println("Enter the number");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = vi.nextInt();
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();
            }
            System.out.println("Enter the key ");
            int key = vi.nextInt();
            search(arr, key);
        }
    }
}
