package com.mustafabeyazyuz.android.hilt.datatime

import com.mustafabeyazyuz.module.formatter.annotation.DateFormatterInterceptor
import com.mustafabeyazyuz.module.formatter.annotation.DateTimeFormatterInterceptor
import dagger.hilt.android.scopes.ActivityScoped
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject



class DateInfo @Inject constructor(){
    @Inject
    lateinit var date: LocalDate
    @Inject
    @DateFormatterInterceptor
    lateinit var formatter: DateTimeFormatter

    override fun toString() = formatter.format(date)
}