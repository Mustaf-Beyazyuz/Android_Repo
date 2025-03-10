package com.example.a004_basicviewsbinding.viewModel

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

class RegisterInfo (var name : String = "",var email : String ="",var birthDate: LocalDate = LocalDate.now(),
                    val usarname : String = "",val password : String = ""){
    @RequiresApi(Build.VERSION_CODES.O)
    private val mFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    val age : Double
        @RequiresApi(Build.VERSION_CODES.O)
        get() = ChronoUnit.DAYS.between(birthDate, LocalDate.now())/365.0

    @RequiresApi(Build.VERSION_CODES.O)
    override fun toString()= "$name, $email, ${mFormatter.format(birthDate)}, $age  "
}