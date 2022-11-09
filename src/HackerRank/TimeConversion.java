/**
 * Problem name: Time Conversion
 * Problem link: https://www.hackerrank.com/challenges/time-conversion/problem
 */

package HackerRank;

import java.util.*;

public class TimeConversion {
    public static String timeConversion(String s) {
        //Solution goes here, since hackerrank uses functions
        int hours = Integer.parseInt(s.substring(0,2)); //Reading the
        if (s.charAt(8) == 'P' && hours != 12) {
            hours += 12;
        } else if (s.charAt(8) == 'A' && hours == 12) {
            hours -= 12;
        }
        if (hours < 10) {
            return "0" + hours + s.substring(2, 8);
        } else {
            return hours + s.substring(2, 8);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(timeConversion(str));
    }
}