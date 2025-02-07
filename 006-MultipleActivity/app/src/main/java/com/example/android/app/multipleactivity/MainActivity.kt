package com.example.android.app.multipleactivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.android.app.multipleactivity.databinding.ActivityMainBinding
import com.example.android.app.multipleactivity.viewModel.MaiActivityViewModel
import org.csystem.android.activity.LoginActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    private fun initialize()
    {
       mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mBinding.viewModel = MaiActivityViewModel(this)
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

    fun registerButtonClicked()
    {
      startActivity(Intent(this,RegisterActivity::class.java))
    }

    fun loginButtonClicked()
    {
        startActivity(Intent(this,LoginActivity::class.java))
    }

    fun closeButtonClicked()
    {
        finish()
    }

}