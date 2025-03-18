package com.mustafabeyazyuz.android.android_calismalar

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mustafabeyazyuz.android.android_calismalar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    var sayi1 :Double? =null
    var sayi2 :Double? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        if (binding.editTextText.text.isEmpty() ||binding.editTextText2.text.isEmpty())
        {
            binding.textView.text = "Sonuç"

        }



    }

    fun plusButton(view: View)
    {
        sayi1 = binding.editTextText.text.toString().toDoubleOrNull()
        sayi2 = binding.editTextText2.text.toString().toDoubleOrNull()

        if(sayi1 != null && sayi2 != null)
         binding.textView.text="${sayi1!! + sayi2!!}"

        else
            binding.textView.text="Sayıları Giriniz"
    }
    fun minusButton(view: View)
    {
        sayi1 = binding.editTextText.text.toString().toDoubleOrNull()
        sayi2 = binding.editTextText2.text.toString().toDoubleOrNull()
        if(sayi1 != null && sayi2 != null)
        binding.textView.text="${sayi1!! - sayi2!!}"
        else
            binding.textView.text="Sayıları Giriniz"
    }
    fun multiplyButton(view: View)
    {
        sayi1 = binding.editTextText.text.toString().toDoubleOrNull()
        sayi2 = binding.editTextText2.text.toString().toDoubleOrNull()
        if(sayi1 != null && sayi2 != null)
        binding.textView.text="${sayi1!! * sayi2!!}"
        else
        binding.textView.text="Sayıları Giriniz"
    }
    fun devideButton(view: View)
    {
        sayi1 = binding.editTextText.text.toString().toDoubleOrNull()
        sayi2 = binding.editTextText2.text.toString().toDoubleOrNull()
        if(sayi1 != null && sayi2 != null)
        binding.textView.text="${sayi1!! / sayi2!!}"
        else
        binding.textView.text="Numaraları Giriniz"
    }
}