package com.mustafabeyazyuz.module.datetime

import android.content.Context
import com.mustafabeyazyuz.android.hilt.datatime.annotation.LocalTimeInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import java.time.LocalTime
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TimeModule {

    @Provides
    @LocalTimeInterceptor
    fun provideLocalTime(@ApplicationContext context: Context): LocalTime {
        return LocalTime.now()
    }
}
