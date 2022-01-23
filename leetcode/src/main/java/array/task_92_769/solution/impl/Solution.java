package array.task_92_769.solution.impl;

import array.task_92_769.solution.ISolution;

import java.util.HashSet;
import java.util.Set;

/**
 * Runtime: 22 ms
 * Memory Usage: 44.7 MB
 */
public class Solution implements ISolution {
    @Override
    public boolean isValidSudoku(char[][] board) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (isNotValidBoard3x3(board, x, y) || isNotValidLine(board) || isNotValidColumn(board)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isNotValidBoard3x3(char[][] partOfBoard, int x, int y) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 3 * x; i < 3 + (3 * x); i++) {
            for (int j = 3 * y; j < 3 + (3 * y); j++) {
                if (partOfBoard[i][j] == '.') {
                    continue;
                } else if (characterSet.contains(partOfBoard[i][j])) {
                    return true;
                }
                characterSet.add(partOfBoard[i][j]);
            }
        }
        return false;
    }

    public boolean isNotValidLine(char[][] partOfBoard) {
        Set<Character> characterLineSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (characterLineSet.contains(partOfBoard[i][j])) {
                    return true;
                }
                if (partOfBoard[i][j] != '.') {
                    characterLineSet.add(partOfBoard[i][j]);
                }
            }
            characterLineSet.clear();
        }
        return false;
    }

    public boolean isNotValidColumn(char[][] partOfBoard) {
        Set<Character> characterColumnSet = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (characterColumnSet.contains(partOfBoard[i][j])) {
                    return true;
                }
                if (partOfBoard[i][j] != '.') {
                    characterColumnSet.add(partOfBoard[i][j]);
                }
            }
            characterColumnSet.clear();
        }
        return false;
    }
}
