/**
 * Problem name: Valid Anagram
 * Problem link: https://leetcode.com/problems/valid-anagram/
 */

package LeetCode;

import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            freqS[s.charAt(i) - 'a']++;
            freqT[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++)
            if (freqS[i] != freqT[i])
                return false;
        return true;
    }
}