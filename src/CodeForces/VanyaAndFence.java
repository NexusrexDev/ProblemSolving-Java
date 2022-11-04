/**
 * Problem name: Vanya and Fence
 * Problem link: https://codeforces.com/contest/677/problem/A
 */

package CodeForces;

import java.util.*;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int friendNum, fenceHeight; //Friends number, fence height
        int totalWidth = 0; //Total width
        friendNum = input.nextInt();
        fenceHeight = input.nextInt();
        for (int i = 0; i < friendNum; i++) {
            int friendHeight = input.nextInt();
            if (friendHeight <= fenceHeight)
                totalWidth += 1;
            else
                totalWidth += 2;
        }
        System.out.println(totalWidth);
    }
}
