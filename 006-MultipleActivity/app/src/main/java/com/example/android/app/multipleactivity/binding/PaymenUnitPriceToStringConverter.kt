package com.example.android.app.multipleactivity.binding

import android.content.Context
import androidx.annotation.Nullable
import androidx.databinding.InverseMethod

object PaymenUnitPriceToStringConverter {

   private var mStatusStr = ""
    val statusStr: String
        get() = mStatusStr

    var errorStr = ""


    @InverseMethod("toStr")
    @JvmStatic
    fun toDouble(str: String) : Double
        {
        var result = 0.0
        try {

            result = str.toDouble()

        }
        catch (ignore : NumberFormatException)
        {
            mStatusStr = errorStr
        }
          return result


    }
    @JvmStatic
    fun toStr(unitprice: Double ) = unitprice.toString()
}