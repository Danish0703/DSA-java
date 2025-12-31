// import java.util.*;
// class maxwater{
//     public static void MaxWater(ArrayList<Integer> list){
//         int max=0;
//         int height,width;
//         for(int i=0;i<list.size();i++){
//             for(int j=i+1;j<list.size();j++){
//                 height=Math.min(list.get(i),list.get(j));
//                 width=j-i;
//                 int waterholded=height*width;
//                 max=Math.max(max,waterholded);
//             }
//         }
//         System.out.println(max);

//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(8);
//         list.add(6);
//         list.add(2);
//         list.add(5);
//         list.add(4);
//         list.add(8);
//         list.add(3);
//         list.add(7);
//         MaxWater(list);
//     }
// }
import java.util.*;

class maxwater {

    public static void MaxWater(ArrayList<Integer> list) {
        int max = 0;
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int height = Math.min(list.get(left), list.get(right));
            int width = right - left;
            int waterholded = height * width;
            max = Math.max(max, waterholded);
            if (list.get(left) < list.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        MaxWater(list);

    }
}
