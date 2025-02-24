package com.mustafabeyazyuz.android.hilt.calculator

interface IBinaryOperator<T> {

    fun applyAsInt(a:T,b:T):T

    fun isValid(op:Char) : Boolean
}