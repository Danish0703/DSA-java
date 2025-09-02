
public class substringwithsse {

    public static long checkSubstring(String str, int start, int end) {
        if (start == str.length()) {
            return 0;
        }
        if (end == str.length()) {
            return checkSubstring(str, start + 1, start + 1);
        }
        long count = 0;
        if (str.charAt(start) == str.charAt(end)) {
            count += 1;
        }
        return count + checkSubstring(str, start, end + 1);

    }

    public static void main(String[] args) {
        String str = "abcab";
        long result = checkSubstring(str, 0, 0);
        System.out.println("Number of palindromic substrings: " + result);
    }

}
