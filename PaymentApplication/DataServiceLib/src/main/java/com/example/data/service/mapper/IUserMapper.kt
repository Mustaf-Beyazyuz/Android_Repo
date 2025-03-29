package com.example.data.service.mapper

import com.example.data.service.dto.UserSaveDTO
import com.example.payment.repository.entity.User

interface IUserMapper {

    fun toUser(userSaveDTO: UserSaveDTO): User

    fun toUserSaveDTO(user: User) : UserSaveDTO
}