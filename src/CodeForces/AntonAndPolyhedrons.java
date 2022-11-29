/**
 * Problem name: Anton and Polyhedrons
 * Problem link: https://codeforces.com/contest/785/problem/A
 */

package CodeForces;

import java.util.*;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> polyhedrons = new HashMap<String, Integer>();
        polyhedrons.put("Tetrahedron", 4);
        polyhedrons.put("Cube", 6);
        polyhedrons.put("Octahedron", 8);
        polyhedrons.put("Dodecahedron", 12);
        polyhedrons.put("Icosahedron", 20);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += polyhedrons.get(input.next());
        }
        System.out.println(sum);
    }
}