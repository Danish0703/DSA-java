
public class bitmanip {

    public static int clearIbits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearItoJbits(int n, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        int bitMask = a | b;

        return n & bitMask;
    }

    public static int powerofTwo(int n) {
        if (((n) & (n - 1)) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
        return n;
    }

    public static void main(String[] args) {

        System.out.println(clearIbits(15, 2));
        System.out.println(clearItoJbits(10, 2, 4));
        System.out.println(powerofTwo(13));
    }
}
