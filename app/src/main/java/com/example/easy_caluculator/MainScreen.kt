package com.example.easy_caluculator

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen() {
    Scaffold(modifier = Modifier.padding(20.dp)) {
        Column(modifier = Modifier.padding(it)) {
            Text(
                text = "a",
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f)
            )
            Row(modifier = Modifier.fillMaxWidth()) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(40.dp),
                    colors = buttonColors(backgroundColor = Color.Red)
                ) {
                    Text(
                        text = "AC",
                        modifier = Modifier,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
                Spacer(modifier = Modifier.width(70.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(50.dp),
                    colors = buttonColors(backgroundColor = Color.Green),
                    shape = RectangleShape
                ) {
                    Text(
                        text = "=",
                        modifier = Modifier,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color.White
                    )

                }
            }

            Spacer(modifier = Modifier.height(100.dp))

            Column(
                modifier = Modifier.weight(0.7f),
                verticalArrangement = Arrangement.spacedBy(50.dp)
            ) {
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
                        Text(
                            text = "8",
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
                        Text(
                            text = "4",
                            fontSize = 35.sp
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(
                            text = "5",
                            fontSize = 35.sp
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(
                            text = "6",
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
                        Text(
                            text = "1",
                            fontSize = 35.sp
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(
                            text = "2",
                            fontSize = 35.sp
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Text(
                            text = "3",
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
private fun PreviewMainScreen() {
    MainScreen()
}
