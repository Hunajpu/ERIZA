package com.example.eriza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        //Botón que te lleva a la pestaña de historial
        final Button botonHistorial = findViewById(R.id.button3);
        botonHistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirHistorial();
            }
        });

        //Botón que te lleva a la pestaña de predicciones
        final Button botonFuturo = findViewById(R.id.button4);
        botonFuturo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirFuturo();
            }
        });
    }

    public void abrirHistorial()
    {
        Intent intent = new Intent(userActivity.this, pastActivity.class);
        startActivity(intent);
    }

    public void abrirFuturo()
    {
        Intent intent = new Intent(userActivity.this, futureActivity.class);
        startActivity(intent);
    }
}
