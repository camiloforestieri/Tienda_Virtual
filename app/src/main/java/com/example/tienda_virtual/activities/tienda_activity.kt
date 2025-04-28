package com.example.tienda_virtual.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tienda_virtual.R

class tienda_activity :AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tienda)


        val irinicio = findViewById<Button>(R.id.ButtonInicio)
        irinicio.setOnClickListener {

            val intent = Intent(this, homeActivity::class.java)
            startActivity(intent)
        }




    }
}