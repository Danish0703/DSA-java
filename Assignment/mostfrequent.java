
import java.util.*;

class mostfrequent {

    public static int MostFrequent(ArrayList<Integer> nums, int key) {
        int count[] = new int[1001];
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                int target = nums.get(i + 1);
                count[target]++;
            }
        }
        int maxScore = 0;
        int winningNumber = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxScore) {
                maxScore = count[i];
                winningNumber = i;
            }
        }
        return winningNumber;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        int key = 1;
        System.out.println(MostFrequent(list, key));

    }
}
