package com.mustafabeyazyuz.android.hilt.application

import android.app.Application
import android.widget.Toast
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HiltApplication: Application() {


    override fun onCreate() {
        Toast.makeText(this,"Application Started", Toast.LENGTH_LONG).show()
        super.onCreate()
    }
}