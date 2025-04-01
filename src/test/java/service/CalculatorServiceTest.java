package com.example.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    @InjectMocks
    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSumOfPositiveNumbers() {
        int result = calculatorService.sum(5, 3);
        assertEquals(8, result, "La suma de 5 + 3 debe ser 8");
    }

    @Test
    void testSumWithZero() {
        int result = calculatorService.sum(5, 0);
        assertEquals(5, result, "La suma de 5 + 0 debe ser 5");
    }

    @Test
    void testSumOfNegativeNumbers() {
        int result = calculatorService.sum(-2, -3);
        assertEquals(-5, result, "La suma de -2 + -3 debe ser -5");
    }
}
