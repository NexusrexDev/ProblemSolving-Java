/**
 * Problem name: Valera and X
 * Problem link: https://codeforces.com/contest/404/problem/A
 */

package CodeForces;

import java.util.*;

public class ValeraAndX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //Paper size
        char[][] c = new char[n][n];
        char c1 = ' ', c2 = ' ';
        for (int i = 0; i < n; i++) {
            String s = input.next(); //Take an entire line of input
            for (int j = 0; j < n; j++) {
                c[i][j] = s.charAt(j); //Split lines of input to characters
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) { //First character is the one forming the x
                    c1 = c[i][j];
                } else if (i == 0 && j == 1) {
                    if (c[i][j] == c1) {
                        System.out.println("NO");
                        return;
                    } else { //Second character is the background, as far as it's not repeated
                        c2 = c[i][j];
                    }
                } else {
                    if (i == j || i == Math.abs(j - (n-1))) { //Check on diagonals
                        if (c[i][j] != c1) { //If the characters are *not* the first
                            System.out.println("NO");
                            return;
                        }
                    } else { //Check on background
                        if (c[i][j] != c2) { //If the characters are *not* the second
                            System.out.println("NO");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("YES");
    }
}