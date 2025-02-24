package com.mustafabeyazyuz.android.hilt.calculator

import javax.inject.Inject

class IntMutiplyOperation @Inject constructor() : IBinaryOperator<Int>{

    override fun applyAsInt(a: Int, b: Int): Int {
        return a*b
    }

    override fun isValid(op: Char) = op == '*'
}