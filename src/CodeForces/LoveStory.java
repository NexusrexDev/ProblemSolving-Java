/**
 * Problem name: Love Story
 * Problem link: https://codeforces.com/contest/1829/problem/A
 */

package CodeForces;

import java.util.*;

public class LoveStory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String name = "codeforces";
        for (int i = 0; i < n; i++) {
            String inputText = input.next();
            int indices = 0;
            for (int j = 0; j < inputText.length(); j++) {
                if (inputText.charAt(j) != name.charAt(j)) indices++;
            }
            System.out.println(indices);
        }
    }
}