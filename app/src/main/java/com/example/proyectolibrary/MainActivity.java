package com.example.proyectolibrary;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.Normalizer;

public class MainActivity extends AppCompatActivity {
    TextView linkFormularioRegistrar, linkOlvideContrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linkFormularioRegistrar = (TextView) findViewById(R.id.textViewRegistrarse);
        linkOlvideContrasena = (TextView) findViewById(R.id.textViewOlvideContrasena);

        linkFormularioRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //finish();
                Intent i = new Intent(MainActivity.this, FormularioRegistrar.class);
                startActivity(i);
            }
        });

        linkOlvideContrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //finish();
                Intent i = new Intent(MainActivity.this, OlvideContrasena.class);
                startActivity(i);
            }
        });


    }
}