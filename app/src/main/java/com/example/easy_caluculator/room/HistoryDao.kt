package com.example.easy_caluculator.room

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

    @Query("DELETE FROM History")
    suspend fun deleteAllHistories()

    @Delete
    suspend fun deleteHistory(history: History)
}
