/**
 * Problem name: Valid Sudoku
 * Problem link: https://leetcode.com/problems/valid-sudoku/
 */

package LeetCode;

import java.util.HashMap;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] existsInRow = new boolean[9][9];
        boolean[][] existsInColumn = new boolean[9][9];
        HashMap<Integer, Integer> boxStart = new HashMap<>();
        HashMap<Integer, Integer> boxEnd = new HashMap<>();

        //Filling the locators for every 3x3 sub-box
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boxStart.put(j + (i * 3), i * 3);
                boxEnd.put(j + (i * 3), 3 + (i * 3));
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    //Checking in current row
                    if (existsInRow[i][board[i][j] - '1'])
                        return false;
                    else
                        existsInRow[i][board[i][j] - '1'] = true;

                    //Checking in current column
                    if (existsInColumn[j][board[i][j] - '1'])
                        return false;
                    else
                        existsInColumn[j][board[i][j] - '1'] = true;

                    //Checking in current 3x3 sub-box
                    for (int x = boxStart.get(i); x < boxEnd.get(i); x++) {
                        for (int y = boxStart.get(j); y < boxEnd.get(j); y++) {
                            if (x != i && y != j) {
                                if (board[x][y] == board[i][j])
                                    return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}