package com.example.data.api

import com.example.data.model.baseresponse.BaseResponse
import com.example.data.model.character.CharacterData
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.features.get
import io.ktor.client.request.*

class CharactersApi(private val client: HttpClient) {

    fun getCharacterById(id: Int): BaseResponse<CharacterData> = client.get()
}
