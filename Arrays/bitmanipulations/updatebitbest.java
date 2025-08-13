import java.util.*;
public class updatebitbest{

    public static int clearBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }

    public static int updateBit(int n,int i,int newBit){
        int n=clearBit(n,i);
        int bitMask=newBit<<i;
        return n|bitMask;
        
    }

    public static void main(String[] args){

        System.out.println(updateBit(10,3,0));

    }
}