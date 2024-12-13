package com.example.a003_basicviews

import  android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a003_basicviews.viewModel.RegisterInfo
import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

class MainActivity : AppCompatActivity() {

    private lateinit var mButtonClose : Button
    private lateinit var mButtonRegisterButton : Button
    private lateinit var mEditTextName : EditText
    private lateinit var mEditTextEmail : EditText
    private lateinit var mEditTextDay : EditText
    private lateinit var mEditTextMonth : EditText
    private lateinit var mEditTextYear : EditText

    private fun mbuttonClickedCallBack()
    {
        Toast.makeText(this,"Register clicked",Toast.LENGTH_SHORT).show()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun registerutton()
    {

        try {

            var name = mEditTextName.text.toString()
            var email = mEditTextEmail.text.toString()
            val birthDate = LocalDate.of(mEditTextDay.text.toString().toInt(),
                mEditTextMonth.text.toString().toInt(),mEditTextYear.text.toString().toInt())

            val registerInfo = RegisterInfo(name,email,birthDate)
            Toast.makeText(this,registerInfo.toString(),Toast.LENGTH_SHORT).show()

        }
        catch (ignore: NumberFormatException)
        {
            Toast.makeText(this,R.string.message_number_format_exception,Toast.LENGTH_SHORT).show()
        }
        catch (ignore : DateTimeException)
        {
            Toast.makeText(this,R.string.message_datetime_exception,Toast.LENGTH_SHORT).show()

        }
    }

    private fun closeButton()
    {
       mButtonClose = findViewById(R.id.mainActivityCloseButton)
        mButtonClose.setOnClickListener { finish()  }
    }

    private fun initAcceptCheckBox()
    {
        findViewById<CheckBox>(R.id.mainActivityCheckBoxAcceptConditions)
            .apply { setOnCheckedChangeListener { _, checked -> mButtonRegisterButton.isEnabled = checked } }
    }

    private fun initEditText()
    {
        mEditTextEmail=findViewById(R.id.mainActivityEditTextEmail)
        mEditTextName = findViewById(R.id.mainActivityEditTextName)
        mEditTextDay = findViewById(R.id.mainActivityEditTextDay)
        mEditTextMonth = findViewById(R.id.mainActivityEditTextMonth)
        mEditTextYear   = findViewById(R.id.mainActivityEditTextYear)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun initviews()
    {
        initEditText()
        registerutton()
        initAcceptCheckBox()
        closeButton()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun initialize()
    {
          initviews()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LinearLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        initialize()
    }
}