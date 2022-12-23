/**
 * Problem name: Theatre Square
 * Problem link: https://codeforces.com/contest/1/problem/A
 */

package CodeForces;

import java.util.*;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n, m, a;
        n = input.nextLong();
        m = input.nextLong();
        a = input.nextLong();
        long s1 = (long)Math.ceil(n / (double)a) * a;
        long s2 = (long)Math.ceil(m / (double)a) * a;
        System.out.println((s1*s2) / (a*a));
    }
}