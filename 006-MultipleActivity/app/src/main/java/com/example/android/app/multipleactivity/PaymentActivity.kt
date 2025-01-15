package com.example.android.app.multipleactivity

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.database.DatabaseUtils
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import com.example.android.app.multipleactivity.Keys.LOGIN_INFO
import com.example.android.app.multipleactivity.binding.PaymenUnitPriceToStringConverter
import com.example.android.app.multipleactivity.binding.PaymentQuantityToStringConverter
import com.example.android.app.multipleactivity.databinding.ActivityPaymentBinding
import com.example.android.app.multipleactivity.viewModel.LoginInfo
import com.example.android.app.multipleactivity.viewModel.PaymentActivityViewModel
import com.example.android.app.multipleactivity.viewModel.PaymentInfo


class PaymentActivity : AppCompatActivity() {
    private lateinit var mBinding : ActivityPaymentBinding

    private fun initViewsModel()
    {
        mBinding.viewModel = PaymentActivityViewModel(this)
        mBinding.loginInfo= when{ VERSION.SDK_INT < VERSION_CODES.TIRAMISU ->intent.getSerializableExtra(LOGIN_INFO) as LoginInfo
            else -> intent.getSerializableExtra(LOGIN_INFO,LoginInfo::class.java)
        }
        mBinding.paymentInfo = PaymentInfo()
        mBinding.result ="";
        PaymentQuantityToStringConverter.errorStr = "invalid quantity"
        PaymenUnitPriceToStringConverter.errorStr = "invalid Unit price"

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
        try {
            if(PaymenUnitPriceToStringConverter.statusStr.isNotEmpty()){
                Toast.makeText(this,PaymentQuantityToStringConverter.statusStr,,Toast.LENGTH_SHORT).show()
                return
            }
            mBinding.result = mBinding.paymentInfo!!.toString()
        }
        catch(ignore : Throwable)
        {
            Toast.makeText(this,"Problem occurs",Toast.LENGTH_SHORT).show()
        }

    }
    fun  clearButtonClicked()
    {
        for (view in mBinding.main.children)
            if (view is EditText)
                view.setText("")
    }
    fun  exitButtonClicked()
    {
                 AlertDialog.Builder(this)
                .setTitle("Exit Alert Dialog")
                .setMessage("Are you sure you want to log out?")
                .setPositiveButton("Yes") {_,_ -> finish()}
                .setNegativeButton("No") {dialog,_ -> dialog.dismiss() }
                .create()
                .show()
    }

}