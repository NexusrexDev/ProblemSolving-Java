/**
 * Problem name: Mr. Perfectly Fine
 * Problem link: https://codeforces.com/contest/1829/problem/C
 */

package CodeForces;

import java.util.*;

public class MrPerfectlyFine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t != 0) {
            int n = input.nextInt();
            int minS1 = Integer.MAX_VALUE, minS2 = Integer.MAX_VALUE, total = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int time = input.nextInt();
                int skill = input.nextInt();
                if (skill == 1) {
                    minS1 = Math.min(minS1, time);
                } else if (skill == 10) {
                    minS2 = Math.min(minS2, time);
                } else if (skill == 11) {
                    total = Math.min(total, time);
                }
            }
            if (minS1 == Integer.MAX_VALUE || minS2 == Integer.MAX_VALUE) {
                if (total == Integer.MAX_VALUE)
                    System.out.println("-1");
                else
                    System.out.println(total);
            }
            else {
                total = Math.min(minS1+minS2, total);
                System.out.println(total);
            }
            t--;
        }
    }
}