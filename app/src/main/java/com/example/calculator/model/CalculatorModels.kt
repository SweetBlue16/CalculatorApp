package com.example.calculator.model

data class CalculatorUiState(
    val display: String = "0",
    val expression: String = "",
    val history: List<String> = emptyList(),
    val currentNumber: String = "0",
    val previousNumber: Double? = null,
    val currentOperator: String? = null,
    val restartDisplay: Boolean = false
)

enum class ButtonKind {
    Number, Control, Operator
}

data class CalculatorButtonUi(
    val label: String,
    val kind: ButtonKind,
    val action: CalculatorAction
)