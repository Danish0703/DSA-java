
public class inversioncount {

    public static int merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        int pairs = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                pairs += mid - i + 1;
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
        return pairs;
    }

    public static int mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return 0;
        }
        int mid = si + (ei - si) / 2;
        int ans = 0;
        ans += mergeSort(arr, si, mid);
        ans += mergeSort(arr, mid + 1, ei);
        ans += merge(arr, si, mid, ei);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 1, 3, 5};
        int n = arr.length;
        System.err.println(mergeSort(arr, 0, n - 1));

    }
}
