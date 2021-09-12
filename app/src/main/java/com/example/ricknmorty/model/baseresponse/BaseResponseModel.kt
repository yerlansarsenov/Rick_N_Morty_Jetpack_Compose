package com.example.ricknmorty.model.baseresponse

data class BaseResponseModel<T>(
    val info: InfoModel?,
    val result: List<T>?,
    val errorMessage: String?
)
