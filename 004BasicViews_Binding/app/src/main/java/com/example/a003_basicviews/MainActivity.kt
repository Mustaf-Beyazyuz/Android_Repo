package com.example.a003_basicviews

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView.OnCloseListener
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a003_basicviews.viewModel.RegisterInfo
import java.time.DateTimeException
import java.time.LocalDate

class MainActivity : AppCompatActivity() {

    private lateinit var mButtonClose: Button
    private lateinit var mButtonRegister: Button

    private lateinit var mEditTextName: EditText
    private lateinit var mEditTextEmail: EditText

    private lateinit var mEditTextDay: EditText
    private lateinit var mEditTextMonth: EditText
    private lateinit var mEditTextYear: EditText

    private lateinit var mEditTextUserName: EditText
    private lateinit var mEditTextPassword: EditText
    private lateinit var mEditTextConfirmPassword: EditText

private fun neutralButtonClickerCallBack()
{
    mEditTextConfirmPassword.setText("")

}


    private fun confirm ( password : String ,  confirmPassword : String) : Boolean
    {
        val result = true

        if(password != confirmPassword) {
         promptNotConfirmDialog()
            result == false
        }
        return result
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun getRegisterInfo() : RegisterInfo?
    {
        val password = mEditTextPassword.text.toString()

        if (!confirm(password ,mEditTextConfirmPassword.text.toString()))
            return null

        val name = mEditTextName.text.toString()
        val email = mEditTextEmail.text.toString()
        val birthDate = LocalDate.of(mEditTextYear.text.toString().toInt(),
            mEditTextMonth.text.toString().toInt(),mEditTextDay.text.toString().toInt())

        val username = mEditTextUserName.text.toString()
        return RegisterInfo(name, email, birthDate,username, password)

    }

    // Kayıt butonuna tıklama işlemi
    @RequiresApi(Build.VERSION_CODES.O)
    private fun registerButtonClickedCallback()
    {
        try {
            val registerInfo = getRegisterInfo()

            if(registerInfo != null)
                Toast.makeText(this,registerInfo.toString(), Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,R.string.message_password_not_confirmed,Toast.LENGTH_LONG).show()


            Toast.makeText(this, registerInfo.toString(), Toast.LENGTH_LONG).show()
        }
        catch (ignore: NumberFormatException) {
            Toast.makeText(this, R.string.message_number_format_exception, Toast.LENGTH_LONG).show()
        }
        catch (ignore: DateTimeException) {
            Toast.makeText(this, R.string.message_datetime_exception, Toast.LENGTH_LONG).show()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initRegisterButton()
    {
        mButtonRegister = findViewById<Button>(R.id.mainActivityButtonRegister)
            .apply { setOnClickListener { registerButtonClickedCallback() }}
    }

    private fun initCloseButton()
    {
        findViewById<Button>(R.id.mainActivityCloseButton).apply { setOnClickListener { finish() }}
    }

    private fun initAcceptCheckBox()
    {
        findViewById<CheckBox>(R.id.mainActivityCheckBoxAcceptConditions)
            .apply { setOnCheckedChangeListener { _, checked -> mButtonRegister.isEnabled = checked }}
    }

    private fun initEditTexts()
    {
        // Getting references via old approach
        mEditTextName = findViewById(R.id.mainActivityEditTextName)
        mEditTextEmail = findViewById(R.id.mainActivityEditTextEmail)
        mEditTextDay = findViewById(R.id.mainActivityEditTextDay)
        mEditTextMonth = findViewById(R.id.mainActivityEditTextMonth)
        mEditTextYear = findViewById(R.id.mainActivityEditTextYear)
        mEditTextUserName = findViewById(R.id.mainActivityEditTextUserName)
        mEditTextPassword = findViewById(R.id.mainActivityEditTextPassword)
        mEditTextConfirmPassword = findViewById(R.id.mainActivityEditTextConfirmPassword)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initViews()
    {
        initEditTexts()
        initRegisterButton()
        initCloseButton()
        initAcceptCheckBox()

    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun setupRegisterButton() {
        mButtonRegister = findViewById(R.id.mainActivityButtonRegister)
        mButtonRegister.setOnClickListener { registerButtonClickedCallback() }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initialize() {
        initEditTexts()
        initRegisterButton()
        initCloseButton()
        initAcceptCheckBox()
    }



    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sistem kenarlıklarını ayarla
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LinearLayout)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Tüm bileşenleri başlat
        initialize()
    }
}
