package com.example.calculator

import com.example.calculator.logic.Calculator
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class SubtractionCalculatorTest {
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun subtract_smallerFromLarger_returnsPositiveResult() {
        val result = calculator.subtract(10.0, 4.0)
        assertEquals(6.0, result, 0.0)
    }

    @Test
    fun subtract_largerFromSmaller_returnsNegativeResult() {
        val result = calculator.subtract(4.0, 10.0)
        assertEquals(-6.0, result, 0.0)
    }

    @Test
    fun subtract_negativeNumber_addsToResult() {
        val result = calculator.subtract(5.0, -3.0)
        assertEquals(8.0, result, 0.0)
    }
}