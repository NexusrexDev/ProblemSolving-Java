/**
 * Problem name: Pangram
 * Problem link: https://codeforces.com/contest/520/problem/A
 */

package CodeForces;

import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //String length
        String str = input.next(); //Given string
        int[] c = new int[26]; //Frequency array of the characters
        str = str.toLowerCase(); //Guarantees that all the characters are gonna be lowercase
        for (int i = 0; i < n; i++) {
            c[str.charAt(i) - 'a']++; //Increment at the occurrence of the character
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] < 1) {
                System.out.println("NO");
                return; //Ends the loop if we find a nonexistent character
            }
        }
        System.out.println("YES");
    }
}