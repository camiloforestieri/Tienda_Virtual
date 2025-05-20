package com.example.tienda_virtual.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tienda_virtual.R.id
import com.example.tienda_virtual.R.layout

// It's conventional to start class names with an uppercase letter
class HomeActivity : AppCompatActivity() { // Changed from homeActivity

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_home)

        val btnInicio = findViewById<Button>(id.btn_inicio)
        btnInicio.setOnClickListener {
            // Assuming loginActivity is also renamed to LoginActivity
            val intent = Intent(this, MapaActivity::class.java)
            startActivity(intent)
        }

        val conoceTiendas = findViewById<Button>(id.conoce_tiendas)
        conoceTiendas.setOnClickListener {
            // Assuming loginActivity is also renamed to LoginActivity
            val intent = Intent(this, MapaActivity::class.java)
            startActivity(intent)
        }

        val btnRegistrarse = findViewById<Button>(id.btn_registrarse)
        btnRegistrarse.setOnClickListener {
            // Assuming registroActivity is also renamed to RegistroActivity
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }
    }
}

