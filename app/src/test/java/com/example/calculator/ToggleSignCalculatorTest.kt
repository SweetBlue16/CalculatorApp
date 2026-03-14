package com.example.calculator

import com.example.calculator.logic.Calculator
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class ToggleSignCalculatorTest {
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun toggleSign_positiveToNegative_returnsNegative() {
        val result = calculator.changeSign(8.0)
        assertEquals(-8.0, result, 0.0)
    }

    @Test
    fun toggleSign_negativeToPositive_returnsPositive() {
        val result = calculator.changeSign(-15.0)
        assertEquals(15.0, result, 0.0)
    }

    @Test
    fun toggleSign_zero_returnsZero() {
        val result = calculator.changeSign(0.0)
        assertEquals(0.0, result, 0.0)
    }
}