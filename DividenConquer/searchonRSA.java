class searchonRSA{
    public static int searchOnRsa(int arr[],int si,int ei,int target){
        if(si>ei){
            return -1;
        }
        int mid= si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return searchOnRsa(arr,si,mid-1,target);
            }else{
                return searchOnRsa(arr,mid+1,ei,target);
            }
        }else{
            if(arr[mid]<=target && target<=arr[ei]){
                return searchOnRsa(arr,mid+1,ei,target);
            }else{
                return searchOnRsa(arr,si,mid-1,target);
            }
        }
    }
    public static void main(String[] args){
        int arr[]={10,11,12,13};
        int target=10;
        System.out.println(searchOnRsa(arr,0,arr.length-1,target));
    }
}