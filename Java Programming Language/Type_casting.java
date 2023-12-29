public class Type_casting {
    public static void main(String arg[]) {
        // float a = 23.45f;
        // int b = (int) a;
        // System.out.println(b);
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + ",");
        System.out.print(exp2);
    }
}
