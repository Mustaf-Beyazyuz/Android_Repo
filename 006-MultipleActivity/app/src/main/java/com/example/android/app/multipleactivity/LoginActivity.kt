package com.example.android.app.multipleactivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.android.app.multipleactivity.Keys.LOGIN_INFO
import com.example.android.app.multipleactivity.databinding.ActivityLoginBinding
import com.example.android.app.multipleactivity.viewModel.LoginAtctivityListenersViewsModel
import com.example.android.app.multipleactivity.viewModel.LoginInfo
import java.time.LocalDateTime


class LoginActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityLoginBinding


    private fun initViewsModel()
    {
        mBinding.vievModel = LoginAtctivityListenersViewsModel(this)
        mBinding.loginInfo = LoginInfo()
    }

    private fun initialize()
    {
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        initViewsModel()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initialize()
    }

    fun loginButtonClicked()
    {
        Intent(this,PaymentActivity::class.java).
            apply {mBinding.loginInfo!!.loginDateTime = LocalDateTime.now()
            startActivity(this.putExtra(LOGIN_INFO,mBinding.loginInfo)) }
    }
}