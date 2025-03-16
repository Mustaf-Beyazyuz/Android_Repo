package com.example.payment.repository.entity

import android.icu.util.LocaleData

data class User (var username: String,var password: String,
                 var firstname: String, var middleName: String?, var lastName: String,
                 var birthDate:LocaleData , var registerDate : LocaleData) {
}