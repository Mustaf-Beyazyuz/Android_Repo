package org.csystem.android.util.datetime.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import java.time.LocalDate

@Module
@InstallIn(SingletonComponent::class)
object SystemLocalDateModule {

    @Provides
    @SystemLocalDateInterceptor
    fun provideLocalDate():LocalDate= LocalDate.now()
}
