/**
 * Problem name: Helpful Maths
 * Problem link: https://codeforces.com/contest/339/problem/A
 */

package CodeForces;

import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine(); //Given line
        int pNum = 0; //Number of plus signs
        int[] dNum = new int[3]; //Freq. array for the number of 1, 2, 3's
        for (int i = 0; i < str.length(); i++) {
            //Parsing the string, character by character >-<
            if (str.charAt(i) == '+')
                pNum++;
            else
                dNum[str.charAt(i) - '1']++;
        }
        for (int i = 0; i < 3; i++) {
            while (dNum[i] > 0) {
                System.out.print(i+1); //Printing the current digit
                if (pNum > 0) {
                    System.out.print("+"); //Printing a plus sign if available
                    pNum--;
                }
                dNum[i]--;
            }
        }
    }
}