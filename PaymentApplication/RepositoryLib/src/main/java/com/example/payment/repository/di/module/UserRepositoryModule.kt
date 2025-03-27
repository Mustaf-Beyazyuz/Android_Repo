package com.example.payment.repository.di.module

import androidx.transition.Visibility.Mode
import com.example.payment.repository.IUserRepository
import com.example.payment.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class UserRepositoryModule {
    @Binds
    @Singleton
    abstract fun bindUserRepository(userRepository: UserRepository) : IUserRepository
}