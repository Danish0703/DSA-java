
import java.util.*;

public class MaxSubArr {

    public static void maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = 1;
            for (int j = i; j < arr.length; j++) {
                int end = 3;
                currSum = i == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 11, 13, 15};
        maxSubArraySum(arr);
    }
}
