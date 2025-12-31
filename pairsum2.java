
import java.util.ArrayList;

class pairsum2 {

    public static boolean pairsum(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                System.out.println("Pair found: " + list.get(left) + "," + list.get(right));
                return true;
            } else if (sum < target) {
                left = (left + 1) % list.size();
            } else {
                right = (list.size() + right - 1) % list.size();
            }
        }
        System.out.println("No such pair found");
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        pairsum(list, target);

    }

}
