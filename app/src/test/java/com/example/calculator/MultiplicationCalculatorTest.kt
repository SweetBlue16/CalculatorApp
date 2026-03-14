package com.example.calculator

import com.example.calculator.logic.Calculator
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class MultiplicationCalculatorTest {
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun multiply_twoPositiveNumbers_returnsCorrectResult() {
        val result = calculator.multiply(4.0, 5.0)
        assertEquals(20.0, result, 0.0)
    }

    @Test
    fun multiply_byZero_returnsZero() {
        val result = calculator.multiply(9.0, 0.0)
        assertEquals(0.0, result, 0.0)
    }

    @Test
    fun multiply_positiveAndNegative_returnsNegativeResult() {
        val result = calculator.multiply(6.0, -2.0)
        assertEquals(-12.0, result, 0.0)
    }
}