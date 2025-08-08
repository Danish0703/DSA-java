import java.util.*;
public class shortestpath{
    public static float shrtpath(String path){
        int X=0,Y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='N'){
                Y++;
            }else if(dir=='E'){
                X++;
            }else if(dir=='W'){
                X--;
            }else{
                Y--;
            }
        }
        int X2=X*X;
        int Y2=Y*Y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args){
        String path="WNEENESENNN";
         System.out.println(shrtpath(path));

    }
}