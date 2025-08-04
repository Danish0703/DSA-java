import java.util.*;

public class kaDane {

    public static void kadane(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum Subarray Sum using Kadane's Algorithm = " + ms);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        kadane(arr);
    }
}
