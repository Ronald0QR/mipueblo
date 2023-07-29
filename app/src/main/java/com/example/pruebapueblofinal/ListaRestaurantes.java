package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    //
    ArrayList<MoldeHotel> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerRestaurantes = findViewById(R.id.listaHoteles);
        recyclerRestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        HotelAdaptador adaptador = new HotelAdaptador(listaRestaurantes);
        recyclerRestaurantes.setAdapter(adaptador);
    }

    public void crearLista(){
        listaRestaurantes.add(new MoldeHotel("Restaurante TalaE","199000",R.drawable.comida1) );
        listaRestaurantes.add(new MoldeHotel("Restaurante Karen","199100",R.drawable.comida2) );
        listaRestaurantes.add(new MoldeHotel("Restaurante Marav","199200",R.drawable.comida3) );
        listaRestaurantes.add(new MoldeHotel("Restaurante Bribracatateo","199300",R.drawable.comida4) );
        listaRestaurantes.add(new MoldeHotel("Restaurante Diamante","199400",R.drawable.comida1) );
    }

}