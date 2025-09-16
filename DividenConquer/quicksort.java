
public class quicksort {

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int p = partition(arr, si, ei);
        quickSort(arr, si, p - 1);
        quickSort(arr, p + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
