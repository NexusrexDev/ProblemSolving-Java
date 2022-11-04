/**
 * Problem name: Gravity Flip
 * Problem link: https://codeforces.com/contest/405/problem/A
 */

package CodeForces;

import java.util.*;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //Number of columns
        int[] box = new int[n]; //Box
        for (int i = 0; i < n; i++) {
            box[i] = input.nextInt();
        }
        Arrays.sort(box);
        for (int i = 0; i < n; i++) {
            System.out.print(box[i] + " ");
        }
    }
}