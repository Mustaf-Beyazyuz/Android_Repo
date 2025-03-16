package com.example.payment.repository

import com.example.payment.repository.entity.User
import com.karandev.util.data.repository.ICrudRepository

interface IUserRepository : ICrudRepository<User , String>{

    fun existsByUserNameAndPassword(userName: String , password : String) : Boolean
}