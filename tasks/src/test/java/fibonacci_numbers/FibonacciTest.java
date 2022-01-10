package fibonacci_numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    void testCalculateBy5() {
        Fibonacci fibonacci = new Fibonacci();
        int expected = 3;
        int actualResult = fibonacci.calculate(5);
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void testCalculateBy10() {
        Fibonacci fibonacci = new Fibonacci();
        int expected = 34;
        int actualResult = fibonacci.calculate(10);
        Assertions.assertEquals(expected, actualResult);
    }
}