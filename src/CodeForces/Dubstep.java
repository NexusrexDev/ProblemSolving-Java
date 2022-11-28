/**
 * Problem name: Dubstep
 * Problem link: https://codeforces.com/contest/208/problem/A
 */

package CodeForces;

import java.util.*;

public class Dubstep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        s1 = s1.replace("WUB", " ");
        s1 = s1.trim();
        System.out.println(s1);
    }
}