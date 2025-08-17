public class remdup {

    public static int removeDuplicates(int arr[]) {
        int i = 0;
        if (arr.length == 0 || arr.length == 1) {
            return 0;
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }

        }
        return i + 1; // Return the new length of the array
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5};
        int rem = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < rem; i++) {
            System.out.print(arr[i] + " ");
        }

        

    }
}
