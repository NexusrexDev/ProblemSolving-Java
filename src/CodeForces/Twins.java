/**
 * Problem name: Twins
 * Problem link: https://codeforces.com/contest/160/problem/A
 */

package CodeForces;

import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), hSum = 0; //Number of coins, sum of coins will be halved
        Integer[] a = new Integer[n]; //Using a wrapper for reverse order sorting
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            hSum += a[i];
        }
        hSum /= 2; //The number of coins you 'should' have
        Arrays.sort(a, Collections.reverseOrder());
        int cSum = 0, cNum = 0; //Sum of taken coins, number of taken coins
        while (cSum <= hSum) {
            cSum += a[cNum]; //Take a new coin, adding to the pointer
            cNum++;
        }
        System.out.println(cNum);
    }
}