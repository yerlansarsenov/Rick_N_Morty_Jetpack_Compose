package com.example.data_.model.character

import com.example.data_.api.EndPoints
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CharacterData(
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String,
    @SerialName("status")
    val status: EndPoints.CharacterFilters.Status,
    @SerialName("created")
    val created: String,
    @SerialName("episode")
    val episode: List<String>,
    @SerialName("gender")
    val gender: String,
    @SerialName("image")
    val image: String,
    @SerialName("location")
    val locationData: LocationData,
    @SerialName("origin")
    val origin: LocationData,
    @SerialName("species")
    val species: String,
    @SerialName("type")
    val type: String,
    @SerialName("url")
    val url: String,
    @SerialName("error")
    val error: String?
)
