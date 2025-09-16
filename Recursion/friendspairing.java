
public class friendspairing {

    public static int countFriendsPairings(int n) {
        if (n <= 2) {
            return n;
        }

        // Pairing the nth friend with any of the (n-1) friends
        // or not pairing the nth friend
        return countFriendsPairings(n - 1) + (n - 1) * countFriendsPairings(n - 2);
    }

    public static void main(String[] args) {
        int n = 4; // Example: 4 friends
        int ways = countFriendsPairings(n);
        System.out.println("Number of ways to pair friends: " + ways);
    }
}
