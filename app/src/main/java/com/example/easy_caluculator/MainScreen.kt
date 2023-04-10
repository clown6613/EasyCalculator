package com.example.easy_caluculator

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(){
    Scaffold(modifier = Modifier) {
        Column(modifier = Modifier.padding(it)) {
            Text(
                text = "a",
                modifier = Modifier.fillMaxWidth().weight(0.1f)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.size(80.dp)
                ) {
                    Text(text = "7")
                }
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.size(80.dp)) {
                    Text(text = "8")
                }
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.size(80.dp)) {
                    Text(text = "9")
                }
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.size(80.dp)) {
                    Text(text = "4")
                }
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.size(80.dp)) {
                    Text(text = "5")
                }
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.size(80.dp)) {
                    Text(text = "6")
                }
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.size(80.dp)) {
                    Text(text = "1")
                }
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.size(80.dp)) {
                    Text(text = "2")
                }
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.size(80.dp)) {
                    Text(text = "3")
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewMainScreen(){
    MainScreen()
}
