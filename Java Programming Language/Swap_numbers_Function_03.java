public class Swap_numbers_Function_03 {

    public static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" a is " + a);
        System.out.println(" b is " + b);
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 10;
        System.out.println(a);
        System.out.println(b);
        Swap(a, b);
    }
}