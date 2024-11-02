package com.engin.portfolio.domain

import androidx.compose.runtime.Stable

@Stable
data class Article(
    val title: String,
    val image: String,
    val date: String,
    val link : String,
)