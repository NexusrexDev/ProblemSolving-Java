/**
 * Problem name: Plus or Minus
 * Problem link: https://codeforces.com/contest/1807/problem/A
 */

package CodeForces;

import java.util.*;

public class PlusOrMinus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
            if (a+b == c) System.out.println("+");
            else System.out.println("-");
        }
    }
}