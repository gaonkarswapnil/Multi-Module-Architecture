package com.example.domain.usecase

import com.example.domain.model.UserResponse
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class UserUseCase @Inject constructor(
    val userRepo: UserRepository
) {

    suspend operator fun invoke(): List<UserResponse>{
        return userRepo.getUserList()
    }

}