1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0){
4            return false;
5        }
6        int rev=0;
7        int num=x;
8        while(num!=0){
9            rev=rev*10 + num%10;
10            num=num/10;
11        }
12        return (rev==x);
13    }
14}