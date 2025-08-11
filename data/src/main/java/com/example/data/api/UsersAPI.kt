package com.example.data.api

import com.example.data.dto.UsersResponseDTO
import retrofit2.Response
import retrofit2.http.GET

interface UsersAPI {

    @GET("users")
    suspend fun getUsersList(): Response<List<UsersResponseDTO>>

}