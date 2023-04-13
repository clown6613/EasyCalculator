package com.example.easy_caluculator

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(CalculateUiState())
    val uiState: StateFlow<CalculateUiState> = _uiState.asStateFlow()

    fun calSum(inputNumber: Int) {
        _uiState.value.sum += inputNumber
        _uiState.value = _uiState.value.copy(sum = _uiState.value.sum)
    }
}
