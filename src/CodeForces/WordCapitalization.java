/**
 * Problem name: Word Capitalization
 * Problem link: https://codeforces.com/contest/281/problem/A
 */

package CodeForces;

import java.util.*;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if (!(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')) {
            System.out.print((char)(str.charAt(0) - 32));
            System.out.println(str.substring(1, str.length()));
        } else {
            System.out.println(str);
        }
    }
}