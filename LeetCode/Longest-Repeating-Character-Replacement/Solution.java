1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] count = new int[26];
4        int left = 0, maxFreq = 0, maxLength = 0;
5        
6        for (int right = 0; right < s.length(); right++) {
7            // Increment the count of the current character
8            count[s.charAt(right) - 'A']++;
9            
10            // Update the maximum frequency seen in the current window
11            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);
12            
13            // If the characters we need to replace exceeds k, shrink the window
14            while ((right - left + 1) - maxFreq > k) {
15                count[s.charAt(left) - 'A']--;
16                left++;
17            }
18            
19            // Update the max valid window size found so far
20            maxLength = Math.max(maxLength, right - left + 1);
21        }
22        
23        return maxLength;
24    }
25}