public class sum{
    public static int sumOfN(int n){
        if(n==1){
            return 1;
        }
        int snm1=sumOfN(n-1);
        int sn=n+sumOfN(n-1);
        return sn;

    }
    public static void main(String[] args){
        System.out.println(sumOfN(2));

    }
}