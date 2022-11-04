/**
 * Problem name: Is your horseshoe on the other hoof?
 * Problem link: https://codeforces.com/contest/228/problem/A
 */

package CodeForces;

import java.util.*;

public class Horseshoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int o = 0; //Output
        int[] s = new int[4]; //Given horseshoes
        for (int i = 0; i < 4; i++) {
            s[i] = input.nextInt();
        }
        //Implementation
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //If we're not at the same index, but the same shoe color was found:
                if (i != j && s[i] == s[j]) {
                    //Add another shoe to change
                    o++;
                    //Change the reference to avoid redundancy
                    s[i] = -1;
                }
            }
        }
        System.out.println(o);
    }
}