package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sumTest1() {
     // Arrange
       int a = 5;
       int b = 6;

       int expected = -1;

     // Act
     int result = calculator.sub(a, b);


     // Assert
        assertEquals(expected, result);
     // is expected == result

    }

    @Test
    void sumTest2() {
        assertEquals(42,calculator.sum(40,2));
    }

    @Test
    void mulTest() {
        assertEquals(10, calculator.mul(5,2));
    }

    @Test
    void subTest() {
        assertEquals(7,calculator.sub(17,10));
    }

    @Test
    void divTestDividedZero(){
        int a = 10;
        int b = 0;
        assertThrows(ArithmeticException.class, () -> {
            calculator.div(a,b);
        });
    }

    @Test
    void quadTest() {
        assertEquals(25,calculator.quad(5,5));
    }

    @Test
    void powTest() {
        assertEquals(1,calculator.pow(1,1));
    }

}