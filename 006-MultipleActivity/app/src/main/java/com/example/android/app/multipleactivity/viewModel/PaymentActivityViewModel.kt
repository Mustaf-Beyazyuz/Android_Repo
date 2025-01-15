package com.example.android.app.multipleactivity.viewModel

import com.example.android.app.multipleactivity.PaymentActivity

data class PaymentActivityViewModel (val activity: PaymentActivity)
{


    fun handleCalculateButton() = activity.payButtonClicked()
    fun handleclearButton() = activity.clearButtonClicked()
    fun handleexitButton() = activity.exitButtonClicked()
}