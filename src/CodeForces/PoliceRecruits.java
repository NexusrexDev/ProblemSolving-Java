/**
 * Problem name: Police Recruits
 * Problem link: https://codeforces.com/contest/427/problem/A
 */

package CodeForces;

import java.util.*;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), f = 0, o = 0; //Number of crimes, free officers, output
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (x == -1) { //If a crime happened
                if (f == 0) //No free officers? Untreated crime
                    o++;
                else //Take a crime to investigate
                    f--;
            }
            f += Math.max(0, x); //Either adding an actually free officer or adding none
        }
        System.out.println(o);
    }
}