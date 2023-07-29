package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Sitios extends AppCompatActivity {
    Button botonSitios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios);

        botonSitios=findViewById(R.id.botonvermassitios);
        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sitios.this, ListaSitios.class);
                startActivity(intent);
            }
        });

    }





}