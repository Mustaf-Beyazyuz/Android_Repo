package com.mustafabeyazyuz.android.hilt.datatime

import com.mustafabeyazyuz.android.hilt.datatime.annotation.LocalDateTimeInterceptor
import org.csystem.android.util.datetime.di.module.SystemLocalDateTimeInterceptor
import org.csystem.android.util.datetime.di.module.formatter.annotation.LocalDateTimeFormatterInterceptor
import org.csystem.android.util.datetime.di.module.formatter.annotation.LocalTimeFormatterInterceptor
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject



class DateTimeInfo@Inject constructor(@LocalDateTimeFormatterInterceptor var formatter: DateTimeFormatter,
                                      @SystemLocalDateTimeInterceptor var dateTime: LocalDateTime) {

    override fun toString()= formatter.format(dateTime)

}