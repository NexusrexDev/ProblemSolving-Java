/**
 * Problem name: Ksenia and Pan Scales
 * Problem link: https://codeforces.com/contest/382/problem/A
 */

package CodeForces;

import java.util.*;

public class KseniaAndPanScales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] scales = {"", ""};
        String initScale = input.next();
        StringBuilder remainingWeights = new StringBuilder(input.next());
        int currentScale = 0;

        //Parsing the string into two scales
        for (int i = 0; i < initScale.length(); i++) {
            if (initScale.charAt(i) == '|') {
                currentScale = 1;
            } else {
                scales[currentScale] = scales[currentScale] + initScale.charAt(i);
            }
        }

        //Assigning weights to scales as far as the remaining scales aren't empty
        while (!remainingWeights.isEmpty()) {
            if (scales[0].length() > scales[1].length()) {
                scales[1] = scales[1] + remainingWeights.charAt(0);
            } else {
                scales[0] = scales[0] + remainingWeights.charAt(0);
            }
            remainingWeights.deleteCharAt(0);
        }

        //The scales aren't balanced yet? Impossible
        if (scales[0].length() != scales[1].length()) {
            System.out.println("Impossible");
            return;
        }

        System.out.println(scales[0] + "|" + scales[1]);
    }
}