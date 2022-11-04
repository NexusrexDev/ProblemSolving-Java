/**
 * Problem name: Free Ice Cream
 * Problem link: https://codeforces.com/contest/686/problem/A
 */

package CodeForces;

import java.util.*;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, o = 0; //Number of people in queue and number of distressed kids
        long x; //Number of icecream packs
        n = input.nextInt();
        x = input.nextLong();
        for (int i = 0; i < n; i++) {
            char c = input.next().charAt(0); //Plus or minus sign
            int v = input.nextInt(); //Value
            if (c == '+')
                x += v;
            else if (c == '-') {
                if (v > x) //Not enough icecream? Distressed child
                    o++;
                else //Give icecream
                    x -= v;
            }
        }
        System.out.println(x + " " + o);
    }
}