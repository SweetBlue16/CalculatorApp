package com.example.calculator

import com.example.calculator.logic.Calculator
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class AdditionCalculatorTest {
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun add_twoPositiveNumbers_returnsCorrectResult() {
        val result = calculator.add(5.0, 3.0)
        assertEquals(8.0, result, 0.0)
    }

    @Test
    fun add_negativeNumbers_returnsCorrectResult() {
        val result = calculator.add(-5.0, -3.0)
        assertEquals(-8.0, result, 0.0)
    }

    @Test
    fun add_decimalNumbers_returnsCorrectResult() {
        val result = calculator.add(2.5, 3.1)
        assertEquals(5.6, result, 0.0001)
    }
}