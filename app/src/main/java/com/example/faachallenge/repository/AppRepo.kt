package com.example.faachallenge.repository

import com.example.faachallenge.core.Resource
import com.example.faachallenge.data.local.App
import com.example.faachallenge.data.remote.data
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class AppRepo @Inject constructor(
    private val app: App
) : AppRepository {
     suspend fun getAppList() = flow<Resource<data>> {
        emit(Resource.Loading())
        try {
            val response = app.getAppList()
            if (response.isSuccessful)
                response.body()?.let { emit(Resource.Success(it)) }
            else
                emit(Resource.Error(response.code().toString()))
        } catch (E: HttpException) {
            emit(Resource.Error("Could not load data"))
        } catch (E: IOException) {
            emit(Resource.Error("Check internet"))
        }
    }

    override suspend fun getApp(): Flow<Resource<data>> {
        TODO("Not yet implemented")
    }
}