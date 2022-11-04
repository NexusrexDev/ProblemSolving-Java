/**
 * Problem name: Anton and Danik
 * Problem link: https://codeforces.com/contest/734/problem/A
 */

package CodeForces;

import java.util.*;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, dCount = 0, aCount = 0; //Number of games played
        n = input.nextInt();
        String s = input.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A')
                aCount++;
            else
                dCount++;
        }
        if (aCount > dCount)
            System.out.println("Anton");
        else if (dCount > aCount)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}