/**
 * Problem name: Petya and Strings
 * Problem link: https://codeforces.com/contest/112/problem/A
 */

package CodeForces;

import java.util.*;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int o = 0;
        String s1, s2; //Strings to compare
        s1 = input.nextLine();
        s2 = input.nextLine();
        //Ignoring case by setting all to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        //Implementation
        for (int i = 0; i < s1.length(); i++) {
            //Compare based on the first couple of different characters
            int c1 = s1.charAt(i);
            int c2 = s2.charAt(i);
            if (c1 > c2) {
                o = 1;
                break;
            } else if (c1 < c2) {
                o = -1;
                break;
            }
        }
        //Output
        System.out.println(o);
    }
}