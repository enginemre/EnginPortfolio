package com.engin.portfolio.thene

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import enginportfolio.composeapp.generated.resources.Res
import enginportfolio.composeapp.generated.resources.promt_medium
import enginportfolio.composeapp.generated.resources.promt_regular
import enginportfolio.composeapp.generated.resources.promt_semibold
import org.jetbrains.compose.resources.Font

@Composable
fun getTypography() :Typography{
    val promtFamily = FontFamily(
        fonts = listOf(
            Font(
                resource = Res.font.promt_medium,
                weight = FontWeight.Medium,
            ),
            Font(
                resource = Res.font.promt_regular,
                weight = FontWeight.Normal
            ),
            Font(
                resource = Res.font.promt_semibold,
                weight = FontWeight.SemiBold
            )
        )
    )
    return Typography(
        defaultFontFamily = promtFamily
    )
}



