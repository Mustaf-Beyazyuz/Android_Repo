package com.example.data.service.module

import com.example.data.service.mapper.IUserMapper
import dagger.Binds
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
abstract class UserMapperModule {
    @Binds
    @Singleton
    abstract fun bindUsermapper(userMapperModule: UserMapperModule) : IUserMapper

}