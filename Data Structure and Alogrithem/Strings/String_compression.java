public class String_compression {
    public static String stringCompression(String str){
        int sb=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                sb++;
            }
        }
        String si=Integer.toString(sb);
        return si;
    }
    public static void main(String[] args) {
        String str="aaaaa";
        System.out.println(stringCompression(str));
    }
}
