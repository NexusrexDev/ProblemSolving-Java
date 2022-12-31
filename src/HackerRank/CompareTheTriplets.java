/**
 * Problem name: Compare the Triplets
 * Problem link: https://www.hackerrank.com/challenges/compare-the-triplets
 */

package HackerRank;

import java.util.*;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        //Solution goes here, as the usual w/ HackerRank problems
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 2; i++) //Setting Alice and Bob's points to 0
            result.add(0);
        for (int i = 0; i < 3; i++) { //Comparing on every problem/index
            if (a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                result.set(1, result.get(1) + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> aliceRatings = new ArrayList<>(), bobRatings = new ArrayList<>(), comparison;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    aliceRatings.add(input.nextInt());
                } else {
                    bobRatings.add(input.nextInt());
                }
            }
        }
        comparison = (ArrayList<Integer>)compareTriplets(aliceRatings, bobRatings);
        System.out.println(comparison);
    }
}