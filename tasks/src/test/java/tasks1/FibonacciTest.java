package tasks1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    void calc() {

        Fibonacci fibonacci = new Fibonacci();
        int calc = fibonacci.calc( 5 );
        Assertions.assertEquals( calc, 8 );

    }
}