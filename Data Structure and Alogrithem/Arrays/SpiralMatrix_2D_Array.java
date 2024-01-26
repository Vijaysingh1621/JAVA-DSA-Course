public class SpiralMatrix_2D_Array {
    public static void printSpiral(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;
        while (startCol <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(arr[endRow][j] + " ");
            }
            // Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(arr[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printSpiral(arr);
    }

}
