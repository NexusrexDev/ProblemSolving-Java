/**
 * Problem name: Buy a Shovel
 * Problem link: https://codeforces.com/contest/732/problem/A
 */

package CodeForces;

import java.util.*;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, r, i = 1; //Price of one shovel, non-10 coin number
        k = input.nextInt();
        r = input.nextInt();
        while (true) {
            //If i shovels could be only bought w/ 10-burle coins OR 10-burle coins and r, print i
            if ((i*k - r) % 10 == 0 || i*k % 10 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}