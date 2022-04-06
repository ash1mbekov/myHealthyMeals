package com.ashimbekov.myhealthymeals.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Statistics() {
    CircleNut()
    Nutritional()
}

@Composable
fun CircleNut(){
Row(modifier = Modifier.padding(top = 10.dp)) {
    Box(modifier = Modifier.background(Color.Cyan)){
        CircularProgressIndicator(progress = 4f)

    }
}
}

@Composable
fun Nutritional(){
    Row(modifier = Modifier
        .fillMaxSize()
        .padding(top = 80.dp), horizontalArrangement = Arrangement.SpaceAround) {
            Box(contentAlignment = Alignment.Center, modifier = Modifier
                .background(Color.Green)
                .width(90.dp)){
                Column {
                    Text(text = "Углеводы", style = TextStyle(fontSize = 18.sp))
                    LinearProgressIndicator(progress = 0f)
                    Text(text="0/200", textAlign = TextAlign.Center, style = TextStyle(fontSize = 16.sp))
                }
            }

            Box(contentAlignment = Alignment.Center, modifier = Modifier
                .background(Color.Yellow)
                .width(90.dp)){
                Column {
                    Text(text = "Белки", style = TextStyle(fontSize = 18.sp))
                    LinearProgressIndicator(progress = 0f)
                    Text(text="0/200", textAlign = TextAlign.Center, style = TextStyle(fontSize = 16.sp))
                }
            }
            Box(contentAlignment = Alignment.Center, modifier = Modifier
                .background(Color.Yellow)
                .width(90.dp)){
                Column {
                    Text(text = "Жиры", style = TextStyle(fontSize = 19.sp))
                    LinearProgressIndicator()
                    Text(text="0/200", textAlign = TextAlign.Center, style = TextStyle(fontSize = 16.sp))
                }
            }

    }
}


@Preview
@Composable
fun StatiscticsPrev(){
    Statistics()
}