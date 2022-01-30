package array.task_92_770.solution.impl;

import array.task_92_770.solution.ISolution;

/**
 * My solution`s results:
 * - Runtime: 0 ms
 * - Memory Usage: 42.9 MB
 */
public class Solution implements ISolution {
    @Override
    public void rotate(int[][] matrix) {
        int sideLength = matrix.length;
        int countOfMaxIteration = sideLength / 2;
        int globalIteration = 0;
        while (globalIteration < countOfMaxIteration) {
            shiftRight(matrix, globalIteration, sideLength - globalIteration);
            shiftDown(matrix, globalIteration, sideLength - globalIteration);
            shiftLeft(matrix, globalIteration, sideLength - globalIteration);
            globalIteration++;
        }
    }

    private void shiftRight(int[][] matrix, int iteration, int maxIndex) {
        for (int i = iteration; i < maxIndex - 1; i++) {
            int tempNumberValue = matrix[iteration][i];
            matrix[iteration][i] = matrix[i][maxIndex - 1];
            matrix[i][maxIndex - 1] = tempNumberValue;
        }
    }

    private void shiftDown(int[][] matrix, int iteration, int maxIndex) {
        for (int i = 0; i < maxIndex - 1; i++) {
            int tempNumberValue = matrix[iteration][iteration + i];
            if (i + iteration >= maxIndex - 1) {
                break;
            }
            matrix[iteration][iteration + i] = matrix[maxIndex - 1][maxIndex - 1 - i];
            matrix[maxIndex - 1][maxIndex - 1 - i] = tempNumberValue;
        }
    }

    private void shiftLeft(int[][] matrix, int iteration, int maxIndex) {
        for (int i = 0; i < maxIndex - 1; i++) {
            int tempNumberValue = matrix[iteration][iteration + i];
            if (i + iteration >= maxIndex - 1) {
                break;
            }
            matrix[iteration][iteration + i] = matrix[maxIndex - 1 - i][iteration];
            matrix[maxIndex - 1 - i][iteration] = tempNumberValue;
        }
    }
}
