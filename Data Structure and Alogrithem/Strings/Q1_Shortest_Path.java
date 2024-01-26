

public class Q1_Shortest_Path {

    public static float shortestPath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char dir =str.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if (dir=='E') {
                x++;
                
            }
            else if (dir=='W') {
                x--;
                
            }
            else if(dir=='S') {
                y--;
                
            }
           
            
        }
            int X=x*x;
            int Y=y*y;
            return (float) Math.sqrt(Y+X);
       
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(shortestPath(str));

    }
}