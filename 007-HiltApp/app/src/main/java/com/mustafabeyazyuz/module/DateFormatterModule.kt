package com.mustafabeyazyuz.module
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import java.time.LocalDateTime
import dagger.hilt.android.qualifiers.ApplicationContext
import java.time.format.DateTimeFormatter
import javax.inject.Singleton

@Module
@InstallIn
object DateFormatterModule {

    @Provides
    @Singleton
    fun provideFormatter(@ApplicationContext context: Context) = DateTimeFormatter.ofPattern("dd/MM/yyyy")

}
