package com.example.a004_basicviewsbinding

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
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
    private fun clearEditText()
    {
        mBinding.mainActivityEditTextPassword.setText("")
        for(view in mBinding.LinearLayout.children)
        {
            if(view is EditText)
                view.setText("")
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun clearButtonClickCallBack() {
        clearEditText()
        initBirthDateTexts()
        mBinding.mainActivityCheckBoxAcceptConditions.isChecked = false
        showPasswordButtonClickedCallback()

    }
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
    @RequiresApi(Build.VERSION_CODES.O)
    private fun initClearButton()
    {
        mBinding.mainActivityClearButton.apply { setOnClickListener{clearButtonClickCallBack()} }


    }

    private fun initAcceptCheckBox()
    {

            mBinding.mainActivityCheckBoxAcceptConditions
                    .setOnCheckedChangeListener(){ _, checked -> mBinding
                    .mainActivityButtonRegister.isEnabled = checked }
    }

    private fun initBinding() {

        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mBinding.registerInfoViewModel

    }

    private fun changeShowPasswordButtonText() {
        with(mBinding.mainActivityShowPasswordButton) {
            val show = tag as Boolean
            val resId = if (show) R.string.button_hide_password_text else R.string.button_show_password_text

            setText(resId)

            val showInput = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            val hideInput = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_TEXT_VARIATION_PASSWORD

            mBinding.mainActivityEditTextPassword.inputType =
                if(show)showInput else InputType.TYPE_NUMBER_VARIATION_PASSWORD
            tag = !show
        }
    }

    private fun showPasswordButtonClickedCallback() {
        changeShowPasswordButtonText()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun initBirthDateTexts()
    {
        val today = LocalDate.now()
        mBinding.mainActivityEditTextDay.setText(today.dayOfMonth)
        mBinding.mainActivityEditTextMonth.setText(today.monthValue)
        mBinding.mainActivityEditTextYear.setText(today.year)
    }

    private fun initShowPasswordButton() {
        mBinding.mainActivityShowPasswordButton.apply {
            tag = true
            setOnClickListener { showPasswordButtonClickedCallback()}
        }
    }




    @RequiresApi(Build.VERSION_CODES.O)
    private fun initViews()
    {

        initBinding()
        initBirthDateTexts()
        initShowPasswordButton()
        initRegisterButton()
        initClearButton()
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
