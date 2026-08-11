1class Solution {
2    public int maxArea(int[] height) {
3        int i=0;
4        int j=height.length-1;
5        int maxwater=Integer.MIN_VALUE;
6        int min=0;
7        while(i<j){
8            min=Math.min(height[i],height[j]);
9            int width=j-i;
10            int water=min*width;
11            maxwater=Math.max(maxwater,water);
12            if(height[i]<=height[j]){
13                i++;
14            }else{
15                j--;
16            }
17        }
18        return maxwater;
19    }
20}