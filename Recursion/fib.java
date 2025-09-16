public class fib{

    public static int fibOfN(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1=fibOfN(n-1);
        int fibnm2=fibOfN(n-2);
        int fibn=fibOfN(n-1)+fibOfN(n-2);
        return fibn;

    }
    public static void main(String[] arrgs){
        System.out.println(fibOfN(10));

    }
}