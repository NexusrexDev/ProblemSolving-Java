/**
 * Problem name: Help Vasilisa the Wise 2
 * Problem link: https://codeforces.com/contest/143/problem/A
 */

package CodeForces;

import java.util.*;

public class HelpVasilisaTheWise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r1, r2, c1, c2, d1, d2;
        r1 = input.nextInt();
        r2 = input.nextInt();
        c1 = input.nextInt();
        c2 = input.nextInt();
        d1 = input.nextInt();
        d2 = input.nextInt();

        //Bruteforce works fine with this problem since the numbers are <=20
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == i)
                    continue;
                for (int k = 1; k <= 9; k++) {
                    if (k == j || k == i)
                        continue;
                    for (int l = 1; l <= 9; l++) {
                        if (l == k || l == j || l == i)
                            continue;

                        boolean exp1 = i+j == r1;
                        boolean exp2 = k+l == r2;
                        boolean exp3 = i+k == c1;
                        boolean exp4 = j+l == c2;
                        boolean exp5 = i+l == d1;
                        boolean exp6 = j+k == d2;

                        if (exp1 && exp2 && exp3 && exp4 && exp5 && exp6) {
                            System.out.println(i + " " + j);
                            System.out.println(k + " " + l);
                            return;
                        }
                    }
                }
            }
        }

        System.out.println(-1);
    }
}