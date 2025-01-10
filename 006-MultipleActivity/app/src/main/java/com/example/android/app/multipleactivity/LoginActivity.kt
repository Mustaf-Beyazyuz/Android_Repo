package com.example.android.app.multipleactivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.android.app.multipleactivity.Keys.USER_NAME
import com.example.android.app.multipleactivity.databinding.ActivityLoginBinding
import com.example.android.app.multipleactivity.databinding.ActivityMainBinding
import com.example.android.app.multipleactivity.viewModel.LoginActivityViewModel
import com.example.android.app.multipleactivity.viewModel.MaiActivityViewModel

class LoginActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityLoginBinding
    private fun startPaymentActivityCallback(intent : Intent)
    {
        startActivity(intent.putExtra(USER_NAME,mBinding.vievModel!!.username))
    }


    private fun initialize()
    {
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        mBinding.vievModel = LoginActivityViewModel(this)
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
        Intent(this,PaymentActivity::class.java).apply {startActivity(this.putExtra(USER_NAME,mBinding.vievModel!!.username)) }
    }
}