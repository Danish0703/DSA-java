import java.util.*;
public class matrices{

    public static int maxMin(int mtrx[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(max < mtrx[i][j]){
                    max=mtrx[i][j];
                }
            }
            System.out.println();
            return max;
        }
    }
0
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mtrx[][] = new int[3][3];
        int n=mtrx.length,m=mtrx[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mtrx[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mtrx[i][j] + " ");
                System.out.println(mtrx);
            }
            System.out.println();
        }

    }
}