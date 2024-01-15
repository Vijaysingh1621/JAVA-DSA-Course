import java.util.Scanner;

public class Array_Linear_Search_03 {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            int numbers[] = { 23, 24, 67, 45, 56 };
            System.out.println("enter the key");
            int key = vi.nextInt();
            int index = linearSearch(numbers, key);
            if (index == -1) {
                System.out.println("key not found");
            } else {
                System.out.println("key found at :" + index);
            }
        }

    }
}