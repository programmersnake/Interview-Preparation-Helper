package friendly_numbers.solution;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Minus of this solution - long calculation
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("From: ");
        int from = scan.nextInt();
        System.out.print("To: ");
        int to = scan.nextInt();
        HashMap<Integer, Integer> amicableNumbers = findAmicableNumbers(from, to);
        System.out.println("Amicable numbers from " + from + " to " + to + ": " + amicableNumbers);
    }

    /**
     * Amicable numbers are two different numbers so related that the sum of the proper divisors of each is equal to the other number.
     * The first ten amicable pairs are: (220, 284), (1184, 1210), (2620, 2924), (5020, 5564), (6232, 6368), (10744, 10856), (12285, 14595), (17296, 18416), (63020, 76084), and (66928, 66992).
     *
     * @param from from this value
     * @param to to this value
     */
    public static HashMap<Integer, Integer> findAmicableNumbers(int from, int to) {
        HashMap<Integer, Integer> amicableNumbersMap = new HashMap<>();
        for (int i = from; i < to; i++) {
            for (int j = from + 1; j <= to; j++) {
                if (sumProperDivisors(i, j) && sumProperDivisors(j, i)) {
                    if (i != j) {
                        amicableNumbersMap.put(i, j);
                        System.out.println(i + " == " + j);
                    }
                }
            }
        }
        return amicableNumbersMap;
    }

    private static boolean sumProperDivisors(int f, int s) {
        int sumProperDivisors = 0;
        for (int i = (f - 1); i > 0; i--) {
            if ((f % i) == 0) {
                sumProperDivisors += i;
            }
        }
        return sumProperDivisors == s;
    }
}
