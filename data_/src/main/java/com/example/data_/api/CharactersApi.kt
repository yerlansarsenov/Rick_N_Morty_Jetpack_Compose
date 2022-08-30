package com.example.data_.api

import com.example.data_.model.baseresponse.BaseResponse
import com.example.data_.model.character.CharacterData
import com.example.data_.network.ktorHttpClient

interface CharactersApi {

    suspend fun getCharacters(
        id: Int,
        page: Int = 1,
        name: String = "",
        status: EndPoints.CharacterFilters.Status? = null,
        gender: EndPoints.CharacterFilters.Gender? = null
    ): BaseResponse<List<CharacterData>>?

    suspend fun getCharacterById(id: Int): CharacterData?

    companion object Factory {
        fun create(): CharactersApi = CharactersApiImpl(
            client = ktorHttpClient
        )
    }
}
