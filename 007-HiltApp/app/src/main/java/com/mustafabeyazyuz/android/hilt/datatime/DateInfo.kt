package com.mustafabeyazyuz.android.hilt.datatime

import com.mustafabeyazyuz.android.hilt.datatime.annotation.LocalDateInterceptor
import org.csystem.android.util.datetime.di.module.SystemLocalDateInterceptor
import org.csystem.android.util.datetime.di.module.SystemLocalDateTimeInterceptor
import org.csystem.android.util.datetime.di.module.formatter.annotation.LocalDateFormatterInterceptor
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javax.inject.Inject



class DateInfo @Inject constructor(){
    @Inject
    @SystemLocalDateInterceptor
    lateinit var date: LocalDate
    @Inject
    @LocalDateFormatterInterceptor
    lateinit var formatter: DateTimeFormatter

    override fun toString() = formatter.format(date)
}