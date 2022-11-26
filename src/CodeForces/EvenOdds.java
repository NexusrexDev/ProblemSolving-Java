/**
 * Problem name: Even Odds
 * Problem link: https://codeforces.com/contest/318/problem/A
 */

package CodeForces;

import java.util.*;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n, k, odds, evens, res; //Numbers, index to look for
        n = input.nextLong();
        k = input.nextLong();

        if (n % 2 == 0) {
            //Is even
            odds = evens = n / 2;
        } else {
            odds = (n / 2) + 1;
            evens = n - odds;
        }

        //Generating the number
        if (k <= odds) {
            //Generate odd numbers
            res = (k * 2) - 1;
        } else {
            //Generate even numbers
            res = (k - odds) * 2;
        }

        System.out.println(res);
    }
}