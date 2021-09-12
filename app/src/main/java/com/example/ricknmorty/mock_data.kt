package com.example.ricknmorty

import com.example.ricknmorty.model.character.CharacterModel
import com.example.ricknmorty.model.character.LocationModel

val mockListItems = listOf<CharacterModel>(
    CharacterModel(
        created = "",
        episode = emptyList(),
        gender = "Male",
        id = 581,
        image = "https://rickandmortyapi.com/api/character/avatar/581.jpeg",
        location = LocationModel("", ""),
        name = "Snake",
        origin = LocationModel("", ""),
        species = "",
        status = "",
        type = "",
        url = ""
    ),
    CharacterModel(
        created = "",
        episode = emptyList(),
        gender = "Male",
        id = 1,
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
        location = LocationModel("", ""),
        name = "Rick Sanchez",
        origin = LocationModel("", ""),
        species = "",
        status = "",
        type = "",
        url = ""
    ),
    CharacterModel(
        created = "",
        episode = emptyList(),
        gender = "Male",
        id = 2,
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg",
        location = LocationModel("", ""),
        name = "Morty Smith",
        origin = LocationModel("", ""),
        species = "",
        status = "",
        type = "",
        url = ""
    ),
    CharacterModel(
        created = "",
        episode = emptyList(),
        gender = "Male",
        id = 3,
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg",
        location = LocationModel("", ""),
        name = "Summer Smith",
        origin = LocationModel("", ""),
        species = "",
        status = "",
        type = "",
        url = ""
    )
)