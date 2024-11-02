package com.engin.portfolio

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import com.engin.portfolio.component.AboutMeCard
import com.engin.portfolio.component.ArticleCard
import com.engin.portfolio.component.Banner
import com.engin.portfolio.component.ContactCard
import com.engin.portfolio.component.ProjectCard
import com.engin.portfolio.domain.Article
import com.engin.portfolio.thene.EnginPortfolioTheme
import com.engin.portfolio.thene.PortfolioColors
import com.engin.portfolio.thene.getTypography
import enginportfolio.composeapp.generated.resources.Res
import enginportfolio.composeapp.generated.resources.hizir_cay

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun App() {
    val articles = listOf(
        Article(
            title = "Polymorphic Response Handling with KotlinX Serialization",
            date = "Nov 14, 2023",
            link = "https://medium.com/stackademic/polymorphic-response-handling-in-android-b0ae4dad93d8",
            image = "https://miro.medium.com/v2/resize:fit:720/format:webp/1*wZAzcPtWGV9nb6-jgoRSqA.png"
        ),
        Article(
            title = "Test Your Android App | Unit Test With MockK",
            date = "Nov 14, 2023",
            link = "https://medium.com/getir/test-your-android-app-unit-test-with-mockk-28c1c465bafc",
            image = "https://miro.medium.com/v2/resize:fit:720/format:webp/1*-dIIJrzin0i1TRoPOslE9Q.jpeg"
        ),
        Article(
            title = "Test Your Android App | UI Test with Espresso",
            date = "Jun 27, 2023",
            link = "https://medium.com/@engiinemre/test-your-android-app-ui-test-with-espresso-7a5650d66323",
            image = "https://miro.medium.com/v2/resize:fit:720/format:webp/0*idua7rd9GcrBdpQY"
        ),
    )
    val uriHandler = LocalUriHandler.current
    EnginPortfolioTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = PortfolioColors.darkNavy
        ) {
            Column(Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
                Banner(
                    modifier = Modifier.fillMaxWidth().height(500.dp)
                        .padding(horizontal = 64.dp, vertical = 24.dp)
                )
                Text(
                    modifier = Modifier.padding(horizontal = 64.dp),
                    text = "Articles",
                    style = getTypography().h5.copy(
                        color = PortfolioColors.lightWhite
                    )
                )
                Spacer(Modifier.height(24.dp))
                FlowRow(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 64.dp)
                ) {
                    articles.forEach { article ->
                        ArticleCard(
                            modifier = Modifier.padding(12.dp).size(300.dp),
                            article = article,
                            onClick = { uriHandler.openUri(article.link) }
                        )
                    }
                }
                Spacer(Modifier.height(24.dp))
                Text(
                    modifier = Modifier.padding(horizontal = 64.dp),
                    text = "Projects",
                    style = getTypography().h5.copy(
                        color = PortfolioColors.lightWhite
                    )
                )
                Spacer(Modifier.height(24.dp))
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 64.dp)
                ) {
                    ProjectCard(
                        modifier = Modifier.weight(1f).padding(12.dp),
                        rightLink = "https://apps.apple.com/us/app/h%C4%B1z%C4%B1r-%C3%A7ay/id6680188775",
                        drawable = Res.drawable.hizir_cay,
                        leftLink = "https://play.google.com/store/apps/details?id=com.hizirglobal.hizircay",
                        onClick = { uriHandler.openUri(it) }
                    )
                    ProjectCard(
                        modifier = Modifier.weight(1f).padding(12.dp),
                        rightLink = "https://apps.apple.com/us/app/h%C4%B1z%C4%B1r-%C3%A7ay/id6680188775",
                        leftLink = "https://play.google.com/store/apps/details?id=com.hizirglobal.hizircay",
                        drawable = Res.drawable.hizir_cay,
                        onClick = { uriHandler.openUri(it) }
                    )
                }
                Spacer(Modifier.height(24.dp))
                FlowRow(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 64.dp),
                    horizontalArrangement = Arrangement.spacedBy(24.dp),
                    verticalArrangement = Arrangement.spacedBy(24.dp)
                ) {
                    ContactCard(
                        modifier = Modifier.weight(1f).heightIn(max = 300.dp),
                        onClick = { uriHandler.openUri(it) },
                        title = "Follow me",
                    )
                    AboutMeCard(
                        modifier = Modifier.weight(1f).heightIn(max = 300.dp),
                        title = "About me",
                    )
                }
                Spacer(Modifier.height(24.dp))
            }

        }

    }
}