/**
 * Problem name: Night at the Museum
 * Problem link: https://codeforces.com/contest/731/problem/A
 */

package CodeForces;

import java.util.*;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine(); //Given word
        char c = 'a'; //Current character pointer
        int o = 0; //Number of steps: expected output
        for (int i = 0; i < s.length(); i++) {
            int step;
            if (c < s.charAt(i)) {
                step = Math.min(s.charAt(i) - c, ( c - s.charAt(i) ) + 26);
            } else {
                step = Math.min(c - s.charAt(i), ( s.charAt(i) - c ) + 26);
            }
            o += step;
            c = s.charAt(i); //Setting the character pointed
        }
        System.out.println(o);
    }
}