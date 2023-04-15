package com.example.easy_caluculator.main

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(CalculateUiState())
    val uiState: StateFlow<CalculateUiState> = _uiState.asStateFlow()

    private var inputNumberList: MutableList<Int> = mutableListOf()
    private val sum = mutableStateOf(0)
    private var formula = ""

    fun calSum(inputNumber: Int) {
        sum.value += inputNumber
        inputNumberList.add(inputNumber)
        formula = inputNumberList.joinToString("+")
        _uiState.value = _uiState.value.copy(formula = formula, sum = sum.value, isEqual = false)
    }

    fun clickAcButton() {
        _uiState.value = _uiState.value.copy(formula = "", sum = 0, isEqual = false)
        inputNumberList = mutableListOf()
        sum.value = 0
    }

    fun clickEqualButton() {
        _uiState.value =
            _uiState.value.copy(formula = sum.value.toString(), sum = 0, isEqual = true)
        inputNumberList = mutableListOf(sum.value)
    }
}
