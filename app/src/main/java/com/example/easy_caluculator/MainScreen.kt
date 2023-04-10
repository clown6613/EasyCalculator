package com.example.easy_caluculator

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(){
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(it)) {
            Text(
                text = "a",
                modifier = Modifier.fillMaxWidth().weight(0.5f)
            )

            Column(
                modifier = Modifier.fillMaxSize().weight(0.5f),
                verticalArrangement = Arrangement.spacedBy(50.dp)
            ){
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(
                            text = "7",
                            fontSize = 35.sp
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(text = "8",
                            fontSize = 35.sp
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(
                            text = "9",
                            fontSize = 35.sp
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(text = "4",
                            fontSize = 35.sp
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(text = "5",
                            fontSize = 35.sp
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(text = "6",
                            fontSize = 35.sp
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(text = "1",
                            fontSize = 35.sp
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(text = "2",
                            fontSize = 35.sp
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(text = "3",
                            fontSize = 35.sp
                        )
                    }
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
