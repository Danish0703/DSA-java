
public class subsets {

    public static void findsubsets(String str, int i, String curr) {
        //base case
        if (i == str.length()) {
            if (curr.isEmpty()) {
                System.out.println("null");
            } else {
                System.out.println(curr);
            }
            return;
        }
        //recursion
        //to be
        findsubsets(str, i + 1, curr + str.charAt(i));
        //not to be
        findsubsets(str, i + 1, curr);
    }

    public static void main(String args[]) {
        String str = "abc";
        findsubsets(str, 0, "");
    }
}
