import java.util.*;
public class staircase{

    public static boolean stairCase(int mtrx[][],int key){
        int row=0;
        int col=mtrx[0].length-1;
        while(row<mtrx.length&&col>=0){
            if(mtrx[row][col]==key){
                System.out.println("key found at"+row+","+col);
                return true;
            }else if(key<mtrx[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;

        
    }
    public static void main(String[] args){
    int mtrx[][]={{10,20,30,40},
    {15,25,35,45},
    {27,29,37,48},
    {32,33,39,50}};
    int key =30;
    stairCase(mtrx,key);

    }
}