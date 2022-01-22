package array.task_92_769.solution.impl;

import array.task_92_769.solution.Solution_92_769;

import java.util.HashSet;
import java.util.Set;

public class SolutionImpl implements Solution_92_769 {
    @Override
    public boolean isValidSudoku(char[][] board) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                boolean valid3x3 = isNotValid3x3(board, x, y);
                if (valid3x3) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isNotValid3x3(char[][] partOfBoard, int x, int y) {
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
}
