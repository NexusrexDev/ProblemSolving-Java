/**
 * Problem name: Is it rated?
 * Problem link: https://codeforces.com/contest/807/problem/A
 */

package CodeForces;

import java.util.*;

public class IsItRated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //Number of participants
        int[] before = new int[n];
        int[] after = new int[n];
        Integer[] sorted = new Integer[n];

        //Step 1: Check if it's rated by checking for differences pre/post contest
        for (int i = 0; i < n; i++) {
            before[i] = input.nextInt();
            sorted[i] = before[i];
            after[i] = input.nextInt();
            if (after[i] != before[i]) {
                System.out.println("rated");
                return;
            }
        }
        //Step 2: Check if is unrated by comparing to a inv-sorted array
        Arrays.sort(sorted, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (before[i] != sorted[i]) {
                System.out.println("unrated");
                return;
            }
        }
        //Step 3: We're unsure
        System.out.println("maybe");
    }
}