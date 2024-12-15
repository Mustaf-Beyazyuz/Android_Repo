package com.example.a003_basicviews

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
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

    // Kayıt butonuna tıklama işlemi
    @RequiresApi(Build.VERSION_CODES.O)
    private fun onRegisterButtonClick() {
        val name = mEditTextName.text.toString()
        val email = mEditTextEmail.text.toString()

        // Kullanıcı girişlerini doğrula
        val day = mEditTextDay.text.toString().toIntOrNull()
        val month = mEditTextMonth.text.toString().toIntOrNull()
        val year = mEditTextYear.text.toString().toIntOrNull()

        if (day == null || month == null || year == null) {
            Toast.makeText(this, R.string.message_number_format_exception, Toast.LENGTH_SHORT).show()
            return
        }

        try {
            val name = mEditTextName.text.toString()
            val email = mEditTextEmail.text.toString()
            val birthDate = LocalDate.of(mEditTextYear.text.toString().toInt(),
                mEditTextMonth.text.toString().toInt(),mEditTextDay.text.toString().toInt())
            val registerInfo = RegisterInfo(name,email,birthDate)
            Toast.makeText(this, registerInfo.toString(), Toast.LENGTH_SHORT).show()
        } catch (e: DateTimeException) {
            Toast.makeText(this, R.string.message_datetime_exception, Toast.LENGTH_SHORT).show()
        }
        catch (ignore : NumberFormatException)
        {
            Toast.makeText(this,R.string.message_number_format_exception,Toast.LENGTH_SHORT).show()
        }
    }

    // Uygulamayı kapatma butonu işlemi
    private fun setupCloseButton() {
        mButtonClose = findViewById(R.id.mainActivityCloseButton)
        mButtonClose.setOnClickListener { finish() }
    }

    // Kullanıcı sözleşmesi Checkbox'ını başlatma
    private fun setupAcceptCheckBox() {
        val checkBox = findViewById<CheckBox>(R.id.mainActivityCheckBoxAcceptConditions)
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            mButtonRegister.isEnabled = isChecked
        }
    }

    // EditText bileşenlerini başlatma
    private fun setupEditTexts() {
        mEditTextEmail = findViewById(R.id.mainActivityEditTextEmail)
        mEditTextName = findViewById(R.id.mainActivityEditTextName)
        mEditTextDay = findViewById(R.id.mainActivityEditTextDay)
        mEditTextMonth = findViewById(R.id.mainActivityEditTextMonth)
        mEditTextYear = findViewById(R.id.mainActivityEditTextYear)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setupRegisterButton() {
        mButtonRegister = findViewById(R.id.mainActivityButtonRegister)
        mButtonRegister.setOnClickListener { onRegisterButtonClick() }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initializeViews() {
        setupEditTexts()
        setupRegisterButton()
        setupAcceptCheckBox()
        setupCloseButton()
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
        initializeViews()
    }
}
