/**
 * Problem name: IQ Test
 * Problem link: https://codeforces.com/contest/287/problem/A
 */

package CodeForces;

import java.util.*;

public class IQTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] lines = new String[4];
        for (int i = 0; i < 4; i++) {
            lines[i] = input.next();
        }

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                int blackCells = 0;
                int whiteCells = 0;
                for (int i = x; i < x+2; i++) {
                    for (int j = y; j < y+2; j++) {
                        if (lines[i].charAt(j) == '#')
                            blackCells++;
                        if (lines[i].charAt(j) == '.')
                            whiteCells++;

                        if (blackCells >= 3 || whiteCells >= 3) {
                            System.out.println("YES");
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("NO");
    }
}