package com.marceloasmat.asvabsuccess

import android.media.SubtitleData
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marceloasmat.asvabsuccess.ui.theme.AsvabSuccessTheme

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize().statusBarsPadding().padding(horizontal = 16.dp)) {
        Text(text = "ASVAB Calculator", fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth() )
        Text(text = "Enter your scores", fontSize = 25.sp, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
        InputScores()
        Spacer(Modifier.weight(1f))
        CalculateButton(modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(Modifier.weight(1f))
    }
}

@Composable
fun InputScores(){
    Column(modifier = Modifier, verticalArrangement = Arrangement.spacedBy(10.dp) // Adds 10dp of vertical space between children
    ) {
        UserInputCell("AR", "Arithmetic")
        UserInputCell(title = "GS", subtitle = "General Science")
        UserInputCell(title = "MK", subtitle = "Math Knowledge")
        UserInputCell(title = "MC", subtitle = "Mechanical Comprehension")
        UserInputCell(title = "El", subtitle = "Electrical Knowledge")
        UserInputCell(title = "WK", subtitle = "Word Knowledge")
        UserInputCell(title = "PC", subtitle = "Paragraph Comprehension")
        UserInputCell(title = "VE", subtitle = "Verbal Expression")
    }

}

@Composable
fun CalculateButton(modifier: Modifier = Modifier){
    Button(
        modifier = modifier,
        onClick = {}
    ) {
        Text(text = "Calculate", fontSize = 25.sp)
    }
}

@Composable
fun UserInputCell(title: String, subtitle: String){
    Row {
        Column(modifier = Modifier.weight(1f)) {
            Text(text = title, fontSize = 20.sp, textAlign = TextAlign.Center,)
            Text(text = subtitle, fontSize = 13.sp, )
        }
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.width(60.dp)

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