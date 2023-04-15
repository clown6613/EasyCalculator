package com.example.easy_caluculator.main

data class CalculateUiState(
    val formula: String = "",
    val sum: Int = 0,
    val isEqual: Boolean = false
)
