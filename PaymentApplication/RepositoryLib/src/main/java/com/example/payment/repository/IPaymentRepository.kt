package com.example.payment.repository

import com.example.payment.repository.entity.LoginInfo
import com.example.payment.repository.entity.Payment
import com.karandev.util.data.repository.ICrudRepository

interface IPaymentRepository : ICrudRepository <Payment, Long> {

    fun findByUserName(userName: String) : List <Payment>
    
}