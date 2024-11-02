package com.engin.portfolio.thene

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun EnginPortfolioTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = getTypography(),
        content = content
    )
}