/**
 * Problem name: Lucky Division
 * Problem link: https://codeforces.com/problemset/problem/122/A
 */

package CodeForces;

import java.util.*;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //Given number
        //This is a terrible solution, since 1<=n<=1000, the maximum lucky number is 777.
        int[] arr = {4, 7, 44, 47, 74, 77, 444, 447, 474, 744, 477, 774, 747, 777};
        for (int i = 0; i < arr.length; i++) {
            if (n % arr[i] == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}