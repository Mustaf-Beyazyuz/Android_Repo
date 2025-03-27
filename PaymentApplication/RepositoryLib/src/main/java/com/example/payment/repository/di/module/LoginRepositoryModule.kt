package com.example.payment.repository.di.module

import androidx.transition.Visibility.Mode
import com.example.payment.repository.ILoginInfoRepository
import com.example.payment.repository.IUserRepository
import com.example.payment.repository.LoginInfoRepository
import com.example.payment.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LoginRepositoryModule {
    @Binds
    @Singleton
    abstract fun bindLoginInfoRepository(loginInfoRepository: LoginInfoRepository) : ILoginInfoRepository
}