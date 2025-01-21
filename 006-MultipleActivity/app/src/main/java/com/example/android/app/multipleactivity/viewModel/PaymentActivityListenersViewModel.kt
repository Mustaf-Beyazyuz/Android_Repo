package com.example.android.app.multipleactivity.viewModel

import com.example.android.app.multipleactivity.PaymentActivity
import java.lang.ref.WeakReference

class PaymentActivityListenersViewModel (val activity: PaymentActivity)
{
    private val mWeakReference = WeakReference(activity)


    fun handleCalculateButton() = mWeakReference.get()?.payButtonClicked()
    fun handleclearButton() = mWeakReference.get()?.clearButtonClicked()
    fun handleexitButton() = mWeakReference.get()?.exitButtonClicked()
}