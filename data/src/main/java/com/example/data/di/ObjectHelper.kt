package com.example.data.di

import com.example.data.repository.UserRepositoryImpl
import com.example.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ObjectHelper {

    @Provides
    @Singleton
    fun provideUserHelper(user: UserRepositoryImpl): UserRepository{
        return user
    }

}