
import java.util.ArrayList;

class pairsum {

    public static boolean pairsum(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                System.out.println("Pair found: " + list.get(left) + "," + list.get(right));
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No such pair found");
        return false;
    }

    public static boolean unoptimisedpairsum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println("Pair found: " + list.get(i) + "," + list.get(j));
                    return true;
                }
            }
        }
        System.out.println("No such pair found");
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        unoptimisedpairsum(list, target);
        pairsum(list, target);

    }

}
