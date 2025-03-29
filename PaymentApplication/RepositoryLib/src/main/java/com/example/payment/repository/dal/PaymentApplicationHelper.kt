package com.example.payment.repository.dal

import com.example.payment.repository.ILoginInfoRepository
import com.example.payment.repository.IPaymentRepository
import com.example.payment.repository.IUserRepository
import com.example.payment.repository.LoginInfoRepository
import com.example.payment.repository.PaymentRepository
import com.example.payment.repository.UserRepository
import com.example.payment.repository.entity.LoginInfo
import com.example.payment.repository.entity.User
import com.example.payment.repository.global.USER_FILE
import com.karandev.util.data.repository.exception.RepositoryException
import javax.inject.Inject

class PaymentApplicationHelper @Inject constructor(
    private val userRepository: IUserRepository,
    private val loginInfoRepository: ILoginInfoRepository,
    private val paymentRepository: IPaymentRepository
) {
    fun existsUserByUserName(userName: String?): Boolean {
        try {
            return userRepository.existsById(userName)
        } catch (ex: Throwable) {
            throw RepositoryException("PaymentApplicationHelper.existsUserByUserName", ex)
        }
    }

    // Diğer metotlar aynı kalabilir...



    fun saveUser(user : User) : User
    {
        try {
            return userRepository.save(user)
        }
        catch (ex :Throwable)
        {
            throw RepositoryException("PaymentApplicationHelper.saveUser",ex)
        }
    }

    fun findLoginInfoByUserName(userName: String): List<LoginInfo>
    {
        try {
            return  loginInfoRepository.findByUserName(userName)
        }
        catch (ex :Throwable)
        {
            throw RepositoryException("PaymentApplicationHelper.findUserByUserNameAndPassword",ex)
        }
    }
    fun findSuccessLoginInfoByUserName(userName: String): List<LoginInfo>
    {
        try {
            return  loginInfoRepository.findSuccsessUserName(userName)
        }
        catch (ex :Throwable)
        {
            throw RepositoryException("PaymentApplicationHelper.findSuccessLoginInfoByUserName",ex)
        }
    }

    fun findFailLoginInfoByUserName(userName: String): List<LoginInfo>
    {
        try {
            return  loginInfoRepository.findFailsByUserName(userName)
        }
        catch (ex :Throwable)
        {
            throw RepositoryException("PaymentApplicationHelper.findFailLoginInfoByUserName",ex)
        }
    }

    fun saveLoginInfo(loginInfo: LoginInfo) : LoginInfo
    {
        try {
            return loginInfoRepository.save(loginInfo)
        }
        catch (ex :Throwable)
        {
            throw RepositoryException("PaymentApplicationHelper.saveLoginInfo",ex)
        }
    }

}