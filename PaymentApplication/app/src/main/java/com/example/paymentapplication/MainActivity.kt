package com.example.paymentapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.data.service.PaymentAppDataService
import com.example.data.service.dto.UserSaveDTO
import com.example.data.service.mapper.IUserMapper
import com.example.paymentapplication.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import java.time.LocalDate
import java.time.Month
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity()
{
    private lateinit var mainBinding: ActivityMainBinding

    @Inject
    lateinit var userMapper : IUserMapper
     @Inject
    lateinit var dataService: PaymentAppDataService
    private fun initialize ()
    {
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
    }
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initialize()

    }


}