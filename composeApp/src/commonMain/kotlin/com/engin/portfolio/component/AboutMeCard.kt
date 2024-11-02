package com.engin.portfolio.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.engin.portfolio.thene.PortfolioColors


@Composable
fun AboutMeCard(
    title: String,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Row(
            modifier = modifier.zIndex(2f).padding(start = 24.dp).align(Alignment.TopStart)
        ) {
            TitleCard(
                title = title
            )
        }
        Surface(
            modifier = Modifier.fillMaxSize().padding(top = 18.dp),
            shape = RoundedCornerShape(32.dp),
            color = PortfolioColors.lightWhite,
        ) {
            Column(
                modifier = Modifier.align(Alignment.Center).padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 36.dp,
                    bottom = 16.dp
                ),
            ) {
                Text(
                    text = "Hey there! I'm a Native Android Developer with over 5 years of experience, and I’m all about Kotlin Multiplatform and Compose. Obsessed with learning the latest tech and finding the perfect tools for every project. If you're into exploring new stuff and leveling up together, hit that follow button and join the adventure!",
                    style = MaterialTheme.typography.body2.copy(fontWeight = FontWeight.Medium),
                )
            }

        }
    }
}