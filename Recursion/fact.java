public class fact{

    public static int factOfN(int n){
        if(n==0){
            return 1;
        }
        int fnm1=factOfN(n-1);
        int fn=n*factOfN(n-1);
        return fn;
    }



    public static void main(String[] args){
        System.out.println(factOfN(5));

    }
}