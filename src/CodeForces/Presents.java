/**
 * Problem name: Presents
 * Problem link: https://codeforces.com/contest/136/problem/A
 */

package CodeForces;

import java.util.*;

public class Presents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //Number of friends
        int[] p = new int[n]; //Array of friends
        for (int i = 0; i < n; i++) {
            /*
            * Instead of putting the friends' gifting targets then finding the indices,
            * p will carry the indices, in function of the given target - 1
            */
            p[input.nextInt() - 1] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
    }
}