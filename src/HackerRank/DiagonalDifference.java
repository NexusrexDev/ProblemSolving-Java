/**
 * Problem name: Diagonal Difference
 * Problem link: https://www.hackerrank.com/challenges/diagonal-difference
 */

package HackerRank;

import java.util.*;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        //Solution goes here, as the usual w/ HackerRank problems
        int d1, d2, diff = d1 = d2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            d1 += arr.get(i).get(i); //The primary diagonal has equal indices
            d2 += arr.get(i).get(arr.size() - i - 1);
        }
        diff = Math.abs(d1 - d2);
        return diff;
    }
}