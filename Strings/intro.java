import java.util.*;
public class intro{
    public static void charAtt(String naam){
        for(int i=0;i<naam.length();i++){
            System.out.println(naam.charAt(i)+" ");
        }
    }
    public static void main(String[] args){
        String name = "Danish";
        String name1 =  new String("Faizan");
        System.out.println(name+" "+name1);
        System.out.println("naam:");
        Scanner sc = new Scanner(System.in);
        String naam;
        naam=sc.nextLine();
        System.out.println(naam);
        charAtt(naam);

    }
}