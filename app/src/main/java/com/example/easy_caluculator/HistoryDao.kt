package com.example.easy_caluculator

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface HistoryDao {
    @Insert
    suspend fun insertHistory(history: History)

    @Query("SELECT * FROM History")
    fun loadAllHistory(): Flow<List<History>>

    @Delete
    suspend fun deleteAllHistory(history: History)
}
