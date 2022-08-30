package com.example.data_.api

import com.example.data_.model.baseresponse.BaseResponse
import com.example.data_.model.character.CharacterData
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.request.url

class CharactersApiImpl(private val client: HttpClient): CharactersApi {

    override suspend fun getCharacterById(id: Int): CharacterData? = try {
        client.get {
            url(urlString = "${EndPoints.CHARACTER}/$id")
        }
    } catch (e: Exception) {
        null
    }

    override suspend fun getCharacters(
        id: Int,
        page: Int,
        name: String,
        status: EndPoints.CharacterFilters.Status?,
        gender: EndPoints.CharacterFilters.Gender?
    ): BaseResponse<List<CharacterData>>? = try {
        client.get {
            url(urlString = EndPoints.CHARACTER)
            parameter(EndPoints.CharacterFilters.PAGE, page)
            name.takeIf { it.isNotEmpty() }?.let {
                parameter(EndPoints.CharacterFilters.NAME, it)
            }
            status?.let {
                parameter(EndPoints.CharacterFilters.Status.KEY, it.value)
            }
            gender?.let {
                parameter(EndPoints.CharacterFilters.Gender.KEY, it.value)
            }
        }
    } catch (e: Throwable) {
        null
    }
}
