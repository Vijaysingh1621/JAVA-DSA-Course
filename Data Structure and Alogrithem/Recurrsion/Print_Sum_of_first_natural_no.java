public class Print_Sum_of_first_natural_no {

    public static int PrintFirstSum(int n){
        if(n==1){
            return 1;
        }
        int sum=+PrintFirstSum(n-1);
        int totalSum=n+PrintFirstSum(n-1);
        return totalSum;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(PrintFirstSum(n));
    }
}