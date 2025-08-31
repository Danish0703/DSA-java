
public class lengthofstring {

    public static int getLength(String str) {
        if (str.equals("")) {
            return 0;
        }
        return 1 + getLength(str.substring(1));
    }

    public static void main(String[] args) {
        String testString = "Hello, world!";
        int length = getLength(testString);
        System.out.println("Length of the string: " + length);
    }
}
