package com.example.android.app.multipleactivity.viewModel

import com.example.android.app.multipleactivity.LoginActivity

data class LoginAtctivityListenersViewsModel(val activity: LoginActivity) {


    fun handleLoginButton() = activity.loginButtonClicked()
}
