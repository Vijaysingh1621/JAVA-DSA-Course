public class Clear_lasth_Ith_bit {
    public static int clearLastIthbit(int n , int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIthbit(3,1));
    }
}
