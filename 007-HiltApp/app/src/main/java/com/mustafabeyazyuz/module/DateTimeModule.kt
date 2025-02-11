package com.mustafabeyazyuz.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import java.time.LocalDateTime
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn
object DateTimeModule {

    @Provides
    fun provideDateTime(@ApplicationContext context: Context) = LocalDateTime.now()

}