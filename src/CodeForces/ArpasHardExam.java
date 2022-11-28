/**
 * Problem name: Arpa’s hard exam and Mehrdad’s naive cheat
 * Problem link: https://codeforces.com/contest/742/problem/A
 */

package CodeForces;

import java.util.*;

public class ArpasHardExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong(); //Given number
        if (n == 0) { //anything^0 = 1 ;p
            System.out.println(1);
        } else { //Check if the number is part of the following series
            if (n % 4 == 0) {
                //4, 8, 12, 16, 20..etc
                System.out.println(6);
            } else if (n % 2 == 0) {
                //2, 6, 10, 14, 18..etc
                System.out.println(4);
            } else if ((n+1) % 4 == 0) {
                //3, 7, 11, 15, 19..etc
                System.out.println(2);
            } else if ((n+1) % 2 == 0) {
                //1, 5, 9, 13, 17..etc
                System.out.println(8);
            }
        }
    }
}