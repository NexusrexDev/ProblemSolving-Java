/**
 * Problem name: Roman to Integer
 * Problem link: https://leetcode.com/problems/roman-to-integer/
 */

package LeetCode;

import java.util.*;

public class RomanToInt {
    public int romanToInt(String s) {
        int year = 0;
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1)))
                year -= romanMap.get(s.charAt(i));
            else
                year += romanMap.get(s.charAt(i));
        }
        return year;
    }
}