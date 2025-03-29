package com.example.data.service.mapper

import com.example.data.service.dto.UserSaveDTO
import com.example.payment.repository.entity.User
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


interface IUserMapper {

    fun toUser(userSaveDTO: UserSaveDTO): User

    fun toUserSaveDTO(user: User) : UserSaveDTO
}