package com.mustafabeyazyuz.android.hilt.viewmodel

import com.mustafabeyazyuz.android.hilt.MainActivity
import java.lang.ref.WeakReference

class MainActivityListenerViewModel(activity: MainActivity) {

    private val mWeekReference = WeakReference(activity)

    fun handleCalcuateButton() = mWeekReference.get()?.calculateButtonClicked()
}