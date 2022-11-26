/**
 * Problem name: Brain's Photos
 * Problem link: https://codeforces.com/contest/707/problem/A
 */

package CodeForces;

import java.util.*;

public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt(); //Dimensions

        for (int i = 0; i < n*m; i++) {
            char pixel = input.next().charAt(0);
            if (pixel == 'C' || pixel == 'M' || pixel == 'Y') {
                //If this is a colored pixel, then this is a colored picture
                System.out.println("#Color");
                return;
            }
        }
        //It's actually a black and white picture!
        System.out.println("#Black&White");
    }
}