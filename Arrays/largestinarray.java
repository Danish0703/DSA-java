public class largestinarray{
    public static int largestElement(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5,8,7,6};
        System.out.println("LARGEST ELEMENT:"+largestElement(numbers));
    }
        
}