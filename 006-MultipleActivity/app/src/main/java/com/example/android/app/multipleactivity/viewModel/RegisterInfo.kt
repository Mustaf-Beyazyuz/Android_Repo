package com.example.android.app.multipleactivity.viewModel

import java.time.LocalDate
import java.time.Month
import java.time.temporal.ChronoUnit

data class RegisterInfo(var firsName: String="",
                        var middleName : String?  ="",
                        var lastName: String = "",
                        var email: String = "",
                        var password : String = "",
                        var birthDate: LocalDate = LocalDate.of(1998,Month.JUNE,8) ) {
    val age: Double
        get() = ChronoUnit.DAYS.between(birthDate,LocalDate.now()) / 365.0

    val fullname: String
        get() = "$firsName ${if (middleName != null) middleName else ""} $lastName".trim()


}