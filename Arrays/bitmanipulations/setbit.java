import java.util.*;
public class setbit{

    public static int setBit(int n,int i){
        int bitMask=1<<i;
        return n|i;
    }

    public static void main(String[] args){

        System.out.println(setBit(10,5));

    }
}