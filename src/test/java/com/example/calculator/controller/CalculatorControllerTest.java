package com.example.calculator.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorControllerTest {

    CalculatorController controller = new CalculatorController();

    @Test
    void testSumOfPositiveNumbers() {
        assertEquals(8, controller.sum(5, 3));
    }

    @Test
    void testSumWithZero() {
        assertEquals(5, controller.sum(5, 0));
    }
}
