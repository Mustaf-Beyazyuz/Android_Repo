package com.example.payment.repository

import com.example.payment.repository.entity.LoginInfo
import java.util.Optional
import javax.inject.Inject

class LoginInfoRepository  @Inject constructor(): ILoginInfoRepository {
    override fun count(): Long
    {
        TODO("Not yet implemented")
    }

    override fun delete(entity: LoginInfo?)
    {
        TODO("Not yet implemented")
    }

    override fun deleteAll()
    {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: MutableIterable<LoginInfo>?)
    {
        TODO("Not yet implemented")
    }

    override fun findAll(): MutableIterable<LoginInfo>
    {
        TODO("Not yet implemented")
    }

    override fun <S : LoginInfo?> save(entity: S): S
    {
        TODO("Not yet implemented")
    }

    override fun <S : LoginInfo?> saveAll(entities: MutableIterable<S>?): MutableIterable<S>
    {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: MutableIterable<Long>?)
    {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long?)
    {
        TODO("Not yet implemented")
    }

    override fun existsById(id: Long?): Boolean
    {
        TODO("Not yet implemented")
    }

    override fun findAllById(id: MutableIterable<Long>?): MutableIterable<LoginInfo>
    {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long?): Optional<LoginInfo>
    {
        TODO("Not yet implemented")
    }

    override fun findByUserName(userName: String): List<LoginInfo> {
        TODO("Not yet implemented")
    }

    override fun findSuccsessUserName(userName: String): List<LoginInfo> {
        TODO("Not yet implemented")
    }

    override fun findFailsByUserName(userName: String): List<LoginInfo> {
        TODO("Not yet implemented")
    }
}