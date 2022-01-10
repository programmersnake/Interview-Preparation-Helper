package fibonacci_numbers;

public class Fibonacci {

    public int calculate(int n) {
        int fibonacciValue = 0;
        int oldValue = 0;
        int newValue = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                continue;
            }
            else if (i == 1) {
                newValue = 1;
                fibonacciValue = oldValue + newValue;
            } else {
                fibonacciValue = oldValue + newValue;
                oldValue = newValue;
                newValue = fibonacciValue;
            }

        }
        return fibonacciValue;
    }
}