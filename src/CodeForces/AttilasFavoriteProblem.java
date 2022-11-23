/**
 * Problem name: Atilla's Favorite Problem
 * Problem link: https://codeforces.com/contest/1760/problem/B
 */

package CodeForces;

import java.util.*;

public class AttilasFavoriteProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); //Number of test cases
        for (int i = 0; i < t; i++) {
            int n = input.nextInt(); //Number of letters in the word
            int alphabetSize = 0;
            String s = input.next();
            for (int j = 0; j < n; j++) {
                if ((int)s.charAt(j) > alphabetSize)
                    alphabetSize = (int)s.charAt(j);
            }
            System.out.println(alphabetSize - 'a' + 1);
        }
    }
}