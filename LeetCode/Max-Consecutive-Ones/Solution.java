1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int i=0;
4        int j=0;
5        int count=0;
6        int max=0;
7        while(j<nums.length){
8            if(nums[j]==1){
9                count=j-i+1;
10                max=Math.max(count,max);
11            }else{
12                i=j+1;
13                count=0;
14            }
15            j++;
16        }return max;
17        
18    }
19}