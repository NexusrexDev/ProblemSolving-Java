/**
 * Problem name: Shaass and Oskols
 * Problem link: https://codeforces.com/contest/294/problem/A
 */

package CodeForces;

import java.util.*;

public class ShaassAndOskols {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m; //Wire count, Shot count
        n = input.nextInt();
        int[] a = new int[n]; //Birds on the wire
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt(); //Bird per wire input
        m = input.nextInt(); //Shot count input
        //Implementation
        for (int i = 0; i < m; i++) {
            //Shot position
            int x = input.nextInt() - 1; //Wire number
            int y = input.nextInt(); //Horizontal bird position
            int rRem = Math.abs(a[x] - y); //Remaining birds on the right
            int lRem = Math.abs(a[x] - (rRem + 1)); //Remaining birds on the left
            if (x-1 >= 0) { //If there was a higher wire, add remaining left birds
                a[x-1] += lRem;
            }
            if (x+1 <= n-1) { //If there was a lower wire, add remaining right birds
                a[x+1] += rRem;
            }
            a[x] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]); //Output
        }
    }
}