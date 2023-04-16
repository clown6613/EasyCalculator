package com.example.easy_caluculator.history

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.easy_caluculator.room.History
import com.example.easy_caluculator.room.HistoryDao
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HistoryViewModel @Inject constructor(private val historyDao: HistoryDao) : ViewModel() {
    val histories = historyDao.loadAllHistory().distinctUntilChanged()

    fun clickAllDeleteButton() {
        viewModelScope.launch {
            historyDao.deleteAllHistories()
        }
    }

    fun clickDeleteButton(history: History) {
        viewModelScope.launch {
            historyDao.deleteHistory(history)
        }
    }
}
