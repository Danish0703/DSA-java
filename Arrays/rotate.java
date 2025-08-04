import java.util.*;
public class rotate{
    public static void rotateArray(int arr[],int k){

        int n = arr.length;
        k = k % n; 
        reverse(arr, 0, n - 1); // Reverse the entire array
        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, n - 1); // Reverse the remaining elements
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int arr[] = {2,3,6,7,9,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of positions to rotate the array:");
        int k = sc.nextInt();
        rotateArray(arr, k);
        sc.close();
    
   }
    
}