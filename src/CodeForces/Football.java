/**
 * Problem name: Football
 * Problem link: https://codeforces.com/contest/43/problem/A
 */

package CodeForces;

import java.util.*;

public class Football {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //Number of lines
        int[] teamScores = new int[2];
        String[] teamNames = new String[2];

        for (int i = 0; i < n; i++) {
            String s = input.next();
            if (i == 0) { //For the first time, save the given name as the first team
                teamNames[0] = s;
                teamScores[0]++;
            } else {
                if (!s.equals(teamNames[0])) { //This is a different team? Store it in the other member
                    teamNames[1] = s;
                    teamScores[1]++;
                } else {
                    teamScores[0]++;
                }
            }
        }

        if (teamScores[0] > teamScores[1]) {
            System.out.println(teamNames[0]);
        } else {
            System.out.println(teamNames[1]);
        }
    }
}