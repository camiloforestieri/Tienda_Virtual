package com.example.tienda_virtual.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.tienda_virtual.R

class DetalleProductoFragment() : Fragment() {

    private lateinit var producto: Producto

    companion object {

        private const val ARG_PRODUCTO = "producto"

        fun newInstance(producto: Producto): DetalleProductoFragment {
            val fragment = DetalleProductoFragment()
            val args = Bundle()
            args.putParcelable(ARG_PRODUCTO, producto)
            fragment.arguments = args

            return fragment


        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (arguments != null) {
            producto = if (android.os.Build.VERSION.SDK_INT >= 33) {
                arguments?.getParcelable(ARG_PRODUCTO, producto::class.java)
                    ?: Producto(0,"Sin nombre", "Sin descripcion", 0.0, R.drawable.placeholder)
            } else {
                @Suppress("DEPRECATION")
                arguments?.getParcelable(ARG_PRODUCTO)
                    ?: Producto(0,"Sin nombre", "Sin descripcion", 0.0, R.drawable.placeholder)
            }

        } else {


                producto= Producto(0,"Sin nombre", "Sin descripcion", 0.0, R.drawable.placeholder)

        }


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragments_detalles_productos, container,  false)

        val imagenproducto = view.findViewById<ImageView>(R.id.detalle_imagen_producto)
        val nombreproducto = view.findViewById<TextView>(R.id.detalle_nombre_producto)
        val precioproducto = view.findViewById<TextView>(R.id.detalle_precio_producto)
        val descripcionproducto = view.findViewById<TextView>(R.id.detalle_descripcion_producto)
        val botoncomprar = view.findViewById<Button>(R.id.boton_comprar)

        imagenproducto.setImageResource(producto.imagen)
        nombreproducto.text = producto.nombre
        precioproducto.text = "Precio: $${producto.precio}"
        descripcionproducto.text = producto.descripcion

        botoncomprar.setOnClickListener {
            Toast.makeText(requireContext(), "Producto agregado al carrito", Toast.LENGTH_SHORT)
                .show()

        }
        return view
        }
    }













