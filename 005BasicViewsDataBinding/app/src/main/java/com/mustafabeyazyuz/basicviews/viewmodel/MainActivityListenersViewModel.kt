package org.csystem.android.app.basicviews.viewmodel

import android.os.Build
import androidx.annotation.RequiresApi
import org.csystem.android.app.basicviews.MainActivity
import java.lang.ref.WeakReference

class MainActivityListenersViewModel(activity: MainActivity) {
    private val mWeakReference = WeakReference(activity)
    @RequiresApi(Build.VERSION_CODES.O)
    fun handleOpenToggleButton(checked: Boolean) = mWeakReference.get()?.openToggleButtonCheckedChanged(checked)

    fun handleAllowShowPasswordSwitch(checked: Boolean) = mWeakReference.get()?.allowShowPasswordSwitchCheckedChanged(checked)

    fun handleShowPasswordButton() = mWeakReference.get()?.showPasswordButtonClicked()

    @RequiresApi(Build.VERSION_CODES.O)
    fun handleRegisterButton() = mWeakReference.get()?.registerButtonClicked()

    @RequiresApi(Build.VERSION_CODES.O)
    fun handleClearButton() = mWeakReference.get()?.clearButtonClicked()

    fun handleCloseButton() = mWeakReference.get()?.closeButtonClicked()

    fun handleEducationSpinner(pos: Int) = mWeakReference.get()?.educationSpinnerItemSelected(pos)

    @RequiresApi(Build.VERSION_CODES.O)
    fun handleBirthDateMonthSpinner(pos: Int) = mWeakReference.get()?.birthDateMonthSpinnerItemSelected(pos)

    @RequiresApi(Build.VERSION_CODES.O)
    fun handleBirthDateYearSpinner(pos: Int) = mWeakReference.get()?.birthDateYearSpinnerItemSelected(pos)
}