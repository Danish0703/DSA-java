import java.util.*;
public class pairs{

    public static void paris(int numb[]){
        for(int i=0;i<numb.length;i++){
            int crt=numb[i];
            for(int j=i+1;j<numb.length;j++){
                System.out.print("("+crt+","+j+")");
            }
            System.out.println();   
        }
    }
    public static void main(String[] args){
        int numb[] ={10,11,14,16};
        paris(numb);
    }
}