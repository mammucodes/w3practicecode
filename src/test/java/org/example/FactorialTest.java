package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FactorialTest {

   @Test
    public void getFactorialTest() {
       int n = 4;
       int expected = 24;
       int actual = Factorial.getFactorial(n);
       Assertions.assertEquals(expected, actual);
    }
}