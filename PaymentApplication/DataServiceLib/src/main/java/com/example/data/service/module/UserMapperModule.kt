package com.example.data.service.module

import com.example.data.service.mapper.IUserMapper
import com.example.data.service.mapper.UserMapper
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class UserMapperModule {
    @Binds
    @Singleton
    abstract fun bindUserMapper(userMapper: UserMapper): IUserMapper

}