package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addsNumbers() {
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    void subtractsNumbers() {
        assertEquals(-1, calculator.subtract(3, 4));
    }

    @Test
    void multipliesNumbers() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void dividesNumbers() {
        assertEquals(2, calculator.divide(8, 4));
    }

    @Test
    void divideByZeroThrows() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
        assertEquals("divisor must not be zero", ex.getMessage());
    }
}
