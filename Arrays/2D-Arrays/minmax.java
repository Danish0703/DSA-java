import java.util.*;
public class matrices{

    public static void maxMin(int mtrx[][]){
        int n=mtrx.length,m=mtrx[0].length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(max < mtrx[i][j]){
                    max=mtrx[i][j];
                }
                if(min > mtrx[i][j]){
                    min=mtrx[i][j];
                }
                if(mtrx[i][j]==7){
                    count++;
                }
            }
            
        }
        System.out.println("MAXIMUM ELEMENT:" +max);
        System.out.println("MINIMUM ELEMENT:" +min);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mtrx[][] = new int[3][3];
        int n=mtrx.length,m=mtrx[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mtrx[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mtrx[i][j] + " ");
                
            }
            System.out.println();
        }
        maxMin(mtrx);

    }
}