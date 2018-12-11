package com.zwartapps.conversor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Atributos
        Button buttonConvert = findViewById(R.id.buttonConvert);
        Button buttonReset = findViewById(R.id.buttonReset);
        final EditText textoEuros = findViewById(R.id.editTextEuros);
        final TextView textoDollar = findViewById(R.id.textDollar);

        //Queremos que solamente se muestran 2 decimales en el resultado
        final DecimalFormat df2 = new DecimalFormat(".##");

        //Accion de calculo cuando se pulsa el boton de Convertir
        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Creamos un String temporal por si el usuario no introduce nada, aparece un mensaje
                String tmp = textoEuros.getText().toString();

                if (tmp.equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Introduzca una Cantidad", Toast.LENGTH_SHORT).show();
                } else {

                    double d = Double.parseDouble(String.valueOf(textoEuros.getText()));
                    double resultado = d * 1.22600;
                    textoDollar.setText(String.valueOf(df2.format(resultado)));
                }
            }
        });


        //Creamos el codigo para borar ambos campos cuando se pulsa el boton borrar
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDollar.setText("");
                textoEuros.setText("");
            }
        });
    }

}


