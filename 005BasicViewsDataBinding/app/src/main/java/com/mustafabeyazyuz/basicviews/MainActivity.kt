package org.csystem.android.app.basicviews

import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import com.mustafabeyazyuz.basicviews.R
import com.mustafabeyazyuz.basicviews.databinding.ActivityMainBinding
import org.csystem.android.app.basicviews.global.INPUT_TYPE_TEXT_PASSWORD_HIDE
import org.csystem.android.app.basicviews.global.INPUT_TYPE_TEXT_PASSWORD_SHOW
import org.csystem.android.app.basicviews.global.alert.promptDecision
import org.csystem.android.app.basicviews.global.alert.promptNotConfirmedDialog
import org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel
import org.csystem.android.app.basicviews.viewmodel.RegisterInfo
import java.time.DateTimeException
import java.time.LocalDate

class  MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mMonths: Array<String>

    private fun neutralButtonClickedCallback()
    {
        mBinding.confirmPassword = ""
    }

    private fun positiveButtonClickedCallback()
    {
        finish()
    }

    private fun negativeButtonClickedCallback()
    {
        Toast.makeText(this, R.string.message_continue, Toast.LENGTH_SHORT).show()
    }

    private fun confirm(password: String, confirmPassword: String) : Boolean
    {
        var result = true

        if (password != confirmPassword) {
            promptNotConfirmedDialog(this, R.string.confirm_alert_dialog_title,
                R.string.message_password_not_confirmed, R.string.ok_button_text) {_, _ -> neutralButtonClickedCallback()}
            Toast.makeText(this, R.string.message_password_not_confirmed, Toast.LENGTH_LONG).show()
            result = false
        }

        return result
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun getRegisterInfo() : RegisterInfo?
    {
        if (!confirm(mBinding.password!!, mBinding.confirmPassword!!))
            return null

        val name = mBinding.registerInfoViewModel!!.name
        val email = mBinding.registerInfoViewModel!!.email
        val birthDate = LocalDate.of(mBinding.yearPos, mBinding.monthPos + 1, mBinding.dayPos)
        val userName = mBinding.registerInfoViewModel!!.userName

        return RegisterInfo(name, email, birthDate, userName, mBinding.password!!)
    }

    private fun clearEditTexts()
    {
        mBinding.password = ""
        for (view in mBinding.mainActivityLayoutRegisterInfo.children)
            if (view is EditText)
                view.setText("")

        mBinding.confirmPassword = ""
    }

    private fun setRegisterInfoVisibility(visibility: Int)
    {
        for (view in mBinding.mainActivityLayoutRegisterInfo.children)
            view.visibility = visibility
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initBirthDateTexts(today: LocalDate)
    {
        mBinding.dayPos = today.dayOfMonth - 1
        mBinding.monthPos = today.monthValue - 1
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun getDaysByMonthAndYear(monthPos: Int, yearPos: Int) : List<Int>
    {
        val max = LocalDate.of(yearPos, monthPos + 1, 1).minusDays(1).dayOfMonth

        return (1..max).toList()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initBirthDateAdapters()
    {
        val today = LocalDate.now()
        val years = (today.year - 100..today.minusYears(19).year).toList()

        mBinding.dayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, getDaysByMonthAndYear(today.monthValue, today.year))
        mBinding.monthAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, mMonths)
        mBinding.yearAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, years)
        mBinding.yearPos = mBinding.yearAdapter!!.count - 1
        initBirthDateTexts(today)
    }

    private fun initEducationAdapter()
    {
        val educationInfo = resources.getStringArray(R.array.spinner_education_info)

        mBinding.educationAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, educationInfo)
        mBinding.educationSelectedPos = 2
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initBirthDateSpinners()
    {
        initBirthDateAdapters()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initViewModels()
    {
        mBinding.registerInfoViewModel = RegisterInfo()
        mBinding.mainActivityViewModel = MainActivityListenersViewModel(this)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initData()
    {
        initViewModels()
        mBinding.show = true
        mBinding.passwordInputType = INPUT_TYPE_TEXT_PASSWORD_HIDE
        initEducationAdapter()
        initBirthDateSpinners()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initBinding()
    {
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initData()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initViews()
    {
        mMonths = resources.getStringArray(R.array.spinner_months)
        initBinding()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initialize()
    {
        initViews()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        initialize()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun allowClosePositiveButtonClickedCallback(checked: Boolean)
    {
        clearButtonClicked()
        setRegisterInfoVisibility(View.GONE)
    }

    private fun allowCShowPasswordNegativeButtonClickedCallback()
    {
        mBinding.allowShowPasswordChecked = false
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun openToggleButtonCheckedChanged(checked: Boolean)
    {
        if (!checked)
            AlertDialog.Builder(this).setTitle(R.string.confirm_alert_dialog_title)
                .setMessage(R.string.message_confirm_close)
                .setPositiveButton(R.string.yes_button_text) {_, _-> allowClosePositiveButtonClickedCallback(checked) }
                .setNegativeButton(R.string.no_button_text) {_, _ -> mBinding.mainActivityToggleButtonOpen.performClick()}
                .setOnCancelListener{mBinding.mainActivityToggleButtonOpen.performClick()}
                .create()
                .show()
        else
            setRegisterInfoVisibility(View.VISIBLE)
    }

    fun allowShowPasswordSwitchCheckedChanged(checked: Boolean)
    {
        if (!checked)
            return

        AlertDialog.Builder(this).setTitle(R.string.confirm_alert_dialog_title)
            .setMessage(R.string.message_enable_show_password)
            .setPositiveButton(R.string.yes_button_text) {_, _->  }
            .setNegativeButton(R.string.no_button_text) {_, _ -> allowCShowPasswordNegativeButtonClickedCallback() }
            .setOnCancelListener{mBinding.allowShowPasswordChecked = false}
            .create()
            .show()
    }

    fun showPasswordButtonClicked()
    {
        val show = mBinding.show as Boolean
        val resId = if (show) R.string.button_hide_password_text else R.string.button_show_password_text

        mBinding.showPasswordButtonText = resources.getString(resId)
        mBinding.passwordInputType = if (show) INPUT_TYPE_TEXT_PASSWORD_SHOW else INPUT_TYPE_TEXT_PASSWORD_HIDE
        mBinding.show = !show
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun registerButtonClicked()
    {
        try {
            val registerInfo = getRegisterInfo()

            if (registerInfo != null) {
                Toast.makeText(this, registerInfo.toString(), Toast.LENGTH_LONG).show()
                mBinding.result = registerInfo.toString()
            }
        }
        catch (ignore: NumberFormatException) {
            Toast.makeText(this, R.string.message_number_format_exception, Toast.LENGTH_LONG).show()
        }
        catch (ignore: DateTimeException) {
            Toast.makeText(this, R.string.message_datetime_exception, Toast.LENGTH_LONG).show()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun clearButtonClicked()
    {
        clearEditTexts()
        initBirthDateTexts(LocalDate.now())
        mBinding.accept = false
        mBinding.passwordInputType = INPUT_TYPE_TEXT_PASSWORD_HIDE
        mBinding.showPasswordButtonText = resources.getString(R.string.button_show_password_text)
        mBinding.show = true
        mBinding.result = ""
        mBinding.allowShowPasswordChecked = false
        mBinding.mainActivityEditTextName.requestFocus()
    }

    fun closeButtonClicked()
    {
        promptDecision(this, R.string.confirm_close_alert_dialog_title, R.string.message_confirm_close,
            R.string.yes_button_text, R.string.no_button_text,
            {_, _ -> positiveButtonClickedCallback()}) {_, _ -> negativeButtonClickedCallback()}
    }

    fun educationSpinnerItemSelected(pos: Int)
    {
        Toast.makeText(this, mBinding.educationAdapter!!.getItem(pos), Toast.LENGTH_LONG).show()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun birthDateMonthSpinnerItemSelected(pos: Int)
    {
        mBinding.dayAdapter?.clear()
        val year = mBinding.yearAdapter!!.getItem(mBinding.yearPos)!!.toInt()

        mBinding.dayAdapter?.addAll(getDaysByMonthAndYear(pos + 1, year))
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun birthDateYearSpinnerItemSelected(pos: Int)
    {
        mBinding.dayAdapter?.clear()
        val year = mBinding.yearAdapter!!.getItem(pos)!!.toInt()

        mBinding.dayAdapter?.addAll(getDaysByMonthAndYear(mBinding.monthPos + 1, year))
    }
}