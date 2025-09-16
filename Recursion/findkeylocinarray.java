
public class findkeylocinarray {

    public static void findkey(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        findkey(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 3};
        int key = 3;
        findkey(arr, key, 0);
    }
}
