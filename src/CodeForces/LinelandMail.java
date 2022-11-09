/**
 * Problem name: Lineland Mail
 * Problem link: https://codeforces.com/contest/567/problem/A
 */

package CodeForces;

import java.util.*;

public class LinelandMail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //Number of cities
        long[] x = new long[n]; //City position
        for (int i = 0; i < n; i++) {
            x[i] = input.nextLong();
        }
        for (int i = 0; i < n; i++) {
            long min_i = 0;
            long max_i = 0;
            if (i == 0) { //First city, maximum at the last, min at the next
                min_i = x[i+1] - x[i];
                max_i = x[n-1] - x[i];
            } else if (i == n-1) { //Last city, maximum at the first, min at the next
                min_i = x[i] - x[i-1];
                max_i = x[i] - x[0];
            } else { //Otherwise, check for the minimum on either side, maximum on first/last
                min_i = Math.min((x[i] - x[i-1]), (x[i+1] - x[i]));
                max_i = Math.max((x[i] - x[0]), (x[n-1] - x[i]));
            }
            System.out.println(min_i + " " + max_i);
        }
    }
}