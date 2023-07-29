package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Home extends AppCompatActivity {

    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitios;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botonHoteles = findViewById(R.id.botonHoteles);
        botonRestaurantes = findViewById(R.id.botonRestaurantes);
        botonSitios = findViewById(R.id.botonSitios);

        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrimos una nueva actividad desde el HOME
                Intent intent = new Intent(Home.this, Hoteles.class);
                startActivity(intent);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrimos una nueva actividad desde el HOME
                Intent intent1 = new Intent(Home.this, Restaurante.class);
                startActivity(intent1);
            }
        });

        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrimos una nueva actividad desde el HOME
                Intent intent2 = new Intent(Home.this, Sitios.class);
                startActivity(intent2);
            }
        });
    }

    //Cargamos el menu de opciones
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //Funcion para cargar el funcionamiento del munu
    public boolean onOptionsItemSelected(MenuItem item){
        //observar el comportamiento del usuario frente el menu
        int itemSeleccionado=item.getItemId();

        switch(itemSeleccionado){
            case(R.id.opcion1):
                Intent intentacecacade=new Intent(Home.this,Home.class);
                startActivity(intentacecacade);
                break;
            case(R.id.opcion2):
                this.cambiarIdioma("en");
                Intent intent1=new Intent(Home.this,Home.class);
                startActivity(intent1);
                break;
            case(R.id.opcion3):
                this.cambiarIdioma("es");
                Intent intent2=new Intent(Home.this,Home.class);
                startActivity(intent2);
                break;
            case(R.id.opcion4):
                this.cambiarIdioma("pt");
                Intent intent3=new Intent(Home.this,Home.class);
                startActivity(intent3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    //metodo para cambiar el idioma de mi app
    public void cambiarIdioma(String idioma){

        //configurando el lenguaje del telefono
        Locale lenguaje=new Locale(idioma);
        Locale.setDefault(lenguaje);

        //configracion global en el telefono
        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=lenguaje;

        //ejecutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());

    }






}