import java.util.Scanner;

public class String_Palindrome_bigO_n {
    public static boolean ispalindrome(String name){
        int n=name.length();
        for(int i=0;i<=n/2;i++){
            if(name.charAt(i)!=name.charAt(n-1-1)){
                return false;
            }
        
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner vi = new Scanner(System.in)) {
            String name=vi.nextLine();
            System.out.println(ispalindrome(name));
        }
    }
    

    
}
