package org.csystem.android.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import org.csystem.android.activity.databinding.ActivityLoginBinding
import org.csystem.android.activity.viewmodel.LoginActivityListenersViewsModel
import org.csystem.android.activity.viewmodel.LoginInfo

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var mLauncher: ActivityResultLauncher<Intent>


    private fun paymentActivityCallback(result: androidx.activity.result.ActivityResult) {
        TODO()
    }


    private fun initPaymentActivityResultLauncher() {
        mLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { paymentActivityCallback(it) }
    }


    private fun initViewModels() {
        binding.vievModel = LoginActivityListenersViewsModel(this)
        binding.loginInfo = LoginInfo()
    }

    private fun initialize()
    {
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        initViewModels()
        initPaymentActivityResultLauncher()
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
    }

    fun loginButtonClicked()
    {
        Toast.makeText(this,"Login button clicked",Toast.LENGTH_LONG).show()

    }
}