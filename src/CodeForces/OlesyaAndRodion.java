/**
 * Problem name: Olesya and Rodion
 * Problem link: https://codeforces.com/contest/584/problem/A
 */

package CodeForces;

import java.util.*;

public class OlesyaAndRodion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, t; //Number of digits, number to be divisible by
        long res = 0;
        n = input.nextInt();
        t = input.nextInt();
        if (t < 10) {
            for (int i = 0; i < n; i++) {
                System.out.print(t);
            }
        } else {
            if (n == 1) {
                System.out.println(-1);
                return;
            }
            for (int i = 0; i < n-1; i++) {
                System.out.print(1);
            }
            System.out.print(0);
        }
    }
}