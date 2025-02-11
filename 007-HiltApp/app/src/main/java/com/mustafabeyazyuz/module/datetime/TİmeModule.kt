package com.mustafabeyazyuz.module.datetime

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import java.time.LocalDate

@Module
@InstallIn
object DateModule {

    @Provides
    fun provideLocalDate(@ApplicationContext context: Context) = LocalDate.now()

}