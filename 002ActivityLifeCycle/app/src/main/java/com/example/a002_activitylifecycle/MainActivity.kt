package com.example.a002_activitylifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class   MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        Toast.makeText(this,R.string.on_creat_message,Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        Toast.makeText(this,R.string.on_start_message,Toast.LENGTH_SHORT).show()
        super.onStart()
    }

    override fun onStop() {
        Toast.makeText(this, R.string.on_stop_message,Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onRestart() {
        Toast.makeText(this,R.string.on_restart_message,Toast.LENGTH_SHORT).show()
        super.onRestart()
    }

    override fun onPause() {
        Toast.makeText(this,R.string.on_pause_message,Toast.LENGTH_SHORT).show()
        super.onPause()
    }
}