package com.example.calculator

import com.example.calculator.logic.Calculator
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class FormatResultCalculatorTest {
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun formatResult_wholeNumber_removesDecimalPoint() {
        val result = calculator.formatResult(5.0)
        assertEquals("5", result)
    }

    @Test
    fun formatResult_decimalNumber_keepsDecimalPoint() {
        val result = calculator.formatResult(5.5)
        assertEquals("5.5", result)
    }

    @Test
    fun formatResult_zero_returnsZeroString() {
        val result = calculator.formatResult(0.0)
        assertEquals("0", result)
    }
}