package com.example.android.app.multipleactivity.viewModel

data class PaymentInfo(var name: String = "", var unitprice : Double = 0.0 , var quantity : Int)
{
    fun reset() {
        run {
            name = ""
            unitprice = 0.0
            quantity = 0
        }
    }
    override fun toString() =  "$name,$unitprice * $quantity = ${unitprice * quantity} "
}