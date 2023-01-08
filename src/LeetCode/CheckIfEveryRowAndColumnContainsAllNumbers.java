/**
 * Problem name: Check if Every Row and Column Contains All Numbers
 * Problem link: https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers
 */

package LeetCode;

public class CheckIfEveryRowAndColumnContainsAllNumbers {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        boolean[][] existsInRow = new boolean[n][n];
        boolean[][] existsInColumn = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (existsInRow[i][matrix[i][j] - 1])
                    return false;
                else
                    existsInRow[i][matrix[i][j] - 1] = true;

                if (existsInColumn[j][matrix[i][j] - 1])
                    return false;
                else
                    existsInColumn[j][matrix[i][j] - 1] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!existsInRow[i][j] || !existsInColumn[i][j])
                    return false;
            }
        }

        return true;
    }
}