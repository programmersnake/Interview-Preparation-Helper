package tasks1;

public class Fibonacci {

    public int calc (int n) {
        if(n==0)
            return 1;
        else if(n==1)
            return 1;
        else
            return (calc( n-1 )+calc( n-2 ));
    }

}
