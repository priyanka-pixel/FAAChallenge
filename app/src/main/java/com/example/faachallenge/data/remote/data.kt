package com.example.faachallenge.data.remote


import com.google.gson.annotations.SerializedName

data class data(
    @SerializedName("responses")
    val responses: Responses = Responses(),
    @SerializedName("status")
    val status: String = ""
)