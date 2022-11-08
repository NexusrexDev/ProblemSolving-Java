/**
 * Problem name: Conversion
 * Problem link: https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/G
 */

package CodeForces;

import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next(); //Input string
        String o = ""; //Output string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',') {
                //A comma is turned into a space
                o = o + " ";
            } else {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    o = o + (char)(str.charAt(i) + ('a' - 'A'));
                } else {
                    o = o + (char)(str.charAt(i) + ('A' - 'a'));
                }
            }
        }
        System.out.println(o);
    }
}