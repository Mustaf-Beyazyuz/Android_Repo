package com.mustafabeyazyuz.module.formatter

import com.mustafabeyazyuz.module.formatter.annotation.DateFormatterInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import java.time.format.DateTimeFormatter
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DateFormatterModule {

    @Provides
    @Singleton
    @DateFormatterInterceptor
    fun provideFormatter(): DateTimeFormatter {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy")
    }
}
