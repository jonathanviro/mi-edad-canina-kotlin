package com.javr.mi_edad_canina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.javr.mi_edad_canina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edtEdad = binding.edtEdad
        val txtResultado = binding.txtResultado
        val btnCalcular = binding.btnCalcular

        btnCalcular.setOnClickListener {
            val strEdad: String = edtEdad.text.toString()
            if(strEdad.isNotEmpty()){
                val intResultado: Int = strEdad.toInt() * 7
                txtResultado.text = getString(R.string.result_text, intResultado)
            }else{
                Log.d("MainActivity", "Edad vacia")
                Toast.makeText(this, R.string.your_must_insert_your_age, Toast.LENGTH_SHORT).show()
            }
        }
    }
}