package com.example.domain.repository

import com.example.domain.model.UserResponse

interface UserRepository {
    suspend fun getUserList(): List<UserResponse>
}