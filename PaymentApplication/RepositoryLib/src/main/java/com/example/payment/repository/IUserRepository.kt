package com.example.payment.repository

import com.example.payment.repository.entity.User
import com.karandev.util.data.repository.ICrudRepository

interface IUserRepository : ICrudRepository<User , String>{

    fun findByUserNameAndPassword(userName: String , password : String) : User?

    fun existsByUserNameAndPassword(userName: String , password : String) = findByUserNameAndPassword(userName, password) != null
}