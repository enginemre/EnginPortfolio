package com.engin.portfolio.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.engin.portfolio.thene.PortfolioColors
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ProjectCard(
    modifier: Modifier = Modifier,
    leftLink: String,
    rightLink: String,
    drawable: DrawableResource,
    onClick: (String) -> Unit,
) {
    Card(
        modifier = modifier,
        border = BorderStroke(width = 1.dp, color = PortfolioColors.lightWhite),
        backgroundColor = Color.White,
        contentColor = PortfolioColors.darkNavy,
    ) {
        val interactionSource = remember { MutableInteractionSource() }

        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier.fillMaxWidth(),
                painter = painterResource(drawable),
                contentDescription = null
            )
            Row(
                modifier = Modifier
                    .matchParentSize()
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .clickable(
                            indication = null,
                            interactionSource = interactionSource
                        ) { onClick(leftLink) }
                )

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .clickable(
                            indication = null,
                            interactionSource = interactionSource
                        ) { onClick(rightLink) }
                )
            }
        }
    }
}