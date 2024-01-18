public class Max_sub_Array_sum_01 {

    public static void PrintMaxSum(int numbers[]) {

        int start;
        int end;
        int currsum = 0;

        int Maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            start = i;
            for (int j = i + 1; j < numbers.length; j++) {
                end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {

                    currsum += numbers[k];
                    System.out.println(currsum);
                    if (Maxsum < currsum) {
                        Maxsum = currsum;

                    }

                }

            }

        }
        System.out.println("Max sum :" + Maxsum);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        PrintMaxSum(numbers);
    }
}
