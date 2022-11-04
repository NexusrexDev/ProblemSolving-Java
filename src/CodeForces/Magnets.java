/**
 * Problem name: Magnets
 * Problem link: https://codeforces.com/contest/344/problem/A
 */

package CodeForces;

import java.util.*;

public class Magnets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, grp = 0, prev = 0; //Number of magnets, groups and the previous magnet
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int iVal = input.nextInt();
            if (iVal != prev) //If the magnet is different, we've created a new group
                grp++;
            prev = iVal;
        }
        System.out.println(grp);
    }
}