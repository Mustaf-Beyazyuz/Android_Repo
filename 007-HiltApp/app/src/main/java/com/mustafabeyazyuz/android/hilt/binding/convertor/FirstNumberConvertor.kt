package com.mustafabeyazyuz.android.hilt.binding.convertor

import androidx.databinding.InverseMethod


object FirstNumberConvertor {

    @InverseMethod("toStr")
    fun toInt(str: String) : Int
    {
        var result = 0
        try {

            result =str.toInt()
        }
        catch (ignore: NumberFormatException)
        {

        }
        return result
    }


        fun toStr(a: Int) = a.toString()
    }
