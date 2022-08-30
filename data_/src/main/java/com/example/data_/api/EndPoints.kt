package com.example.data_.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

object EndPoints {

    private const val BASE_URL = "https://rickandmortyapi.com/api/"

    const val CHARACTER = "${BASE_URL}character"
    const val LOCATION = "${BASE_URL}location"
    const val EPISODE = "${BASE_URL}episode"

    object CharacterFilters {

        const val NAME = "name"
        const val PAGE = "page"

        sealed class Gender(val value: String) {

            object Female : Gender("female")
            object Male : Gender("male")
            object Genderless : Gender("genderless")
            object Unknown : Gender("unknown")

            companion object {
                const val KEY = "gender"
            }
        }

        @Serializable
        sealed class Status(val value: String) {

            @SerialName("alive")
            object Alive : Status("alive")
            @SerialName("dead")
            object Dead : Status("dead")
            @SerialName("unknown")
            object Unknown : Status("unknown")

            companion object {
                const val KEY = "status"
            }
        }
    }
}
