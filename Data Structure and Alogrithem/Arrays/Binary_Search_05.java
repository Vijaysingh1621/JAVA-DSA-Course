import java.util.Scanner;

public class Binary_Search_05 {
    public static int BinarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            System.out.println("Enter the key");
            int key = vi.nextInt();
            int numbers[] = { 23, 25, 43, 87, 56, 39 };
            int index = BinarySearch(numbers, key);
            System.out.println("index for the key :" + index);
        }
    }

}
