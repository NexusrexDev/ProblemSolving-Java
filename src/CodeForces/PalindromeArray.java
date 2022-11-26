/**
 * Problem name: Palindrome Array
 * Problem link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/G
 */

package CodeForces;

import java.util.*;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), t; //Array length
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        if (n == 1) { //A single index array is always a palindrome
            System.out.println("YES");
            return;
        } else {
            t = n / 2;
        }
        for (int i = 0; i < t; i++) {
            if (a[i] != a[n - 1 - i]) { //If the two digits aren't equal
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}