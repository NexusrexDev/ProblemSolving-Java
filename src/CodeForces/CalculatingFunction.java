/**
 * Problem name: Calculating Function
 * Problem link: https://codeforces.com/contest/486/problem/A
 */

package CodeForces;

import java.util.*;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        /*The pattern ends up being like:
         * f(1) = -1
         * f(2) = -1 + 2 = 1
         * f(3) = -1 + 2 - 3 = -2
         * And so on, letting odd numbers' results being negative and even ones' being positive
         * With the function returning the half of n when it's even and the half of n+1 when it's odd
         */
        if (n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println(((n + 1) / 2) * -1);
        }
    }
}