/**
 * Problem name: Keyboard
 * Problem link: https://codeforces.com/contest/474/problem/A
 */

package CodeForces;

import java.util.*;

public class Keyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char dir = input.next().charAt(0); //Direction of shifting
        int unshift = (dir == 'R') ? -1 : 1; //If Mole shifted to the right, unshift to the left
        String str = input.next(), fixStr = ""; //Shifted message, Fixed message
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./"; //A reference to the entirety of the keyboard
        for (int i = 0; i < str.length(); i++) {
            int currentLetter = keyboard.indexOf(str.charAt(i)); //Find the letter *on* the keyboard
            fixStr = fixStr + keyboard.charAt(currentLetter + unshift); //Shift the letter and add it
        }
        System.out.println(fixStr);
    }
}