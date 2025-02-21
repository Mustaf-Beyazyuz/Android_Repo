package com.mustafabeyazyuz.android.hilt

interface IBinaryOperator<T> {

    fun apply(a:T,b:T):T

    fun isValid(op:Char) : Boolean
}