public class check_if_number_odd_even {
    public static void checkOddEven(int n){
        int bitmask=1;
        if((n&bitmask )==1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }

    public static void main(String[] args) {
        checkOddEven(15);
    }
}
