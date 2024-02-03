public class Substrings {
    public static String subString(String str , int si,int ei){
        String subStr="";
        for(int i=si;i<ei;i++){
            subStr+=str.charAt(i);

        }
        return subStr;

    }
    public static void main(String[] args) {
        String str="hi iam student at nsut";
        System.out.println(subString(str, 2, 15));
    }
}
