package com.example.faachallenge.data.remote


import com.google.gson.annotations.SerializedName

data class DataX(
    @SerializedName("hidden")
    val hidden: Int = 0,
    @SerializedName("limit")
    val limit: Int = 0,
    @SerializedName("list")
    val list: List<Info> = listOf(),
    @SerializedName("next")
    val next: Int = 0,
    @SerializedName("offset")
    val offset: Int = 0,
    @SerializedName("total")
    val total: Int = 0
)