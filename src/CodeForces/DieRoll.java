/**
 * Problem name: Die Roll
 * Problem link: https://codeforces.com/contest/9/problem/A
 */

package CodeForces;

import java.util.*;

public class DieRoll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = input.nextInt(), w = input.nextInt(); //Yakko's and Wakko's rolls
        int a = (6 - Math.max(y, w)) + 1; //Numerator
        int b = 6; //Denominator
        if (b%a == 0) {
            //If the number can be simplified into a 1/x form
            b /= a;
            a /= a;
        } else if (a%2 == 0 && b%2 == 0) {
            //If both numerator and denominator are divisible by 2
            a /= 2;
            b /= 2;
        }
        System.out.println(a + "/" + b);
    }
}