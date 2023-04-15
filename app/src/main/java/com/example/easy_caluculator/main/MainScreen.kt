package com.example.easy_caluculator

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.easy_caluculator.main.MainViewModel

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun MainScreen(
    onNavigationToHistory: () -> Unit,
    viewModel: MainViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(modifier = Modifier.padding(20.dp)) {
        Column(modifier = Modifier.padding(it)) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f)
                    .padding(bottom = 50.dp)
                    .background(color = Color.LightGray)
            ) {
                Column {
                    Row {
                        Text(
                            text = uiState.formula,
                            fontSize = 50.sp,
                            modifier = Modifier
                                .fillMaxWidth()
                                .horizontalScroll(rememberScrollState()),
                            textAlign = TextAlign.Center
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    if (!uiState.isEqual) {
                        Text(
                            text = uiState.sum.toString(),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 20.dp, end = 40.dp),
                            color = Color.Gray,
                            fontSize = 40.sp,
                            textAlign = TextAlign.End
                        )
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = { viewModel.clickAcButton() },
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
                Button(
                    onClick = { viewModel.clickEqualButton() },
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
                IconButton(
                    onClick = onNavigationToHistory,
                ) {
                    Icon(
                        imageVector = Icons.Default.History,
                        contentDescription = "",
                        modifier = Modifier.size(40.dp)
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
                    NumberButton(number = 7, viewModel = viewModel)
                    NumberButton(number = 8, viewModel = viewModel)
                    NumberButton(number = 9, viewModel = viewModel)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    NumberButton(number = 4, viewModel = viewModel)
                    NumberButton(number = 5, viewModel = viewModel)
                    NumberButton(number = 6, viewModel = viewModel)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    NumberButton(number = 1, viewModel = viewModel)
                    NumberButton(number = 2, viewModel = viewModel)
                    NumberButton(number = 3, viewModel = viewModel)
                }
            }
        }
    }
}

@Composable
private fun NumberButton(
    number: Int,
    viewModel: MainViewModel
) {
    Button(
        onClick = { viewModel.calSum(number) },
        modifier = Modifier.size(80.dp)
    ) {
        Text(
            text = number.toString(),
            fontSize = 35.sp
        )
    }
}

@Preview
@Composable
private fun PreviewMainScreen() {
    MainScreen(
        onNavigationToHistory = {},
        MainViewModel()
    )
}
