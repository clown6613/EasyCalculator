package com.example.easy_caluculator

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(CalculateUiState())
    val uiState: StateFlow<CalculateUiState> = _uiState.asStateFlow()

    private val sum = mutableStateOf(0)
    fun calSum(inputNumber: Int) {
        sum.value += inputNumber
        _uiState.value = _uiState.value.copy(sum = sum.value)
    }
}
