package com.example.faachallenge.data.remote


import com.google.gson.annotations.SerializedName

data class ListApps(
    @SerializedName("datasets")
    val datasets: Datasets = Datasets(),
    @SerializedName("info")
    val info: InfoX = InfoX()
)