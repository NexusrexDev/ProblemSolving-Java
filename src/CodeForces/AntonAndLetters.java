/**
 * Problem name: Anton and Letters
 * Problem link: https://codeforces.com/contest/443/problem/A
 */

package CodeForces;

import java.util.*;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine(); //Given input
        int[] lC = new int[26]; //Frequency array for distinct letters
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i); //Current character
            if (c >= 'a' && c <= 'z')
                lC[c - 'a']++;
        }
        int o = 0; //Output
        for (int i = 0; i < 26; i++) {
            if (lC[i] > 0)
                o++;
        }
        System.out.println(o);
    }
}