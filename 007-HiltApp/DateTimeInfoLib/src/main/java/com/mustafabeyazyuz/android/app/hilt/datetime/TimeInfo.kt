package com.mustafabeyazyuz.android.app.hilt.datetime

import com.mustafabeyazyuz.android.hilt.datatime.annotation.LocalTimeInterceptor
import dagger.hilt.android.scopes.ActivityScoped
import org.csystem.android.util.datetime.di.module.SystemLocalTimeInterceptor
import org.csystem.android.util.datetime.di.module.formatter.annotation.LocalDateTimeFormatterInterceptor
import org.csystem.android.util.datetime.di.module.formatter.annotation.LocalTimeFormatterInterceptor
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject


class TimeInfo @Inject constructor() {
    @Inject
    @SystemLocalTimeInterceptor
    lateinit var time: LocalTime
    @Inject
    @LocalTimeFormatterInterceptor
    lateinit var formatter: DateTimeFormatter

    override fun toString()= formatter.format(time)
}