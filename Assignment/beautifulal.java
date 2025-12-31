
import java.util.*;

class beautifulal {

    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        while (ans.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int x : ans) {
                if (2 * x - 1 <= n) {
                    temp.add(2 * x - 1);
                }
            }

            for (int x : ans) {
                if (2 * x <= n) {
                    temp.add(2 * x);
                }
            }
            ans = temp;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(beautifulArray(4));

    }
}
