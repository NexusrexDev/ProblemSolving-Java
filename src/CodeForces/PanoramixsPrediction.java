/**
 * Problem name: Panoramix's Prediction
 * Problem link: https://codeforces.com/contest/80/problem/A
 */

package CodeForces;

import java.util.*;

public class PanoramixsPrediction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m; //Soliders numbers for day 1 and 2
        n = input.nextInt();
        m = input.nextInt();
        for (int i = n+1; i <= m; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    //I is not prime
                    prime = false;
                    break;
                }
            }
            if ((i != m && prime) || (i == m && !prime)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}