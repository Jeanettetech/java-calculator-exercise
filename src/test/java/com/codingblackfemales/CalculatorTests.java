package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubstraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("multiply two numbers")
    public void testMultiplication() {
        final Integer product = Calculator.multiply(3, 3);

        assertEquals(9, product);
    }

    @Test
    @DisplayName("divide two numbers")
    public void testDivision() {
        final Integer quotient = Calculator.divide(4, 2);

        assertEquals(2, quotient);
    }

    @Test
    @DisplayName("multiply a negative and a positive number")
    public void testMultiplicationWithNegativeAndPositive() {
        final Integer product = Calculator.multiply(3, -1);

        assertEquals(-3, product);
    }

    @Test
    @DisplayName("multiply a number times zero")
    public void testMultiplicationByZero() {
        final Integer product = Calculator.multiply(4, 0);

        assertEquals(0, product);
    }

    @Test
    @DisplayName("multiply two negative numbers")
    public void testMultiplicationWithTwoNegatives() {
        final Integer product = Calculator.multiply(-3, -3);

        assertEquals(9, product);
    }

}
