package com.engin.portfolio.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.engin.portfolio.domain.Article
import com.engin.portfolio.thene.PortfolioColors
import com.engin.portfolio.thene.getTypography


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ArticleCard(
    modifier: Modifier = Modifier,
    article: Article,
    onClick: (String) -> Unit,
) {
    Card(
        modifier = modifier,
        border = BorderStroke(width = 1.dp, color = PortfolioColors.lightWhite),
        backgroundColor = Color.White,
        contentColor = PortfolioColors.darkNavy,
        onClick = { onClick(article.link) }
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Column {
                AsyncImage(
                    modifier = Modifier.size(300.dp, 175.dp),
                    model = article.image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    modifier = Modifier.padding(horizontal = 6.dp),
                    text = article.title,
                    style = getTypography().h5.copy(
                        color = PortfolioColors.darkNavy,
                        fontWeight = FontWeight.SemiBold
                    ),
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )

            }
            Text(
                modifier = Modifier.align(Alignment.BottomEnd)
                    .padding(horizontal = 6.dp, vertical = 6.dp),
                text = article.date,
                style = getTypography().body2.copy(
                    color = Color.Gray
                ),
            )
        }
    }
}