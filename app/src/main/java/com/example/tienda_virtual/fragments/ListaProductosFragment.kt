package com.example.tienda_virtual.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tienda_virtual.R

class ListaProductosFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout del fragmento
        val view = inflater.inflate(R.layout.fragments_lista_productos, container, false)

        // Inicializar el RecyclerView
        recyclerView = view.findViewById(R.id.recycler_productos)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)

        // Aquí puedes asignar tu adaptador con una lista de productos
        // recyclerView.adapter = ProductosAdapter(listaDeProductos)

        return view
    }
}
