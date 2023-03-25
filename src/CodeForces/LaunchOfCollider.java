/**
 * Problem name: Launch of Collider
 * Problem link: https://codeforces.com/contest/699/problem/A
 */

package CodeForces;

import java.util.*;

public class LaunchOfCollider {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long o = -1;
        String directions = input.next();
        long[] positions = new long[n];
        for (int i = 0; i < n; i++) {
            positions[i] = input.nextLong();
        }

        if (n == 1) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < n-1; i++) {
                if (directions.charAt(i) == 'R' && directions.charAt(i+1) == 'L') {
                    long posDiff = (positions[i+1] - positions[i]) / 2;
                    if (o != -1) {
                        if (posDiff < o) o = posDiff;
                    } else o = posDiff;
                }
            }

            System.out.println(o);
        }
    }
}