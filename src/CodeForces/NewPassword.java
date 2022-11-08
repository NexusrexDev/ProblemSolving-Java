/**
 * Problem name: New Password
 * Problem link: https://codeforces.com/contest/770/problem/A
 */

package CodeForces;

import java.util.*;

public class NewPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k; //String length, number of distinct characters
        String str = ""; //Empty string for output
        n = input.nextInt();
        k = input.nextInt();
        for (int i = 0, j = 0; i < n; i++) {
            /*
            Since ANY password is allowed, we can go with iterating over all characters,
            guaranteeing that consecutive symbols are distinct.
            */
            str = str + (char)('a' + j);
            if (j + 1 < k)
                j++;
            else
                j = 0;
        }
        System.out.println(str);
    }
}