public class check_if_number_is_2_to_power_or_not {

    public static boolean checkNumnber(int n ){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(checkNumnber(15));
    }
}