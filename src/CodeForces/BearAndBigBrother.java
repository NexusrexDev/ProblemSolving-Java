/**
 * Problem name: Bear and Big Brother
 * Problem link: https://codeforces.com/contest/791/problem/A
 */

package CodeForces;

import java.util.*;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, y = 0; //Small and big brother weights respectively
        a = input.nextInt();
        b = input.nextInt();
        //Every year, a is multiplied by 3, b is multiplied by 2
        while (!(a > b)) {
            a *= 3;
            b *= 2;
            y++;
        }
        System.out.println(y);
    }
}