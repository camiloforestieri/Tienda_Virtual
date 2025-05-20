package com.example.tienda_virtual.activities

// import com.google.android.gms.maps.model.LatLngBounds // Not currently used, can be removed
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tienda_virtual.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapaActivity : AppCompatActivity(), OnMapReadyCallback {

    // Declare mMap correctly
    private lateinit var mMap: GoogleMap

    // Ubicacion de tiendas
    private val ubicacion1 = LatLng(4.6535, -74.1185) // Bogota
    private val ubicacion2 = LatLng(10.388888, -74.813611) // Cartagena
    private val ubicacion3 = LatLng(6.2521, -75.5762) // Medellin

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa)

        val btncomprar = findViewById<Button>(R.id.btn_comprar)
        btncomprar.setOnClickListener {
            // Assuming loginActivity is also renamed to LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this) // 'this' refers to OnMapReadyCallback

        setupButtonListeners()


    }

    // This callback is triggered when the map is ready to be used.
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.uiSettings.isZoomControlsEnabled = true

        // You can set a default location or behavior here when the map first loads
        // For example, move to the first location:
        // moveToLocation(ubicacion1, "Bogotá")

        // Or, show all markers initially (see further suggestions below)
    }

    private fun setupButtonListeners() {
        findViewById<Button>(R.id.btn_ubicacion_1).setOnClickListener {
            // Ensure mMap is initialized before using it
            if (::mMap.isInitialized) {
                moveToLocation(ubicacion1, "Bogotá")
            }
        }

        // Add listeners for other buttons if you have them in your layout
        // Assuming you have btn_ubicacion_2 and btn_ubicacion_3 in your XML
        findViewById<Button>(R.id.btn_ubicacion_2)?.setOnClickListener {
            if (::mMap.isInitialized) {
                moveToLocation(ubicacion2, "Cartagena")
            }
        }

        findViewById<Button>(R.id.btn_ubicacion_3)?.setOnClickListener {
            if (::mMap.isInitialized) {
                moveToLocation(ubicacion3, "Medellín")
            }
        }
    }

    private fun moveToLocation(location: LatLng, title: String) {
        mMap.clear() // Clears all markers, overlays, etc. from the map
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 15f))
        // Set the title on MarkerOptions
        mMap.addMarker(MarkerOptions().position(location).title(title))
    }
}