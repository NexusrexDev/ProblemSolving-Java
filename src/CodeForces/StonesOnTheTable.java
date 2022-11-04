/**
 * Problem name: Stones on the Table
 * Problem link: https://codeforces.com/contest/266/problem/A
 */

package CodeForces;

import java.util.*;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, o = 0; //String length, Output value
        n = input.nextInt();
        String s = input.next(); //Given string
        for (int i = 0; i < n-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                o++;
            }
        }
        System.out.println(o);
    }
}