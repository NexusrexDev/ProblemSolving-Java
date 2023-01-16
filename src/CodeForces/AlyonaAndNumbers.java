/**
 * Problem name: Alyona and Numbers
 * Problem link: https://codeforces.com/contest/682/problem/A
 */

package CodeForces;

import java.util.*;

public class AlyonaAndNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, maxMultiple;
        long total = 0;
        n = input.nextInt();
        m = input.nextInt();

        maxMultiple = n + m; //The number of 5 multiples checked is either the sum of n and m or below
        while(maxMultiple % 5 != 0) maxMultiple--; //Looping to reach a maxMultiple of 5
        maxMultiple /= 5; //Dividing by 5 to get a number to loop towards

        for (int i = 1; i <= maxMultiple; i++) {
            int multiple = i * 5; //Iterating on multiples of 5: 5, 10, 15, 20..etc
            /* If we draw an n*m rectangle, we would find that every multiple of 5
             * is its value-1 (diagonal), if a side is greater/equal to multiple-1, we count the other side
             * Otherwise, we take away the amount from each unused part in a supposed diagonal-1*diagonal-1
             * rectangle.
             */
            if (n >= multiple - 1) {
                if (m >= multiple - 1) {
                    total += multiple - 1;
                } else {
                    total += m;
                }
            } else {
                if (m >= multiple -1) {
                    total += n;
                } else {
                    //Simplified from (multiple - 1) - (multiple - 1 - m) + (multiple - 1 - n)
                    total += m + n + 1 - multiple;
                }
            }
        }

        System.out.println(total);
    }
}