package com.mustafabeyazyuz.android.hilt.calculator.di.modul

import com.mustafabeyazyuz.android.hilt.calculator.IBinaryOperator
import com.mustafabeyazyuz.android.hilt.calculator.IntAddOperation
import com.mustafabeyazyuz.android.hilt.calculator.di.modul.annotation.IntAddOperationInterceptor
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent :: class)
abstract class IntAddOperationModule {

    @Binds
    @IntAddOperationInterceptor
    abstract fun bindIntAddOperaiton(intAddOperation: IntAddOperation): IBinaryOperator<Int>
}