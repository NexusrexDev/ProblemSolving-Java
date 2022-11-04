/**
 * Problem name: Boy or Girl
 * Problem link: https://codeforces.com/contest/236/problem/A
 */

package CodeForces;

import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(); //The given username
        int[] characters = new int[26]; //Frequency array for every letter
        int t = 0;
        for (int i = 0; i < name.length(); i++) {
            int currentIndex = (int)name.charAt(i) - (int)'a';
            characters[currentIndex]++;
        }
        for (int i = 0; i < 26; i++) {
            //Adding the smallest value
            t += Math.min(characters[i], 1);
        }
        if (t % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}