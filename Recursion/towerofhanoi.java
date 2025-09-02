
public class towerofhanoi {

    public static int towerOfHanoi(int n, char source, char destination, char aux) {
        if (n == 1) {
            System.out.println("Mpve disk1 from " + source + " to " + destination);
            return 1;
        }
        int moves = towerOfHanoi(n - 1, source, aux, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moves += towerOfHanoi(n - 1, aux, destination, source);
        return moves;
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}
