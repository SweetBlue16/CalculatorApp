package com.example.calculator

import com.example.calculator.logic.Calculator
import junit.framework.TestCase.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Before
import org.junit.Test

class DivisionCalculatorTest {
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun divide_twoNumbers_returnsCorrectResult() {
        val result = calculator.divide(10.0, 2.0)
        assertEquals(5.0, result, 0.0)
    }

    @Test
    fun divide_resultingInDecimal_returnsCorrectResult() {
        val result = calculator.divide(5.0, 2.0)
        assertEquals(2.5, result, 0.0)
    }

    @Test
    fun divide_byZero_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(10.0, 0.0)
        }
    }
}