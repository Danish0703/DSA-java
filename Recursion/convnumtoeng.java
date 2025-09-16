
public class convnumtoeng {

    public static void printdigits(int n, String[] nums) {
        if (n == 0) {
            return;
        }
        printdigits(n / 10, nums);
        int lastdigit = n % 10;
        System.out.print(nums[lastdigit] + " ");
    }

    public static void main(String[] args) {
        String nums[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        printdigits(154, nums);
    }
}
