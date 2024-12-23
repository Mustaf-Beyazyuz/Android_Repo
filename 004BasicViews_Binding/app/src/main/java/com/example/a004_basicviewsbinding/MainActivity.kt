package com.example.a004_basicviewsbinding

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
import com.example.a003_basicviews.R
import com.example.a003_basicviews.databinding.ActivityMainBinding
import com.example.a004_basicviewsbinding.globalAlert.promptDecision
import com.example.a004_basicviewsbinding.globalAlert.promptNotConfirmDialog
import com.example.a004_basicviewsbinding.viewModel.RegisterInfo
import java.time.DateTimeException
import java.time.LocalDate

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding : ActivityMainBinding


private fun neutralButtonClickerCallBack()
{
    mBinding.mainActivityEditTextConfirmPassword .setText("")

}

    private fun pozitiveButtonClickerCallBack()
    {
 finish()
    }
    private fun negativeButtonClickerCallBack()
    {
Toast.makeText(this,R.string.message_continue,Toast.LENGTH_SHORT).show()
    }


    private fun confirm ( password : String ,  confirmPassword : String) : Boolean
    {
        val result = true

        if(password != confirmPassword) {
            promptNotConfirmDialog(this,R.string.confirm_alert_dialog_title
                ,R.string.message_password_not_confirmed,
                R.string.ok_button_text){_,_->neutralButtonClickerCallBack()}
            Toast.makeText(this,R.string.message_password_not_confirmed,Toast.LENGTH_LONG).show()
            result == false
        }
        return result
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun getRegisterInfo() : RegisterInfo?
    {
        val password = mBinding.mainActivityEditTextPassword.text.toString()

        if (!confirm(password , mBinding.mainActivityEditTextConfirmPassword.text.toString()))
            return null

        val name = mBinding.mainActivityEditTextName.text.toString()
        val email = mBinding.mainActivityEditTextEmail.text.toString()
        val birthDate = LocalDate.of(
            mBinding.mainActivityEditTextYear.text.toString().toInt(),
            mBinding.mainActivityEditTextMonth.text.toString().toInt(),
            mBinding.mainActivityEditTextDay.text.toString().toInt())

        val username = mBinding.mainActivityEditTextUserName.text.toString()
        return RegisterInfo(name, email, birthDate,username, password)

    }

    private fun closeButtonClickCallBack()
    {
        promptDecision(this,R.string.confirm_close_alert_dialog_title
            ,R.string.message_confirm_close
        ,R.string.yes_button_text,R.string.no_button_text,
            {_,_-> pozitiveButtonClickerCallBack()}) {_,_ -> negativeButtonClickerCallBack()}
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
       mBinding.mainActivityButtonRegister.apply { setOnClickListener{registerButtonClickedCallback()} }
    }

    private fun initCloseButton()
    {
        mBinding.mainActivityCloseButton.apply { setOnClickListener{closeButtonClickCallBack()} }
    }

    private fun initAcceptCheckBox()
    {

            mBinding.mainActivityCheckBoxAcceptConditions
                    .setOnCheckedChangeListener(){ _, checked -> mBinding
                    .mainActivityButtonRegister.isEnabled = checked }
    }

    private fun initBinding(){

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

    }

    private fun showPasswordButtonCliked()
    {
        mBinding.mainActivityShowPasswordButton.run {
            val show = tag as Boolean
            val resId = if (show) R.string.button_hide_password_text
            else R.string.button_show_password_text

            setText(resId)
            tag = !show
        }
    }

    private fun initShowPasswordButton()
    {
        mBinding.mainActivityShowPasswordButton.tag = true
      mBinding.mainActivityShowPasswordButton.apply { setOnClickListener {showPasswordButtonCliked()} }
    }



    @RequiresApi(Build.VERSION_CODES.O)
    private fun initViews()
    {
        initShowPasswordButton()
        initBinding()
        initRegisterButton()
        initCloseButton()
        initAcceptCheckBox()

    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun setupRegisterButton() {

            mBinding.mainActivityButtonRegister.setOnClickListener { registerButtonClickedCallback() }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initialize() {
        initBinding()
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
