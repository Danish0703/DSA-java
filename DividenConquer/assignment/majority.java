
public class majority {

    private int getCount(int nums[], int left, int right, int num) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private int majorityElement(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int mid = left + (right - left) / 2;
        int leftMajor = majorityElement(nums, left, mid);
        int rightMajor = majorityElement(nums, mid + 1, right);
        if (leftMajor == rightMajor) {
            return leftMajor;
        }
        int countLeft = getCount(nums, left, right, leftMajor);
        int countRight = getCount(nums, left, right, rightMajor);
        if (countLeft > countRight) {
            return leftMajor;
        } else {
            return rightMajor;
        }
    }

    public int majorityElement(int[] nums) {
        return majorityElement(nums, 0, nums.length - 1);
    }

    // Example usage
    public static void main(String[] args) {
        majority sol = new majority();
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int result = sol.majorityElement(arr);
        System.out.println("Majority Element: " + result);
    }
}
