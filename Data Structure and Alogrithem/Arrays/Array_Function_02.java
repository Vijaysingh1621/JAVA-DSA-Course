public class Array_Function_02 {
    public static void Update(int marks[]) {
        for (int i = 0; i <= marks.length; i++) {
            marks[i] = marks[i] + 1;
        }

    }

    public static void main(String[] args) {
        int marks[] = { 99, 67, 45 };
        System.out.print(marks);
        Update(marks);
        for (int i = 0; i <= marks.length; i++) {
            System.out.print(marks[i] + " ");

        }
        System.out.println();
    }
}
