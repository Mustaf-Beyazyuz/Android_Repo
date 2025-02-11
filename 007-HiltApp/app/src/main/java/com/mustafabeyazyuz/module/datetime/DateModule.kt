package com.mustafabeyazyuz.module.datetime

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import java.time.LocalDate
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DateModule {

    @Provides
    @Singleton
    fun provideLocalDate(@ApplicationContext context: Context): LocalDate {
        return LocalDate.now()
    }
}
