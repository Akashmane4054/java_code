package Strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        String input = "abcabcbb";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }

    public static String findLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0;
        HashSet<Character> charSet = new HashSet<>();
        String longestSubstring = "";

        while (right < n) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                right++;
                if (right - left > longestSubstring.length()) {
                    longestSubstring = s.substring(left, right);
                }
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }

        return longestSubstring;
    }
}
