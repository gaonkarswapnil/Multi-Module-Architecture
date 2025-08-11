package com.example.data.repository

import com.example.data.api.UsersAPI
import com.example.data.mapper.toDomain
import com.example.domain.model.UserResponse
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    val usersAPI: UsersAPI
): UserRepository {
    override suspend fun getUserList(): List<UserResponse> {
        val result = usersAPI.getUsersList()

        if(result.isSuccessful){
            val userList = result.body() ?: emptyList()
            return userList.map { it.toDomain() }
        }else{
            throw Exception("Illegal State Exception")
        }
    }
}