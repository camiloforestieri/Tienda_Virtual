package com.example.tienda_virtual.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tienda_virtual.R

class loginActivity :AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val irtienda = findViewById<Button>(R.id.loginButton)
        irtienda.setOnClickListener {

            val intent = Intent(this,tienda_activity::class.java)
            startActivity(intent)
        }


    }
}