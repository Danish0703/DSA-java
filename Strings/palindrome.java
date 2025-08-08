import java.util.*;
public class palindrome{
    public static boolean pldrm(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String naam;
        naam=sc.nextLine();
        String str=naam.toLowerCase();
        pldrm(str);

    }
}