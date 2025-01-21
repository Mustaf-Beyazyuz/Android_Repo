package com.example.android.app.multipleactivity.viewModel

import android.app.Activity
import com.example.android.app.multipleactivity.MainActivity
import java.lang.ref.WeakReference

class MaiActivityViewModel (val activity: MainActivity){

    private val mBWeakReference = WeakReference(activity)
    fun handleRegisterButton() = mBWeakReference.get()?.registerButtonClicked()
    fun handleLoginButton() = mBWeakReference.get()?.loginButtonClicked()
    fun handleCloseButton() = mBWeakReference.get()?.closeButtonClicked()


}