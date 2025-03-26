package com.example.payment.repository.entity

import java.io.Serializable
import java.time.LocalDate

data class User (
    var username: String, var password: String,
    var firstname: String, var middleName: String?, var lastName: String,
    var birthDate: LocalDate?, var registerDate: LocalDate
) : Serializable {

    constructor(username: String, password: String,
                firstname: String, lastName: String,
                birthDate: LocalDate?, registerDate: LocalDate
    )
            : this(username, password ,firstname,null,lastName, birthDate, registerDate)
}