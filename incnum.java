
public class incnum {

    public static void incNum(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        incNum(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        incNum(8);

    }

}
