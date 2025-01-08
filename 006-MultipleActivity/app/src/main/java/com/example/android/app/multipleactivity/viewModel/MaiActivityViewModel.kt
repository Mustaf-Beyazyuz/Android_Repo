package com.example.android.app.multipleactivity.viewModel

import com.example.android.app.multipleactivity.MainActivity

data class MaiActivityViewModel (val activity: MainActivity){
    fun handleRegisterButton() = activity.registerButtonClicked()
    fun handleLoginButton() = activity.loginButtonClicked()
    fun handleCloseButton() = activity.closeButtonClicked()


}