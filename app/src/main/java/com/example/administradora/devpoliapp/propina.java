package com.example.administradora.devpoliapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class propina extends AppCompatActivity {
    Button CalcularPropina1;
    RadioButton malo5;
    RadioButton bueno10;
    RadioButton excelente15;
    EditText valor;
    TextView resultado;
    TextView textoCondiciones;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propina);
        CalcularPropina1=(Button)findViewById(R.id.buttonpropina);
        malo5=(RadioButton)findViewById(R.id.radioButton1);
        bueno10=(RadioButton)findViewById(R.id.radioButton2);
        excelente15=(RadioButton)findViewById(R.id.radioButton3);
        valor=(EditText)findViewById(R.id.editText1);
        resultado=(TextView)findViewById(R.id.textview1);
        textoCondiciones=(TextView)findViewById(R.id.textView3);

        CalcularPropina1.setOnClickListener(new View.OnClickListener() {
            int valorproducto = Integer.parseInt(valor.getText().toString());
            double resultadopropina;
            String valordepropina;
            public void onClick(View view) {
                if (malo5.isChecked()==true) {
                    resultadopropina = valorproducto * 0.5;
                    valordepropina = String.valueOf(resultadopropina);
                    resultado.setText("La propina es " + valordepropina);
                } else
                if (bueno10.isChecked()==true) {
                    resultadopropina = valorproducto * 0.10;
                    valordepropina = String.valueOf(resultadopropina);
                    resultado.setText("La propina es " + valordepropina);
                }else
                if (excelente15.isChecked()==true) {
                    resultadopropina = valorproducto * 0.15;
                    valordepropina = String.valueOf(resultadopropina);
                    resultado.setText("La propina es " + valordepropina);
                }
            }
        });
    }
}
