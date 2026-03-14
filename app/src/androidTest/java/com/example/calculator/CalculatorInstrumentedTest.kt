package com.example.calculator

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.calculator.ui.theme.CalculatorScreen
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class CalculatorInstrumentedTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp() {
        composeTestRule.setContent {
            CalculatorScreen()
        }
    }

    @Test
    fun performOperation_showsResultAndSavesHistory() {
        composeTestRule.onNodeWithText("4").performClick()
        composeTestRule.onNodeWithText("×").performClick()
        composeTestRule.onNodeWithText("5").performClick()
        composeTestRule.onNodeWithText("=").performClick()

        composeTestRule.onNodeWithTag("calculator_display")
            .assertTextEquals("20")

        composeTestRule.onNodeWithTag("calculator_history_0")
            .assertTextEquals("4 × 5 = 20")
    }

    @Test
    fun divisionByZero_showsErrorOnDisplay() {
        composeTestRule.onNodeWithText("8").performClick()
        composeTestRule.onNodeWithText("÷").performClick()
        composeTestRule.onNodeWithText("0").performClick()
        composeTestRule.onNodeWithText("=").performClick()

        composeTestRule.onNodeWithTag("calculator_display")
            .assertTextEquals("Error")
    }

    @Test
    fun testClearEntry_resetsCurrentNumberButKeepsOperation() {
        composeTestRule.onNodeWithText("9").performClick()
        composeTestRule.onNodeWithText("+").performClick()
        composeTestRule.onNodeWithText("5").performClick()

        composeTestRule.onNodeWithText("C").performClick()

        composeTestRule.onNodeWithText("2").performClick()
        composeTestRule.onNodeWithText("=").performClick()

        composeTestRule.onNodeWithTag("calculator_display")
            .assertTextEquals("11")
    }
}