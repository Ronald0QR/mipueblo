package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {

    //
    ArrayList<MoldeHotel> listaSitios = new ArrayList<>();
    RecyclerView recyclerSitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerSitos = findViewById(R.id.listaHoteles);
        recyclerSitos.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        HotelAdaptador adaptador = new HotelAdaptador(listaSitios);
        recyclerSitos.setAdapter(adaptador);
    }

    public void crearLista(){
        listaSitios.add(new MoldeHotel("Linda Calle TalaE","199000",R.drawable.sitio1) );
        listaSitios.add(new MoldeHotel("Sitio Lindo Karen","199100",R.drawable.sitio4) );
        listaSitios.add(new MoldeHotel("Maravilla Marav","199200",R.drawable.sitio3) );
        listaSitios.add(new MoldeHotel(" Bribracatateo","199300",R.drawable.sitio4) );
        listaSitios.add(new MoldeHotel(" Diamante","199400",R.drawable.sitio3) );
    }

}