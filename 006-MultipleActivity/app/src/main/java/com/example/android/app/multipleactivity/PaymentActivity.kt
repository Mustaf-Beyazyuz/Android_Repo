package com.example.android.app.multipleactivity

import android.content.Intent
import android.database.DatabaseUtils
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.android.app.multipleactivity.Keys.LOGIN_INFO
import com.example.android.app.multipleactivity.databinding.ActivityPaymentBinding
import com.example.android.app.multipleactivity.viewModel.LoginInfo
import com.example.android.app.multipleactivity.viewModel.PaymentActivityViewModel

class PaymentActivity : AppCompatActivity() {
    private lateinit var mBinding : ActivityPaymentBinding

    private fun initViewsModel()
    {
        mBinding.viewModel = PaymentActivityViewModel(this)
        mBinding.loginInfo= when{ VERSION.SDK_INT < VERSION_CODES.TIRAMISU ->intent.getSerializableExtra(LOGIN_INFO) as LoginInfo
            else -> intent.getSerializableExtra(LOGIN_INFO,LoginInfo::class.java)
        }

    }
    private fun initBinding()
    {
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_payment)
        initViewsModel()

    }

    private fun initialize()
    {
        initBinding()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initialize()
    }
    fun  payButtonClicked()
    {

    }
    fun  clearButtonClicked()
    {

    }
    fun  exitButtonClicked()
    {

    }

}