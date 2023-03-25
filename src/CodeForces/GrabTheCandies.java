/**
 * Problem name: Grab the Candies
 * Problem link: https://codeforces.com/contest/1807/problem/B
 */

package CodeForces;

import java.util.*;

public class GrabTheCandies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int mScore = 0, bScore = 0;
            for (int j = 0; j < n; j++) {
                int candies = input.nextInt();
                if (candies % 2 == 0) mScore += candies;
                else bScore += candies;
            }
            if (mScore > bScore) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}