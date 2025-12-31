
import java.util.ArrayList;

class monotonic {

    public static boolean IsMonotonic(ArrayList<Integer> nums) {
        boolean IsIncreasing = true;
        boolean IsDecreasing = true;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) < nums.get(i + 1)) {
                IsDecreasing = false;
            }
            if (nums.get(i) > nums.get(i + 1)) {
                IsIncreasing = false;
            }

        }
        return IsIncreasing || IsDecreasing;

    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(6);
        nums.add(2);
        nums.add(3);
        System.out.println(IsMonotonic(nums));
    }
}
