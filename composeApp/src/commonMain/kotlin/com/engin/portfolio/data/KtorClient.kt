package com.engin.portfolio.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get

val client = HttpClient() {
    install(Logging) {
        level = LogLevel.INFO
    }
}