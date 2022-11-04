/**
 * Problem name: Word
 * Problem link: https://codeforces.com/contest/59/problem/A
 */

package CodeForces;

import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine(); //Given word
        int lc = 0, uc = 0; //Lowercase and uppercase counters
        for (int i = 0; i < s.length(); i++) {
            //Counting uppercase and lowercase letters
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                uc++;
            else
                lc++;
        }
        //Process
        if (lc > uc || lc == uc)
            s = s.toLowerCase();
        else
            s = s.toUpperCase();
        System.out.println(s);
    }
}