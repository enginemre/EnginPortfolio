package com.engin.portfolio.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.engin.portfolio.thene.getTypography
import kotlinx.coroutines.delay


@Composable
fun TypeWriterText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = getTypography().h3.copy(
        color = Color.White,
    ),
    delayMillis: Long = 50L // Her karakterin yazılma süresi
) {
    var currentText by remember { mutableStateOf("") }

    LaunchedEffect(text) {
        while (true) {
            currentText = ""
            text.forEachIndexed { _, char ->
                delay(delayMillis)
                currentText += char
            }
            delay(1000L)
        }
    }

    Text(
        text = currentText,
        style = style,
        modifier = modifier,
        textAlign = TextAlign.Center
    )
}