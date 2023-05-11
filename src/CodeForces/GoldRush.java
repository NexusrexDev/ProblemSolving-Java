/**
 * Problem name: Gold Rush
 * Problem link: https://codeforces.com/contest/1829/problem/D
 */

package CodeForces;

import java.util.*;

public class GoldRush {
    public static boolean pileDivision(long size, long goal) {
        if (size == 1) {
            return size == goal;
        }
        long fPart = size/3, sPart = (size/3) * 2;
        if (fPart + sPart == size) {
            if (fPart == goal || sPart == goal)
                return true;
            else return pileDivision(fPart, goal) || pileDivision(sPart, goal);
        } else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- != 0) {
            long n = input.nextLong(), m = input.nextLong();
            if (m > n) {
                System.out.println("NO");
                continue;
            }
            if (m == n) {
                System.out.println("YES");
                continue;
            }
            if (pileDivision(n, m))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}