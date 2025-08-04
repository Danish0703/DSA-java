
import java.util.*;

public class max {

    public static int maxSoFar(int arr[]) {
        if (arr.length == 0 || arr.length == 1) {
            return 0;
        }
        int maxsofar = arr[0];
        int currmax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currmax = Math.max(arr[i], currmax + arr[i]);
            maxsofar = Math.max(currmax, maxsofar);
        }
        return maxsofar;
    }

    public static void main(String args[]) {
        int arr[] = {1, -2, 3, 5, 6, 3};
        System.out.println(maxSoFar(arr));

    }
}
