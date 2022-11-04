/**
 * Problem name: Way Too Long Words
 * Problem link: https://codeforces.com/contest/71/problem/A
 */

package CodeForces;

import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //Number of words
        for (int i = 0; i < n; i++) {
            String str = input.next(); //Given word
            if (str.length() > 10) {
                int abb = str.length() - 2; //Abbreviation length
                String s = "" + str.charAt(0) + abb + str.charAt(str.length() - 1); //Create string
                System.out.println(s);
            } else {
                System.out.println(str);
            }
        }
    }
}