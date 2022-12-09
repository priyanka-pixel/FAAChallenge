package com.example.faachallenge.data.remote


import com.google.gson.annotations.SerializedName

data class Datasets(
    @SerializedName("all")
    val all: All = All()
)