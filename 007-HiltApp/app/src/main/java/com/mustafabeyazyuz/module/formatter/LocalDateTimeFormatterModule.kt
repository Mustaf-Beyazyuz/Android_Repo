package com.mustafabeyazyuz.module.formatter

import android.content.Context
import android.widget.Toast
import com.mustafabeyazyuz.module.formatter.annotation.DateTimeFormatterInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import java.time.format.DateTimeFormatter
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalDateTimeFormatterModule {
    @DateTimeFormatterInterceptor
    @Provides
    @Singleton
    fun provideFormatter(@ApplicationContext context: Context): DateTimeFormatter
    {
        Toast.makeText(context,"provideDateTimeFormatter",Toast.LENGTH_LONG).show()
        return DateTimeFormatter.ofPattern("dd/MM/yyyy  kk:mm:ss")
    }


}