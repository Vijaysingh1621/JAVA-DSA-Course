public class Print_factorial_using_Recursion {
    public static int PrintFact(int n){
        if(n==0){
            
            return 1;
        }
        
            int fact1= PrintFact(n-1);
            int factn= n*PrintFact(n-1);
          return factn;

        
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(PrintFact(n));
    }
}
