import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class stringfunctions {

    public static void main(String[] args) {
        // --- 1. isPalindrome (using length() and charAt()) ---
        System.out.println("## 1. Palindrome Check ##");
        String s1 = "racecar";
        String s2 = "hello";
        System.out.println("Is '" + s1 + "' a palindrome? " + isPalindrome(s1));
        System.out.println("Is '" + s2 + "' a palindrome? " + isPalindrome(s2));
        System.out.println("---");

        // --- 2. findPermutations (using substring()) ---
        System.out.println("\n## 2. String Permutations ##");
        System.out.println("Permutations for 'abc':");
        findPermutations("", "abc");
        System.out.println("---");

        // --- 3. areAnagrams (using toCharArray()) ---
        System.out.println("\n## 3. Anagram Check ##");
        String ana1 = "listen";
        String ana2 = "silent";
        String ana3 = "hello";
        String ana4 = "world";
        System.out.println("Are '" + ana1 + "' and '" + ana2 + "' anagrams? " + areAna(ana1, ana2));
        System.out.println("Are '" + ana3 + "' and '" + ana4 + "' anagrams? " + areAna(ana3, ana4));
        System.out.println("---");
        
        // --- 4. wordFrequencyCounter (using split()) ---
        System.out.println("\n## 4. Word Frequency Counter ##");
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Counting words in: '" + sentence + "'");
        wordFrequency(sentence);
        System.out.println("---");

        // --- 5. compressString (using StringBuilder) ---
        System.out.println("\n## 5. String Compression ##");
        String toCompress = "aaabbccccca";
        System.out.println("Compressing '" + toCompress + "': " + compressString(toCompress));
        System.out.println("---");
    }

    /**
     * Checks if a string is a palindrome using length() and charAt().
     */
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Finds all permutations of a string using recursion and substring().
     */
    public static void findPermutations(String prefix, String suffix) {
        if (suffix.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < suffix.length(); i++) {
                String newPrefix = prefix + suffix.charAt(i);
                String newSuffix = suffix.substring(0, i) + suffix.substring(i + 1);
                findPermutations(newPrefix, newSuffix);
            }
        }
    }

    /**
     * Checks if two strings are anagrams using toCharArray() and Arrays.sort().
     */
    public static boolean areAna(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] charArray1= s1.toCharArray();
        char[] charArray2= s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
    
    /**
     * Counts word frequency using split().
     */
    public static void wordFrequency(String sentence) {
        String[] words = sentence.toLowerCase().split("\\s+");
        Map<String,Integer> freqMap=new HashMap<>();
        for(String word:words){
            freqMap.put(word,freqMap.getOrDefault(word,0)+1);
        }
        System.out.println(freqMap);

    }
    
    /**
     * Compresses a string using a StringBuilder for efficient concatenation.
     */
    public static String compressString(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }
        compressed.append(s.charAt(s.length() - 1));
        compressed.append(count);
        
        String result = compressed.toString();
        // Return original string if compressed version is not smaller
        return result.length() < s.length() ? result : s;
    }
}