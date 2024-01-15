public class Pairs_in_Array_07 {
    public static void PairArr(int numbers[]) {
        int curr = 0;
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                curr = numbers[i];
                System.out.print("(" + curr + "," + numbers[j] + ")");
                total++;

            }
            System.out.println();

        }

        System.out.println("total pair :" + total);
    }

    public static void main(String[] args) {
        int numbers[] = { 3, 4, 5, 6, 7, 8 };
        PairArr(numbers);
    }

}
