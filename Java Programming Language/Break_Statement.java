public class Break_Statement {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            if (i == 3) {
                System.out.println("yes im good");
                break;

            }
        }
        System.out.println("im out of the loop");
    }
}
