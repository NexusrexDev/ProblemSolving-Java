/**
 * Problem name: Beautiful Matrix
 * Problem link: https://codeforces.com/contest/263/problem/A
 */

package CodeForces;

import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int xPos = 0, yPos = 0; //Position for n1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int n = input.nextInt(); //Input entry
                if (n == 1) {
                    /*If n == 1, take difference between position and the center
                    instead of saving to an array and rereading
                     */
                    xPos = Math.abs(2 - j);
                    yPos = Math.abs(2 - i);
                }
            }
        }
        System.out.println(xPos + yPos);
    }
}