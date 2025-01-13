package com.example.android.app.multipleactivity.viewModel

import com.example.android.app.multipleactivity.PaymentActivity

data class PaymentActivityViewModel (val activity: PaymentActivity,var name: String = "",
                                     var unitPriceStr : String ="", var quantityStr: String = "",var resultStr : String = "" )
{
    fun handleCalculateButton() = activity.payButtonClicked()
    fun handleclearButton() = activity.clearButtonClicked()
    fun handleexitButton() = activity.exitButtonClicked()
}