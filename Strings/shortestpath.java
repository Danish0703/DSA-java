import java.util.*;
public class shortestpath{
    public static void shrtpath(String path){
        int X=0,Y=0;
        for(int i=0;i<str.length();i++){
            char dir=path.charAt(i);
            if(dir=="N"){
                Y++;
            }else if(dir=="E"){
                X++;
            }else if(dir=="W"){
                
            }
        }
        System.out.println("true");
        return true;
    }
    public static void main(String[] args){
        String path="WNEENESENNN";
        pldrm(strpath(path));

    }
}