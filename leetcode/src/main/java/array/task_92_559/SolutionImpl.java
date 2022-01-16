package array.task_92_559;

import array.task_92_559.solution.Solution_92_559;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Too very bad solution but it is working. More quickly and memory-less in Solution2
 *
 * Runtime: 10 ms
 * Memory Usage: 39.7 MB
 */
public class SolutionImpl implements Solution_92_559 {
    @Override
    public int[] plusOne(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(digits).forEach(stringBuilder::append);
        BigInteger parseInt = new BigInteger(stringBuilder.toString());
        String[] split = String.valueOf(parseInt.add(BigInteger.ONE)).split("");
        return Arrays.stream(split)
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
