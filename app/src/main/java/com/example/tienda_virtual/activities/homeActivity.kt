package com.example.tienda_virtual.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tienda_virtual.R
import kotlinx.coroutines.handleCoroutineException

class homeActivity : AppCompatActivity () {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnInicio = findViewById<Button>(R.id.btn_inicio)
        btnInicio.setOnClickListener {

            val intent = Intent(this,loginActivity::class.java)
            startActivity(intent)
        }


        val btnRegistrarse = findViewById<Button>(R.id.btn_registrarse)
        btnRegistrarse.setOnClickListener {

            val intent = Intent(this,registroActivity::class.java)
            startActivity(intent)
        }


    }
}


