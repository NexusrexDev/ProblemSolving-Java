/**
 * Problem name: Team
 * Problem link: https://codeforces.com/contest/231/problem/A
 */

package CodeForces;

import java.util.*;

public class Team {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, p = 0; //Number of problems, number of solved problems
        n = input.nextInt();
        while (n > 0) {
            int m = 0; //Number of members capable of solving a problem
            for (int i = 0; i < 3; i++) {
                m += input.nextInt();
            }
            if (m > 1)
                p++;
            n--;
        }
        System.out.println(p);
    }
}