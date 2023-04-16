package com.example.easy_caluculator.history

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.easy_caluculator.room.History

@Composable
fun HistoryScreen(
    onNavigationToMain: () -> Unit,
    forums: List<History>
) {
    Scaffold {
        Box(modifier = Modifier.fillMaxSize()) {
            LazyColumn(modifier = Modifier.padding(it)) {
                item { Spacer(modifier = Modifier.height(50.dp)) }
                items(forums) {
                    Divider()
                    Text(
                        text = it.history,
                        fontSize = 100.sp
                    )
                    Divider()
                }
                item { Spacer(modifier = Modifier.height(50.dp)) }
            }
            Row(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .align(Alignment.TopCenter),
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .height(40.dp)
                ) {
                    Text(text = "履歴の全件削除")
                }
                Spacer(modifier = Modifier.weight(1f))
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
        forums = listOf(
            History(1, "1+1+1=2"),
            History(1, "1+1+1=2"),
            History(1, "1+1+1=2"),
            History(1, "1+1+1=2")
        )
    )
}
