/**
 * Problem name: Spiral Matrix
 * Problem link: https://leetcode.com/problems/spiral-matrix/
 */

package LeetCode;

import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> output = new ArrayList<>();
        int hDir = 1, vDir = 1; //Direction variables
        int rowClear = 0, colClear = 0; //Cleared rows and columns
        int m = matrix[0].length, n = matrix.length;

        while (output.size() != m*n)
        {
            if (hDir > 0) {
                for (int i = rowClear/2; i <= (m-1) - (rowClear/2); i++)
                    output.add(matrix[rowClear/2][i]);
            } else {
                for (int i = (m-2) - (rowClear/2); i >= (rowClear/2); i--)
                    output.add(matrix[(n-1) - (rowClear/2)][i]);
            }
            rowClear++;
            hDir = -hDir;

            if (vDir > 0) {
                for (int i = (colClear/2) + 1; i <= (n-1) - (colClear/2); i++)
                    output.add(matrix[i][(m-1) - (colClear/2)]);
            } else {
                for (int i = (n-2) - (colClear/2); i >= (colClear/2) + 1; i--)
                    output.add(matrix[i][colClear/2]);
            }
            colClear++;
            vDir = -vDir;
        }

        return output;
    }
}