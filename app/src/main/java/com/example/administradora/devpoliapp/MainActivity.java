package com.example.administradora.devpoliapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button CalcularEdad;
    Button FondoPantalla;
    Button CalcularPropina;
    Button CalcularNota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalcularEdad=(Button)findViewById(R.id.button1);
        CalcularEdad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent CalcularEdad= new Intent(MainActivity.this, calcularEdad.class);
                    startActivity(CalcularEdad);                        }
        });

        FondoPantalla=(Button)findViewById(R.id.button2);
        FondoPantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FondoPantalla= new Intent(MainActivity.this, ImageSwap.class);
                startActivity(FondoPantalla);
            }
        });
        CalcularPropina=(Button)findViewById(R.id.button3);
        CalcularPropina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CalcularPropina= new Intent(MainActivity.this, propina.class);
                startActivity(CalcularPropina);
            }
        });
        CalcularNota=(Button)findViewById(R.id.button4);
        CalcularNota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CalcularNota= new Intent(MainActivity.this, CalcNota.class);
                startActivity(CalcularNota);
            }
        });
    }


    }
