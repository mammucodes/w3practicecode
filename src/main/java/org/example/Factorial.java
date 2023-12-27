package org.example;

public class Factorial {

    public static int getFactorial(int n){
        if(n < 1)
            throw new IllegalArgumentException("only numbers grether than 0 supported!!");
        if(n==1)
            return 1;
        return n * getFactorial(n-1);
    }
}
