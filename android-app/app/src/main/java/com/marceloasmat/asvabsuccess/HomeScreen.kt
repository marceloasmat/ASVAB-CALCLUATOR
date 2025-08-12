package com.marceloasmat.asvabsuccess

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.marceloasmat.asvabsuccess.ui.theme.AsvabSuccessTheme

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ASVAB Calculator")
        Text(text = "Enter your scores")
        InputScores()
    }
}

@Composable
fun InputScores(){
    Row(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.weight(1f)) {
            UserInputCell()
            UserInputCell()
            UserInputCell()
            UserInputCell()
        }
        Column(modifier = Modifier.weight(1f)) {
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