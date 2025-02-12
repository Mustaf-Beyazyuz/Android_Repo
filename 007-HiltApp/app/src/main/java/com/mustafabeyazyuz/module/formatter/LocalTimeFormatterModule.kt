package com.mustafabeyazyuz.module.formatter

import com.mustafabeyazyuz.module.formatter.annotation.TimeFormatterInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import java.time.format.DateTimeFormatter
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalTimeFormatterModule {

    @Provides
    @Singleton
    @TimeFormatterInterceptor
    fun provideFormatter(): DateTimeFormatter {
        return DateTimeFormatter.ofPattern("hh:mm:ss")
    }
}
