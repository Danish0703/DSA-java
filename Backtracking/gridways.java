
public class gridways {

    public static int countways(int i, int j, int n, int m) {
        //base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        //recursion
        int downways = countways(i + 1, j, n, m);
        int rightways = countways(i, j + 1, n, m);
        return downways + rightways;
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(countways(0, 0, n, m));
    }
}
