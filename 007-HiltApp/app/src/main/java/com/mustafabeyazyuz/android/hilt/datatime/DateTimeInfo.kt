package com.mustafabeyazyuz.android.hilt.datatime

import com.mustafabeyazyuz.android.hilt.datatime.annotation.LocalDateTimeInterceptor
import com.mustafabeyazyuz.module.formatter.annotation.DateTimeFormatterInterceptor
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject



class DateTimeInfo@Inject constructor(@DateTimeFormatterInterceptor var formatter: DateTimeFormatter,
                                      @LocalDateTimeInterceptor var dateTime: LocalDateTime) {

    override fun toString()= formatter.format(dateTime)

}