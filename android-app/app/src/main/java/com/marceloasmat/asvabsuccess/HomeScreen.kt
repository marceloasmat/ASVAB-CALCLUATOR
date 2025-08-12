package com.marceloasmat.asvabsuccess

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.marceloasmat.asvabsuccess.ui.theme.AsvabSuccessTheme

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize().statusBarsPadding()) {
        Text(text = "ASVAB Calculator", fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth() )
        Text(text = "Enter your scores", fontSize = 25.sp, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
        InputScores()
        CalculateButton()
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
fun CalculateButton(){
    Button(
        onClick = {}
    ) {
        Text(text = "Calculate")
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