/**
 * Problem name: Sereja and Dima
 * Problem link: https://codeforces.com/contest/381/problem/A
 */

package CodeForces;

import java.util.*;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sScore = 0, dScore = 0, leftmost, rightmost, t = 0;
        //Number of cards, Sereja and Dima's scores, pointers, turns
        n = input.nextInt();
        int[] cards = new int[n]; //Array of cards
        leftmost = 0;
        rightmost = n - 1;
        for (int i = 0; i < n; i++) {
            cards[i] = input.nextInt();
        }
        //Implementation
        while (n > 0) {
            //Pulling cards
            int max;
            if (cards[leftmost] > cards[rightmost]) {
                max = cards[leftmost];
                leftmost++;
            } else {
                max = cards[rightmost];
                rightmost--;
            }
            //Adding value
            if (t == 0) {
                //Sereja's turn
                sScore += max;
                t = 1;
            }
            else {
                //Dima's turn
                dScore += max;
                t = 0;
            }
            n--;
        }
        System.out.println(sScore + " " + dScore);
    }
}