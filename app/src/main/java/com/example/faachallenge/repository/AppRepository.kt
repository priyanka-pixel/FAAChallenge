package com.example.faachallenge.repository

import com.example.faachallenge.core.Resource
import com.example.faachallenge.data.remote.data
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    suspend fun getApp(): Flow<Resource<data>>
}