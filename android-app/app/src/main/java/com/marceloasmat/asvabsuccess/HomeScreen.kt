package com.marceloasmat.asvabsuccess

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.marceloasmat.asvabsuccess.ui.theme.AsvabSuccessTheme

@Composable
fun HomeScreen() {
    Column {
        Text(text = "ASVAB Calculator")
        Text(text = "Enter your scores")
        InputScores()
    }
}

@Composable
fun InputScores(){
    Row {
        Column {
            UserInputCell()
            UserInputCell()
            UserInputCell()
            UserInputCell()
        }
        Column {
            UserInputCell()
            UserInputCell()
            UserInputCell()
            UserInputCell()
        }
    }
}

@Composable
fun UserInputCell(){
    Row {
        Column {
            Text(text = "AR")
            Text(text = "Arithmetic")
        }
        TextField(
            value = "",
            onValueChange = {}
        )
    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    AsvabSuccessTheme {
        HomeScreen()
    }
}