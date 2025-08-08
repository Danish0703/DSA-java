import java.util.*;
public class lexical{
    public static void main(String[] args){
        String frts[]={"apple","banana","mango"};
        String largest=frts[0];
        for(int i=1;i<frts.length;i++){
            if(largest.compareTo(frts[i])< 0){
                largest=frts[i];
            }
        }
        System.out.print(largest);
    }
}