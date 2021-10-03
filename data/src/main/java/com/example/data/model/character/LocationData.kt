package com.example.data.model.character

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LocationData(
    @SerialName("name")
    val name: String,
    @SerialName("url")
    val url: String
)
