package org.csystem.android.activity.viewmodel

import org.csystem.android.activity.LoginActivity
import java.lang.ref.WeakReference

internal class LoginActivityListenersViewsModel(val activity: LoginActivity) {

    private val mweakReference = WeakReference(activity)

    fun handleLoginButton() = mweakReference.get()?.loginButtonClicked()
}
