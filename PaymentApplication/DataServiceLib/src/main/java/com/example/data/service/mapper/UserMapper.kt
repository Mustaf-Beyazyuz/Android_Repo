package com.example.data.service.mapper

import com.example.data.service.dto.UserSaveDTO
import com.example.payment.repository.entity.User
import java.time.LocalDate
import javax.inject.Inject

class UserMapper @Inject constructor() : IUserMapper {
    override fun toUser(userSaveDTO: UserSaveDTO): User
    {
       return  User(userSaveDTO.username,userSaveDTO.password,userSaveDTO.firstname
           ,userSaveDTO.middleName,userSaveDTO.lastName,userSaveDTO.birthDate, LocalDate.now())
    }

    override fun toUserSaveDTO(user: User): UserSaveDTO
    {
        return UserSaveDTO(user.username,user.password,user.firstname
            ,user.lastName,user.birthDate, user.middleName)
    }
}