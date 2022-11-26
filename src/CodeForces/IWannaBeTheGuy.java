/**
 * Problem name: I Wanna Be the Guy
 * Problem link: https://codeforces.com/contest/469/problem/A
 */

package CodeForces;

import java.util.*;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //Number of levels
        boolean[] passLevel = new boolean[n]; //Frequency array
        for (int t = 0; t < 2; t++) { //Little X and Little Y have their own individual set of levels
            int p = input.nextInt();
            for (int i = 0; i < p; i++) {
                int lvl = input.nextInt(); //Get input
                passLevel[lvl - 1] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            if (!passLevel[i]) {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println("I become the guy.");
    }
}