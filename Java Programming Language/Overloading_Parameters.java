public class Overloading_Parameters {
    public static int Sum(int a, int b, int c) {
        return a + b + c;

    }

    public static float Sum(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(Sum(3.45f, 4.34f, 5.45f));
    }
}
