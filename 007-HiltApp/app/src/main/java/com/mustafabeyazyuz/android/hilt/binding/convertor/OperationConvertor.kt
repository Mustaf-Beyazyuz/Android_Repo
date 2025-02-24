package com.mustafabeyazyuz.android.hilt.binding.convertor

import androidx.databinding.InverseMethod


object OperationConvertor {

    @InverseMethod("toStr")
    fun toChar(str: String) = if(str.length !=1)  '+' else str[0]

    fun toStr(op: Char) = op.toString()
    }
