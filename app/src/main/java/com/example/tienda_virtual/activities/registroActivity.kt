package com.example.tienda_virtual.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tienda_virtual.R

class registroActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_registro)

        val cuenta = findViewById<TextView>(R.id.yaTienesCuenta)
        cuenta.setOnClickListener {

            val intent = Intent(this,loginActivity::class.java)
            startActivity(intent)
        }

    }
}