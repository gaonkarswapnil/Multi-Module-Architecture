package com.example.presentation.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.UserResponse
import com.example.domain.usecase.UserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    val userCase: UserUseCase
) : ViewModel() {

    private val _userList: MutableStateFlow<List<UserResponse>> = MutableStateFlow(emptyList())
    val userList: StateFlow<List<UserResponse>> = _userList

    init {
        getUserList()
    }

    fun getUserList(){
        viewModelScope.launch {
            _userList.value = userCase()
        }
    }

}