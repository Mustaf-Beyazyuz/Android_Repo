package com.example.android.app.multipleactivity.viewModel

import org.csystem.android.activity.LoginActivity
import java.lang.ref.WeakReference

class RegisterAtctivityListenersViewsModel(val activity: LoginActivity) {


    private val mWeakReference = WeakReference(activity)

    fun handleLoginButton() = mWeakReference.get()?.loginButtonClicked()
}
