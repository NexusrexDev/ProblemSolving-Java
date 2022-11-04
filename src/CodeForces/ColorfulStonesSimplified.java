/**
 * Problem name: Colorful Stones (Simplified Edition)
 * Problem link: https://codeforces.com/contest/265/problem/A
 */

package CodeForces;

import java.util.*;

public class ColorfulStonesSimplified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int o = 0; //Current stone: expected output
        String s, t; //Set of stones, instructions
        s = input.next();
        t = input.next();
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(o) == t.charAt(i))
                o++;
        }
        System.out.println(o + 1);
    }
}