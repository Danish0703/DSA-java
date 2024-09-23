
import java.util.*;

public class Assignment {

    // Question 1: Check if the array contains any duplicates
    // Explanation: Sort the array and check if any consecutive elements are the same.
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    // Question 2: Search in Rotated Sorted Array
    // Explanation: Use binary search to find the target in a rotated sorted array.
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    // Question 3: Best Time to Buy and Sell Stock
    // Explanation: Track the minimum price and calculate the maximum profit.
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    // Question 4: Trapping Rain Water
    // Explanation: Use two pointers to calculate the trapped water.
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    // Question 5: 3Sum
    // Explanation: Find all unique triplets in the array which gives the sum of zero.
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Assignment assignment = new Assignment();

        // Test Question 1
        System.out.println("Question 1:");
        System.out.println("Contains Duplicate [1, 2, 3, 1]: " + assignment.containsDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println("Contains Duplicate [1, 2, 3, 4]: " + assignment.containsDuplicate(new int[]{1, 2, 3, 4})); // false

        // Test Question 2
        System.out.println("\nQuestion 2:");
        System.out.println("Search [4, 5, 6, 7, 0, 1, 2], target 0: " + assignment.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)); // 4
        System.out.println("Search [4, 5, 6, 7, 0, 1, 2], target 3: " + assignment.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)); // -1

        // Test Question 3
        System.out.println("\nQuestion 3:");
        System.out.println("Max Profit [7, 1, 5, 3, 6, 4]: " + assignment.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5
        System.out.println("Max Profit [7, 6, 4, 3, 1]: " + assignment.maxProfit(new int[]{7, 6, 4, 3, 1})); // 0

        // Test Question 4
        System.out.println("\nQuestion 4:");
        System.out.println("Trap [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]: " + assignment.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1})); // 6
        System.out.println("Trap [4, 2, 0, 3, 2, 5]: " + assignment.trap(new int[]{4, 2, 0, 3, 2, 5})); // 9

        // Test Question 5
        System.out.println("\nQuestion 5:");
        System.out.println("Three Sum [-1, 0, 1, 2, -1, -4]: " + assignment.threeSum(new int[]{-1, 0, 1, 2, -1, -4})); // [[-1, -1, 2], [-1, 0, 1]]
        System.out.println("Three Sum []: " + assignment.threeSum(new int[]{})); // []
        System.out.println("Three Sum [0]: " + assignment.threeSum(new int[]{0})); // []
    }
}
