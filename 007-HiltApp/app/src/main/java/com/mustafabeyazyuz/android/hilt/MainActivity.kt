package com.mustafabeyazyuz.android.hilt

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mustafabeyazyuz.android.hilt.datatime.DateInfo
import com.mustafabeyazyuz.android.hilt.datatime.DateTimeInfo
import com.mustafabeyazyuz.android.hilt.datatime.TimeInfo
import com.mustafabeyazyuz.module.formatter.annotation.DateFormatterInterceptor
import com.mustafabeyazyuz.module.formatter.annotation.DateTimeFormatterInterceptor
import com.mustafabeyazyuz.module.formatter.annotation.TimeFormatterInterceptor
import dagger.hilt.android.AndroidEntryPoint
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var dateTimeInfo: DateTimeInfo

    @Inject
    lateinit var  dateInfo : DateInfo

    @Inject
    lateinit var timeInfo: TimeInfo

    private fun showDateTime() {
        val sb = StringBuilder().append("DateTime: ").append(dateTimeInfo.toString()).append("\n")
            .append("Date: ").append(dateInfo.toString()).append("\n")
            .append("Time: ").append(timeInfo.toString())

        Toast.makeText(this, sb.toString(), Toast.LENGTH_LONG).show()
    }

    private fun initialize() {
        setContentView(R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        initialize()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Toast.makeText(this, dateTimeInfo.toString(), Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        showDateTime()
        super.onResume()
    }
}
