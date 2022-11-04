/**
 * Problem name: Games
 * Problem link: https://codeforces.com/contest/268/problem/A
 */

package CodeForces;

import java.util.*;

public class Games {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, o = 0; //Number of teams, output value
        int[] h, a; //Home and guest uniform respectively
        n = input.nextInt();
        h = new int[n];
        a = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = input.nextInt();
            a[i] = input.nextInt();
        }
        //Implementation through bruteforce
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue; //Not going to check on self
                if (a[i] == h[j]) //If the i-th team's home uniform is the same as the j-th team's guest uniform
                    o++;
            }
        }
        System.out.println(o);
    }
}