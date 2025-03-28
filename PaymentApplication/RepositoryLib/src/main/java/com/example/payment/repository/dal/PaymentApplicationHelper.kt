package com.example.payment.repository.dal

import com.example.payment.repository.ILoginInfoRepository
import com.example.payment.repository.IPaymentRepository
import com.example.payment.repository.IUserRepository
import com.example.payment.repository.LoginInfoRepository
import com.example.payment.repository.PaymentRepository
import com.example.payment.repository.UserRepository
import com.example.payment.repository.entity.User
import com.example.payment.repository.global.USER_FILE
import com.karandev.util.data.repository.exception.RepositoryException
import javax.inject.Inject

class PaymentApplicationHelper {
    @Inject
    lateinit var userRepository: IUserRepository
    @Inject
    lateinit var loginInfoRepository: ILoginInfoRepository
    @Inject
    lateinit var paymentRepository: IPaymentRepository

    fun saveUser(user : User) : User
    {
        try {
            return userRepository.save(user)
        }
        catch (ex :Throwable)
        {
            throw RepositoryException("PaymentApplicationHelper.saveUser")
        }
    }
    fun existsUserByUserName(userName: String?): Boolean
    {
        try {
            return userRepository.existsById(userName)
        }
        catch (ex :Throwable)
        {
            throw RepositoryException("PaymentApplicationHelper.existsUserByUserName")
        }
    }

    fun finUserBydUserNameAndPassword(userName: String, password: String): User?
    {

       try {
           return userRepository.findByUserNameAndPassword(userName,password)
       }
       catch (ex :Throwable)
       {
           throw RepositoryException("PaymentApplicationHelper.findUserByUserNameAndPassword")
       }
    }
}