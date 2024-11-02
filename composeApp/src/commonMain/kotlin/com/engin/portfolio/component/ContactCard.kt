package com.engin.portfolio.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.engin.portfolio.thene.PortfolioColors
import enginportfolio.composeapp.generated.resources.Res
import enginportfolio.composeapp.generated.resources.github
import enginportfolio.composeapp.generated.resources.linkedin
import enginportfolio.composeapp.generated.resources.medium
import org.jetbrains.compose.resources.painterResource


@Composable
fun ContactCard(
    title: String,
    onClick: (String) -> Unit,
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
            modifier = Modifier.fillMaxSize().align(Alignment.CenterStart).padding(top = 18.dp),
            shape = RoundedCornerShape(32.dp),
            color = PortfolioColors.lightWhite,
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 36.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    modifier = Modifier.clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null,
                        role = Role.Button,
                        onClick = { onClick("https://github.com/enginemre") }
                    ),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        modifier = Modifier.size(48.dp),
                        painter = painterResource(Res.drawable.github),
                        contentDescription = null
                    )
                    Spacer(Modifier.width(12.dp))
                    Text(
                        text = "Github",
                        style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Medium)
                    )
                }
                Row(
                    modifier = Modifier.clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null,
                        role = Role.Button,
                        onClick = { onClick("https://www.linkedin.com/in/engiinemre/") }
                    ),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        modifier = Modifier.size(48.dp),
                        painter = painterResource(Res.drawable.linkedin),
                        contentDescription = null
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = "Linkedin",
                        style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Medium)
                    )
                }
                Row(
                    modifier = Modifier.padding(start = 6.dp).clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null,
                        role = Role.Button,
                        onClick = { onClick("https://medium.com/@engiinemre") }
                    ),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        modifier = Modifier.size(40.dp),
                        painter = painterResource(Res.drawable.medium),
                        contentDescription = null
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = "Medium",
                        style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Medium)
                    )
                }
            }

        }
    }
}


