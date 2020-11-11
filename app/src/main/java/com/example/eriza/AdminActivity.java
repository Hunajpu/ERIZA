package com.example.eriza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class AdminActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private BarChart grafica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        ArrayList<BarEntry> entradas = new ArrayList<>();
        entradas.add(new BarEntry(4f, 0));
        entradas.add(new BarEntry(6f,2));
        entradas.add(new BarEntry(12f, 3));
        entradas.add(new BarEntry(18f, 4));
        entradas.add(new BarEntry(9f, 5));
        entradas.add(new BarEntry(10f, 6));
        entradas.add(new BarEntry(11f, 7));
        entradas.add(new BarEntry(7f, 8));
        entradas.add(new BarEntry(6f, 9));

        BarDataSet datos = new BarDataSet(entradas, "Cosechas en 2020");
        datos.setColors(ColorTemplate.LIBERTY_COLORS);

        grafica = findViewById(R.id.chart_a);

        BarData info = new BarData(datos);
        grafica.setData(info);
        grafica.setFitBars(true);
        grafica.invalidate();

        Spinner spinnerZona = (Spinner)findViewById(R.id.spinner);
        spinnerZona.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ImageView img = findViewById(R.id.imageView2);

        switch(position){
            case 0:
                img.setImageResource(R.drawable.img5);
                break;
            case 1:
                img.setImageResource(R.drawable.img6);
                break;
            case 2:
                img.setImageResource(R.drawable.img7);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}