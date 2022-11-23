/**
 * Problem name: Medium Number
 * Problem link: https://codeforces.com/contest/1760/problem/A
 */

package CodeForces;

import java.util.*;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); //Number of test cases
        int[][] arr = new int[t][3];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                //Input
                arr[i][j] = input.nextInt();
            }
            //Sorting
            Arrays.sort(arr[i]);
            //Printing the medium
            System.out.println(arr[i][1]);
        }
    }
}