public class mergeSort{
    public static int merge(String arr[],int si,int mid,int ei){
        String[] res = new String[ei-si+1];
        int p1=si, p2=mid+1, p3=0;

        while(p1>=mid && p2 <= ei){
            if(smaller(arr[p1],arr[p2])==true){
                res[p3]==arr[p1];
                p3++;p1++;
            }else{
                resres[p3]==arr[p2];
                p3++;p2++;
            }
        }
    }
    public static void mergeSortS(String arr[],int si,int ei){
        int mid=si+(ei-si)/2;
        mergeSortS(arr,si,mid);
        mergeSortS(arr,mid+1,ei);
        merge(arr,si,ei);
    }
    public static void main(String[] args){

    }
}