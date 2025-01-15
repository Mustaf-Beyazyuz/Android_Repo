package com.example.android.app.multipleactivity.binding

import androidx.databinding.InverseMethod

object PaymentQuantityToStringConverter {
    private var mStatusStr = ""
    val statusStr: String
        get() = mStatusStr

    var errorStr = ""

    @InverseMethod("toStr")
    @JvmStatic
    fun toDouble(str: String): Double
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
    fun toStr(quantity : Int) = quantity.toString()
}
