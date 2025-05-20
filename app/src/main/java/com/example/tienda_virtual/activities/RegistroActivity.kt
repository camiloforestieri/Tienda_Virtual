package com.example.tienda_virtual.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tienda_virtual.R

// Conventional class name
class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Ensure this layout name matches your XML file (e.g., R.layout.activity_registro)
        setContentView(R.layout.activity_registro) // Assuming common naming activity_registro

        val cuentaTextView = findViewById<TextView>(R.id.yaTienesCuenta)
        cuentaTextView.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }




    }
}