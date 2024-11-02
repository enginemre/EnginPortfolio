package com.engin.portfolio.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun Banner(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
     /*   AsyncImage(
            onError = {error ->
                error.result.throwable.printStackTrace()
                println("Error loading image")
            },
            modifier = Modifier.height(150.dp).fillMaxWidth().background(Color.Black),
            model = "https://readme-typing-svg.demolab.com/?font=Prompt&weight=500&size=35&duration=2000&pause=1000&color=FFFFFF&center=true&vCenter=true&width=800&lines=Hi%2C+I%27m+Engin;I%27m+a+Mobile+Application+Developer+;Turning+ideas+into+intuitive+mobile+solutions.", // replace with working URL
            contentDescription = null
        )*/
        TypeWriterText(
            text = "Hi, I'm Engin. I'm a Mobile Application Developer. Turning ideas into intuitive mobile solutions.",
            modifier = Modifier.fillMaxWidth(),
        )
    }
}