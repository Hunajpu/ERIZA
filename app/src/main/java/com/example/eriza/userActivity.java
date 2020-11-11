package com.example.eriza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class userActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private BarChart grafica;

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

        Spinner spinnerZona = (Spinner)findViewById(R.id.spinner_zona);
        spinnerZona.setOnItemSelectedListener(this);

        ArrayList<BarEntry> entradas = new ArrayList<>();
        entradas.add(new BarEntry(4f, 0));
        entradas.add(new BarEntry(8f, 1));
        entradas.add(new BarEntry(6f,2));
        entradas.add(new BarEntry(12f, 3));
        entradas.add(new BarEntry(18f, 4));
        entradas.add(new BarEntry(9f, 5));
        entradas.add(new BarEntry(10f, 6));
        entradas.add(new BarEntry(11f, 7));
        entradas.add(new BarEntry(7f, 8));
        entradas.add(new BarEntry(6f, 9));

        BarDataSet datos = new BarDataSet(entradas, "Cosechas en la zona en 2020");

        grafica = findViewById(R.id.chart);

        BarData info = new BarData(datos);
        grafica.setData(info);
        grafica.setFitBars(true);
        grafica.invalidate();

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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ImageView img = findViewById(R.id.imageView);

        switch(position){
            case 0:
                img.setImageResource(R.drawable.img0);
                break;
            case 1:
                img.setImageResource(R.drawable.img1);
                break;
            case 2:
                img.setImageResource(R.drawable.img2);
                break;
            case 3:
                img.setImageResource(R.drawable.img3);
                break;
            case 4:
                img.setImageResource(R.drawable.img4);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
