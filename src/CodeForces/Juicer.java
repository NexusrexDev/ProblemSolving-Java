/**
 * Problem name: Juicer
 * Problem link: https://codeforces.com/contest/709/problem/A
 */

package CodeForces;

import java.util.*;

public class Juicer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, b, d; //Number of oranges, maximum size and waste condition
        //Current orange, output (times the waste section was emptied) and total (waste) size
        int c = 0, o = 0;
        long t = 0;
        //Input
        n = input.nextInt();
        b = input.nextInt();
        d = input.nextInt();
        //Implementation
        while (c < n) {
            int a = input.nextInt();
            //Add or ignore orange
            if (a <= b)
                t += a;
            //Pass over to the next orange
            c++;
            //Empty the waste section if needed
            if (t > d) {
                o++;
                t = 0;
            }
        }
        System.out.println(o);
    }
}