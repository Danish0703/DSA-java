
public class mergeSort {

    public static boolean smaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String[] res = new String[ei - si + 1];
        int p1 = si, p2 = mid + 1, p3 = 0;

        while (p1 <= mid && p2 <= ei) {
            if (smaller(arr[p1], arr[p2]) == true) {
                res[p3] = arr[p1];
                p3++;
                p1++;
            } else {
                res[p3] = arr[p2];
                p3++;
                p2++;
            }
        }
        while (p1 <= mid) {
            res[p3] = arr[p1];
            p3++;
            p1++;
        }
        while (p2 <= ei) {
            res[p3] = arr[p2];
            p3++;
            p2++;
        }
        for (int i = 0, j = si; i < res.length; i++, j++) {
            arr[j] = res[i];
        }
    }

    public static void mergeSortS(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSortS(arr, si, mid);
        mergeSortS(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury", "jupiter"};
        mergeSortS(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
