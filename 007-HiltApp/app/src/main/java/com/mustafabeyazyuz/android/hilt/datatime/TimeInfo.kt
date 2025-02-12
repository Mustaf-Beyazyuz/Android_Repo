package com.mustafabeyazyuz.android.hilt.datatime

import com.mustafabeyazyuz.module.formatter.annotation.DateTimeFormatterInterceptor
import com.mustafabeyazyuz.module.formatter.annotation.TimeFormatterInterceptor
import dagger.hilt.android.scopes.ActivityScoped
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject


class TimeInfo @Inject constructor() {
    @Inject
    lateinit var time: LocalTime
    @Inject
    @TimeFormatterInterceptor
    lateinit var formatter: DateTimeFormatter

    override fun toString()= formatter.format(time)
}