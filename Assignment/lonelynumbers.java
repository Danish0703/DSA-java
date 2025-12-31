
import java.util.ArrayList;
import java.util.Collections;

public class lonelynumbers {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        // Step 1: Sort the list - O(N log N)
        Collections.sort(nums);

        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.size();

        // Step 2: Traverse and check neighbors
        for (int i = 0; i < n; i++) {
            if (i > 0 && (nums.get(i - 1).equals(nums.get(i)) || nums.get(i - 1) + 1 == nums.get(i))) {
                continue;
            }
            if (i < n - 1 && (nums.get(i + 1).equals(nums.get(i)) || nums.get(i + 1) - 1 == nums.get(i))) {
                continue;
            }
            result.add(nums.get(i));

        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(11);
        list.add(8);

        System.out.println(findLonely(list)); // Output: [8, 10] (Order might vary depending on logic, but sorted here)
    }
}
