/**
 * Problem name: Black Square
 * Problem link: https://codeforces.com/contest/431/problem/A
 */

package CodeForces;

import java.util.*;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[4]; //Calorie counts
        int o = 0; //Output
        for (int i = 0; i < 4; i++) {
            a[i] = input.nextInt();
        }
        String s = input.next(); //Steps
        for (int i = 0; i < s.length(); i++) {
            int cPos = s.charAt(i) - '1'; //Current position, converting from digits to unicode is different
            o += a[cPos];
        }
        System.out.println(o);
    }
}