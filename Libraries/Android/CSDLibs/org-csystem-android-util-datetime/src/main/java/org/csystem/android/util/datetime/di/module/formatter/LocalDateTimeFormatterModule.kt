package com.mustafabeyazyuz.module.formatter

import android.content.Context
import android.widget.Toast
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import org.csystem.android.util.datetime.di.module.formatter.annotation.LocalDateTimeFormatterInterceptor
import java.time.format.DateTimeFormatter
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalDateTimeFormatterModule {
    @LocalDateTimeFormatterInterceptor
    @Provides
    @Singleton
    fun provideFormatter(@ApplicationContext context: Context): DateTimeFormatter
    {
        Toast.makeText(context,"provideDateTimeFormatter",Toast.LENGTH_LONG).show()
        return DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
    }


}