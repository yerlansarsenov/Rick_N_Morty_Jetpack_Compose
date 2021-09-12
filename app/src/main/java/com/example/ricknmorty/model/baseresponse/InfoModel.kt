package com.example.ricknmorty.model.baseresponse

data class InfoModel(
    val count: Int,
    val next: String?,
    val pages: Int,
    val prev: String?
)
