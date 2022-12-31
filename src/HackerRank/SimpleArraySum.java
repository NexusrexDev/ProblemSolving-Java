/**
 * Problem name: Simple Array Sum
 * Problem link: https://www.hackerrank.com/challenges/simple-array-sum
 */

package HackerRank;

import java.util.*;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        //Solution goes here, as the usual w/ HackerRank problems
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }
}