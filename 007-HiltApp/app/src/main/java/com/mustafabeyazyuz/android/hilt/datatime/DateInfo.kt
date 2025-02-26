package com.mustafabeyazyuz.android.hilt.datatime

import android.content.Context
import android.widget.Toast
import dagger.hilt.android.qualifiers.ApplicationContext
import org.csystem.android.util.datetime.di.module.SystemLocalDateInterceptor
import org.csystem.android.util.datetime.di.module.formatter.annotation.LocalDateFormatterInterceptor
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javax.inject.Inject



class DateInfo @Inject constructor(
    @ApplicationContext var context: Context,
    @SystemLocalDateInterceptor var date: LocalDate,
    @LocalDateFormatterInterceptor var formatter: DateTimeFormatter){


    init{

        Toast.makeText(context,"Dateınfo Crated -> $this",Toast.LENGTH_SHORT).show()
    }
    override fun toString() =  formatter.format(date)
}