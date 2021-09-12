package com.example.ricknmorty.model.character

data class CharacterModel(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: LocationModel,
    val name: String,
    val origin: LocationModel,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)
