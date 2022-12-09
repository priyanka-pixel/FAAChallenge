package com.example.faachallenge.data.local

import com.example.faachallenge.data.remote.data
import com.example.faachallenge.util.Constants.END_URL
import retrofit2.Response
import retrofit2.http.GET

interface App {
    @GET(END_URL)
    suspend fun getAppList(): Response<data>
}