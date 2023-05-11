/**
 * Problem name: Blank Space
 * Problem link: https://codeforces.com/contest/1829/problem/B
 */

package CodeForces;

import java.util.*;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t != 0) {
            int n = input.nextInt(), spaceLength = 0, longestSpace = 0;
            for (int i = 0; i < n; i++) {
                int binInput = input.nextInt();
                if (binInput == 0) {
                    spaceLength++;
                } else {
                    longestSpace = Math.max(spaceLength, longestSpace);
                    spaceLength = 0;
                }
            }
            longestSpace = Math.max(spaceLength, longestSpace);
            System.out.println(longestSpace);
            t--;
        }
    }
}