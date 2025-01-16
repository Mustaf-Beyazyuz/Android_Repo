package com.example.android.app.multipleactivity.binding

import androidx.databinding.InverseMethod
import java.time.LocalDate
import java.time.Month
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

object RegisterBirthdateStringConverter {

    private val mFormatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy")
    private var mFail = false
    val fail: Boolean
        get() = mFail

    var failStr = ""

    @InverseMethod("toStr")
    @JvmStatic
    fun toLocalDae(str: String): LocalDate
    {
        var result = LocalDate.of(1998,Month.JUNE,8)
        try {

            result = LocalDate.parse(str, mFormatter)

        }
        catch (ignore : DateTimeParseException)
        {
            mFail = true
        }
        return result


    }
    @JvmStatic
    fun toStr(birthDate : LocalDate) = mFormatter.format(birthDate)
}
