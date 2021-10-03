package com.example.data.model.baseresponse

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BaseResponse<T>(
    @SerialName("info")
    val infoData: InfoData?,
    @SerialName("result")
    val result: List<T>?,
    @SerialName("error")
    val error: String?
)