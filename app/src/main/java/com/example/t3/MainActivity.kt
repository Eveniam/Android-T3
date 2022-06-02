package com.example.t3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity: AppCompatActivity {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Boton1 = findViewById<Button>(R.id.btnRegistrar)
        Boton1.setOnClickListener {
            val intent = Intent(applicationContext, Registrar::class.java)
            startActivity(intent)
        }
        val Boton2 = findViewById<Button>(R.id.btnMostrar)
        Boton2.setOnClickListener {
            val intent = Intent(applicationContext, Mostrar::class.java)
            startActivity(intent)
        }
    }
}