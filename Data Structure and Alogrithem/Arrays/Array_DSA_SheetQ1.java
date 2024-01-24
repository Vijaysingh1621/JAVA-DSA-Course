public class Array_DSA_SheetQ1 {
    public static boolean containsDuplicate(int numbs[]) {
        for (int i = 0; i < numbs.length - 1; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] == numbs[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int numbs[] = { 1, 2, 4, 2, 5 };
        System.out.println(containsDuplicate(numbs));
    }
}
