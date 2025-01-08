package com.example.android.app.multipleactivity

import android.content.Intent
import android.database.DatabaseUtils
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.android.app.multipleactivity.Keys.USER_NAME
import com.example.android.app.multipleactivity.databinding.ActivityMainBinding
import com.example.android.app.multipleactivity.databinding.ActivityPaymentBinding
import com.example.android.app.multipleactivity.viewModel.MaiActivityViewModel
import com.example.android.app.multipleactivity.viewModel.PaymentActivityViewModel

class PaymentActivity : AppCompatActivity() {
    private lateinit var mBinding : ActivityPaymentBinding

    private fun initData()
    {
        mBinding.viewModel!!.username = intent.getStringExtra(USER_NAME)!!
    }
    private fun initBinding()
    {
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_payment)
        mBinding.viewModel = PaymentActivityViewModel(this)
    }

    private fun initialize()
    {
        initBinding()
        initData()
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

}