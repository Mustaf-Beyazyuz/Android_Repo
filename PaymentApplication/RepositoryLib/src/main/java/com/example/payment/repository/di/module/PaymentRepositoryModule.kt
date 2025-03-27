package com.example.payment.repository.di.module

import com.example.payment.repository.IPaymentRepository
import com.example.payment.repository.IUserRepository
import com.example.payment.repository.PaymentRepository
import com.example.payment.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class PaymentRepositoryModule {
    @Binds
    @Singleton
    abstract fun bindUserRepository(paymentRepository: PaymentRepository) : IPaymentRepository
}