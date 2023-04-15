package com.example.easy_caluculator

import android.content.Context
import androidx.room.Room
import com.example.easy_caluculator.room.AppDatabase
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@dagger.Module
@InstallIn(SingletonComponent::class)
object Module {

    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, AppDatabase::class.java, "history_database").build()

    @Provides
    fun provideDao(db: AppDatabase) = db.historyDao()
}
