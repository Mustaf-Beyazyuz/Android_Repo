package com.mustafabeyazyuz.android.app.hilt.datetime

import android.content.Context
import android.widget.Toast
import dagger.hilt.android.qualifiers.ApplicationContext
import org.csystem.android.util.datetime.di.module.SystemLocalDateTimeInterceptor
import org.csystem.android.util.datetime.di.module.formatter.annotation.LocalDateTimeFormatterInterceptor
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject



class DateTimeInfo@Inject constructor(
    @LocalDateTimeFormatterInterceptor var formatter: DateTimeFormatter,
    @SystemLocalDateTimeInterceptor var dateTime: LocalDateTime,
    @ApplicationContext context: Context) {

    init{
        Toast.makeText(context,"DateTimeınfo Created -> $this)",Toast.LENGTH_SHORT).show()
    }

    override fun toString()= formatter.format(dateTime)

}