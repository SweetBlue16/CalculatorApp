package com.example.calculator

import com.example.calculator.logic.Calculator
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class PercentageCalculatorTest {
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun percentage_ofPositiveNumber_returnsCorrectDecimal() {
        val result = calculator.percentage(50.0)
        assertEquals(0.5, result, 0.0)
    }

    @Test
    fun percentage_ofZero_returnsZero() {
        val result = calculator.percentage(0.0)
        assertEquals(0.0, result, 0.0)
    }

    @Test
    fun percentage_ofNegativeNumber_returnsNegativeDecimal() {
        val result = calculator.percentage(-25.0)
        assertEquals(-0.25, result, 0.0)
    }
}