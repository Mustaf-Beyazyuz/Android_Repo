package com.example.android.app.multipleactivity.viewModel

import com.example.android.app.multipleactivity.PaymentActivity

data class PaymentActivityViewModel (val activity: PaymentActivity,var name: String = "", var unitPriceStr : String ="", var quantityStr: String = "" )
{
    fun handleCalculateButton() = activity.payButtonClicked()
    fun handleCalculateButton() = activity.clearButtonClicked()
    fun handleCalculateButton() = activity.exitButtonClicked()
}