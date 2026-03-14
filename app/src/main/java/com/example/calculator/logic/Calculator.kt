package com.example.calculator.logic

import kotlin.math.roundToLong

class Calculator {
    fun add(a: Double, b: Double): Double = a + b

    fun subtract(a: Double, b: Double): Double = a - b

    fun multiply(a: Double, b: Double): Double = a * b

    fun divide(a: Double, b: Double): Double {
        require(b != 0.0) {
            "No se puede dividir entre cero."
        }
        return a / b
    }

    fun percentage(a: Double): Double = a / 100.0

    fun changeSign(a: Double): Double = -a

    fun formatResult(value: Double): String {
        return if (value == value.roundToLong().toDouble()) {
            value.roundToLong().toString()
        } else {
            value.toString()
        }
    }
}