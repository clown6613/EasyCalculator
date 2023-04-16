package com.example.easy_caluculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.easy_caluculator.history.HistoryScreen
import com.example.easy_caluculator.room.History
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "main") {
                composable(route = "main") {
                    MainScreen({ navController.navigate("history") })
                }
                composable(route = "history") {
                    HistoryScreen(
                        { navController.navigate("main") },
                        listOf(
                            History(1, "1+1+1=2"),
                            History(1, "1+1+1=2"),
                            History(1, "1+1+1=2"),
                            History(1, "1+1+1=2")
                        )
                    )
                }
            }
        }
    }
}


