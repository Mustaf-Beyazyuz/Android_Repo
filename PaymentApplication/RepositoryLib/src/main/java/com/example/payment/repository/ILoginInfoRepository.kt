package com.example.payment.repository

import com.example.payment.repository.entity.LoginInfo
import com.karandev.util.data.repository.ICrudRepository

interface ILoginInfoRepository : ICrudRepository <LoginInfo, Long> {

    fun findByUserName(userName : String) : List<LoginInfo>

    fun findSuccsessUserName (userName: String) : List<LoginInfo>

    fun findFailsByUserName(userName: String) : List<LoginInfo>

}