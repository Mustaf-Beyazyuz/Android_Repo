package com.mustafabeyazyuz.android.hilt

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.mustafabeyazyuz.android.hilt.calculator.IBinaryOperator
import com.mustafabeyazyuz.android.hilt.calculator.di.modul.annotation.IntAddOperationInterceptor
import com.mustafabeyazyuz.android.hilt.databinding.ActivityMainBinding
import com.mustafabeyazyuz.android.hilt.datatime.DateInfo
import com.mustafabeyazyuz.android.hilt.datatime.DateTimeInfo
import com.mustafabeyazyuz.android.hilt.datatime.TimeInfo
import com.mustafabeyazyuz.android.hilt.viewmodel.MainActivityListenerViewModel
import com.mustafabeyazyuz.android.hilt.viewmodel.OperationInfo
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    @Inject
    lateinit var dateTimeInfo: DateTimeInfo

    @Inject
    lateinit var  dateInfo : DateInfo

    @Inject
    lateinit var timeInfo: TimeInfo

    @Inject
    @IntAddOperationInterceptor
    lateinit var intIBinaryOperator : IBinaryOperator<Int>

    private fun showDateTime() {
        val sb = StringBuilder().append("DateTime: ").append(dateTimeInfo.toString()).append("\n")
            .append("Date: ").append(dateInfo.toString()).append("\n")
            .append("Time: ").append(timeInfo.toString())

        Toast.makeText(this, sb.toString(), Toast.LENGTH_LONG).show()
    }

    private fun initBinding()
    {

        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mBinding.vievModel = MainActivityListenerViewModel(this)
        mBinding.operationInfo = OperationInfo()
    }
    private fun initialize() {
        initBinding()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        initialize()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Toast.makeText(this, dateTimeInfo.toString(), Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        showDateTime()
        super.onResume()
    }

    fun calculateButtonClicked()
    {
        if(intIBinaryOperator.isValid(mBinding.operationInfo!!.op))
        {
            mBinding.resultText=intIBinaryOperator.applyAsInt(mBinding.operationInfo!!.first,mBinding.operationInfo!!.second).toString()

        }
        else
            mBinding.resultText = "Invalid Operation"

    }
}
