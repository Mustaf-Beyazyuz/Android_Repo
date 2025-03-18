package com.mustafabeyazyuz.android.superkahramankitabi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mustafabeyazyuz.android.superkahramankitabi.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var superKahramanListesi : ArrayList<SuperKahraman>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val superman = SuperKahraman("Superman","Gazateci", R.drawable.superman)
        val batman = SuperKahraman("Batman","Patron",R.drawable.batman)
        val ironman = SuperKahraman("Ironman","Patron", R.drawable.ironman)
        val captanAmerica = SuperKahraman("Captan America", "Asker",R.drawable.captan_america)
        superKahramanListesi = arrayListOf(superman,batman,ironman,captanAmerica)
    }
}