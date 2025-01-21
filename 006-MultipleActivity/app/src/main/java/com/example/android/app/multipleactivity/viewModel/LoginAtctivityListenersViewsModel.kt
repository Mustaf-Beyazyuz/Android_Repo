package com.example.android.app.multipleactivity.viewModel

import com.example.android.app.multipleactivity.LoginActivity
import java.lang.ref.WeakReference

class LoginAtctivityListenersViewsModel(val activity: LoginActivity) {

    private val mweakReference = WeakReference(activity)

    fun handleLoginButton() = mweakReference.get()?.loginButtonClicked()
}
