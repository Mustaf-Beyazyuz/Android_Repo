package com.mustafabeyazyuz.module.datetime

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import java.time.LocalDateTime
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DateTimeModule {

    @Provides
    @Singleton
    fun provideDateTime(@ApplicationContext context: Context): LocalDateTime {
        return LocalDateTime.now()
    }
}
