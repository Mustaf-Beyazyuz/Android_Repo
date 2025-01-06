package org.csystem.android.app.basicviews.viewmodel

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
@RequiresApi(Build.VERSION_CODES.O)
data class RegisterInfo  constructor(var name: String = "", var email: String = "",
                                                                        var birthDate: LocalDate = LocalDate.now(),
                                                                        var userName: String = "", var password: String = "") {
    @RequiresApi(Build.VERSION_CODES.O)
    private val mFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val age: Double
        @RequiresApi(Build.VERSION_CODES.O)
        get() = ChronoUnit.DAYS.between(birthDate, LocalDate.now()) / 365.0

    @RequiresApi(Build.VERSION_CODES.O)
    override fun toString() =
        "$name, $email, ${mFormatter.format(birthDate)}, ${"%.1f".format(age)}"

}