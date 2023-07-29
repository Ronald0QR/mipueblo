package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Restaurante extends AppCompatActivity {
    Button botonRes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        botonRes=findViewById(R.id.botonvermasrestaurantes);
        botonRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurante.this, ListaRestaurantes.class);
                startActivity(intent);
            }
        });

    }





}