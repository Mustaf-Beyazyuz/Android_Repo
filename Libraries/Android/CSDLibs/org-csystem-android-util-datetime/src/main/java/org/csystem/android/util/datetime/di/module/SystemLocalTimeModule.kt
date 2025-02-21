package org.csystem.android.util.datetime.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import java.time.LocalTime

@Module
@InstallIn(SingletonComponent::class)
object SystemLocalTimeModule {

    @Provides
    @SystemLocalTimeInterceptor
    fun provideLocalTime(): LocalTime =  LocalTime.now()
}
