package com.example.ricknmorty.ui.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import com.example.ricknmorty.model.character.CharacterModel
import com.example.ricknmorty.ui.character.CharacterCard

@Composable
fun CharactersList(
    characters: List<CharacterModel>
) {
    LazyColumn {
        itemsIndexed(
            items = characters
        ) { i, char ->
            CharacterCard(
                model = char,
            ) {
                // todo onClick char
            }
        }
    }
}
