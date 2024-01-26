public class Daigonal_Matrix_Sum {

    // Method 1 ( Brute Force ) having Time complexitiy much higher O(n^2)
    public static int DaigonalSum1(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }

            }

        }
        return sum;
    }

    // Mathod 2 Having lower time complexitity O(n)
    public static int daigonalSum2(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // Primary daigonal Sum
            sum += matrix[i][i];
            // Seconday daigonal sum

            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(daigonalSum2(matrix));
    }
}
