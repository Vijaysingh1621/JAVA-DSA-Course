public class Sub_Arrays_08 {
    public static void Subarr(int numbers[]) {
        int start;
        int end;
        int tp = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            start = i;
            for (int j = i + 1; j < numbers.length; j++) {
                end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(+numbers[k]);
                    numbers[k] = numbers[k]++;
                    sum = numbers[k];

                    tp++;

                }

                System.out.println();
                System.out.println("sum :" + sum);
            }
            System.out.println();

        }
        System.out.println("total no. of pairs :" + tp);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 6, 7, 8 };
        Subarr(numbers);
    }
}
