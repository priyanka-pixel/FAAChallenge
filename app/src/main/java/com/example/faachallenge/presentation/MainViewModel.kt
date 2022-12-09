package com.example.faachallenge.presentation

import androidx.lifecycle.ViewModel
import com.example.faachallenge.core.Resource
import com.example.faachallenge.data.remote.data
import com.example.faachallenge.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: AppRepository
    ): ViewModel() {
    private val _appList: MutableStateFlow<Resource<data>> =
        MutableStateFlow(Resource.Loading())
    val appList: StateFlow<Resource<data>> = _appList

}