package com.example.faachallenge.data.remote


import com.google.gson.annotations.SerializedName

data class Responses(
    @SerializedName("listApps")
    val listApps: ListApps = ListApps()
)