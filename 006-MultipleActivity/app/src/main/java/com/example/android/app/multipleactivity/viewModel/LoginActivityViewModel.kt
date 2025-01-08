package com.example.android.app.multipleactivity.viewModel

import com.example.android.app.multipleactivity.LoginActivity
import com.example.android.app.multipleactivity.MainActivity

data class LoginActivityViewModel (val activity: LoginActivity, var username : String ="", var password : String = ""){
    fun handleLoginButton() = activity.loginButtonClicked()



}