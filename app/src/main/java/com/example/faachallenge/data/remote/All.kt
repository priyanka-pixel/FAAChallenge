package com.example.faachallenge.data.remote


import com.google.gson.annotations.SerializedName

data class All(
    @SerializedName("data")
    val `data`: DataX = DataX(),
    @SerializedName("info")
    val info: InfoX = InfoX()
)