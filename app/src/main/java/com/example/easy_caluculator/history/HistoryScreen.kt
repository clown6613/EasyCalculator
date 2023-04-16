package com.example.easy_caluculator.history

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.easy_caluculator.room.History

@Composable
fun HistoryScreen(
    onNavigationToMain: () -> Unit,
    viewModel: HistoryViewModel = hiltViewModel()
) {
    val histories by viewModel.histories.collectAsState(initial = emptyList())
    Log.d("COUNT", histories.size.toString())
    Scaffold {
        Box(modifier = Modifier.fillMaxSize()) {
            LazyColumn(modifier = Modifier.padding(it)) {
                item { Spacer(modifier = Modifier.height(50.dp)) }
                items(histories) {
                    Divider(thickness = 2.dp)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = it.history,
                            modifier = Modifier
                                .weight(1f)
                                .padding(15.dp),
                            fontSize = 30.sp
                        )
                        Spacer(modifier = Modifier)
                        IconButton(
                            onClick = { viewModel.clickDeleteButton(it) },
                        ) {
                            Icon(
                                imageVector = Icons.Default.Delete,
                                modifier = Modifier.size(30.dp),
                                contentDescription = ""
                            )
                        }
                    }
                    Divider(thickness = 2.dp)
                }
                item { Spacer(modifier = Modifier.height(50.dp)) }
            }
            if (histories != emptyList<History>()) {
                Row(
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth()
                        .align(Alignment.TopCenter),
                ) {
                    Spacer(modifier = Modifier.weight(1f))
                    Button(
                        onClick = { viewModel.clickAllDeleteButton() },
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .height(40.dp)
                    ) {
                        Text(text = "履歴の全件削除")
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            } else {
                Text(
                    text = "現在、計算履歴は\nありません",
                    modifier = Modifier.fillMaxSize().padding(top = 300.dp),
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center
                )
            }


            Row(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter),
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = onNavigationToMain,
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                        .height(40.dp)
                ) {
                    Text(text = "戻る")
                }
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }
}

@Preview
@Composable
private fun PreviewHistoryScreen() {
    HistoryScreen(
        onNavigationToMain = {},
        viewModel = hiltViewModel()
    )
}
