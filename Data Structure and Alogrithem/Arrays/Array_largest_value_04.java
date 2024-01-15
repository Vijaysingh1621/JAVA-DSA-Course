public class Array_largest_value_04 {
    public static int Getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];

            }

        }
        System.out.println("Smallest value :" + smallest);
        return largest;

    }

    public static void main(String[] args) {
        int numbers[] = { 45, 87, 98, 63, 92 };
        int largest = Getlargest(numbers);
        System.out.println("largest value :" + largest);

    }
}
