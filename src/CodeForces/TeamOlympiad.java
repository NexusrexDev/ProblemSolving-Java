/**
 * Problem name: Team Olympiad
 * Problem link: https://codeforces.com/contest/490/problem/A
 */

package CodeForces;

import java.util.*;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //Number of children
        int[] skillCount = new int[3]; //Number of skills found, used to set a number of teams
        int[] childrenArr = new int[n]; //Array of children
        for (int i = 0; i < n; i++) {
            int child = input.nextInt();
            childrenArr[i] = child; //Setting the child
            skillCount[child-1]++; //Incrementing
        }

        //Counting the number of possible teams (aka the lowest number of skill)
        int teamNum = Math.min(skillCount[0], Math.min(skillCount[1], skillCount[2]));

        //Stopping if there are no teams to form
        if (teamNum == 0) {
            System.out.println("0");
            return;
        }

        int[][] teamDetails = new int[teamNum][3];
        int[] lastPtr = new int[3]; //Points at the latest location to place each skill member
        for (int i = 0; i < n; i++) {
            //If the last pointer is less than the team number (in case of having a surplus of a specific skill)
            if (lastPtr[childrenArr[i] - 1] < teamNum) {
                //Using the child's skill as an index
                teamDetails[lastPtr[childrenArr[i] - 1]][childrenArr[i] - 1] = i + 1;
                //Incrementing the pointer
                lastPtr[childrenArr[i] - 1]++;
            }
        }

        //Print the team details (number of teams, combinations)
        System.out.println(teamNum);
        for (int i = 0; i < teamNum; i++) {
            System.out.println(teamDetails[i][0] + " " + teamDetails[i][1] + " " + teamDetails[i][2]);
        }
    }
}