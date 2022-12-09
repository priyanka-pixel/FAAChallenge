package com.example.faachallenge.data.remote


import com.google.gson.annotations.SerializedName

data class Time(
    @SerializedName("human")
    val human: String = "",
    @SerializedName("seconds")
    val seconds: Double = 0.0
)