package com.mustafabeyazyuz.android.hilt.binding.convertor

import androidx.databinding.InverseMethod


object SecondNumberConvertor {

    @InverseMethod("toStr")
    fun toInt(str: String) =


        try {

            str.toInt()
        }
        catch (ignore: NumberFormatException)
        {
            0
        }

     fun toStr(a: Int) = a.toString()
    }
