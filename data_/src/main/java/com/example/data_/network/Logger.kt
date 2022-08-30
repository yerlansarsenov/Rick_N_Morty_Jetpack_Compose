package com.example.data_.network

import io.ktor.client.features.logging.Logger

object LoggerObject : Logger {

    fun log(any: Any) {
        log("$any")
    }

    override fun log(message: String) {
        println("$TAG: $message")
    }

    private const val TAG = "KtorLogger"
}
