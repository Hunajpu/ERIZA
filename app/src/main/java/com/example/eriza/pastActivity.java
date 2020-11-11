package com.example.eriza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class pastActivity extends AppCompatActivity {

    private BarChart grafica1;
    private BarChart grafica2;
    private BarChart grafica3;
    private BarChart grafica4;
    private PieChart grafica5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past);

        ArrayList<BarEntry> entradas1 = new ArrayList<>();
        entradas1.add(new BarEntry(4f, 0));
        entradas1.add(new BarEntry(6f,2));
        entradas1.add(new BarEntry(12f, 3));
        entradas1.add(new BarEntry(18f, 4));
        entradas1.add(new BarEntry(9f, 5));
        entradas1.add(new BarEntry(10f, 6));
        entradas1.add(new BarEntry(11f, 7));
        entradas1.add(new BarEntry(7f, 8));
        entradas1.add(new BarEntry(6f, 9));

        BarDataSet datos1 = new BarDataSet(entradas1, "Humedad");
        datos1.setColors(ColorTemplate.COLORFUL_COLORS);

        grafica1 = findViewById(R.id.chart_humedad);

        BarData info1 = new BarData(datos1);
        grafica1.setData(info1);
        grafica1.setFitBars(true);
        grafica1.invalidate();



        ArrayList<BarEntry> entradas2 = new ArrayList<>();
        entradas2.add(new BarEntry(4f, 0));
        entradas2.add(new BarEntry(6f,2));
        entradas2.add(new BarEntry(12f, 3));
        entradas2.add(new BarEntry(18f, 4));
        entradas2.add(new BarEntry(9f, 5));
        entradas2.add(new BarEntry(10f, 6));
        entradas2.add(new BarEntry(11f, 7));
        entradas2.add(new BarEntry(7f, 8));
        entradas2.add(new BarEntry(6f, 9));

        BarDataSet datos2 = new BarDataSet(entradas2, "pH del suelo");
        datos1.setColors(ColorTemplate.JOYFUL_COLORS);

        grafica2 = findViewById(R.id.chart_ph);

        BarData info2 = new BarData(datos2);
        grafica2.setData(info2);
        grafica2.setFitBars(true);
        grafica2.invalidate();


        ArrayList<BarEntry> entradas3 = new ArrayList<>();
        entradas3.add(new BarEntry(4f, 0));
        entradas3.add(new BarEntry(6f,2));
        entradas3.add(new BarEntry(12f, 3));
        entradas3.add(new BarEntry(18f, 4));
        entradas3.add(new BarEntry(9f, 5));
        entradas3.add(new BarEntry(10f, 6));
        entradas3.add(new BarEntry(11f, 7));
        entradas3.add(new BarEntry(7f, 8));
        entradas3.add(new BarEntry(6f, 9));

        BarDataSet datos3 = new BarDataSet(entradas3, "Temperatura");
        datos3.setColors(ColorTemplate.LIBERTY_COLORS);

        grafica3 = findViewById(R.id.chart_temp);

        BarData info3 = new BarData(datos3);
        grafica3.setData(info3);
        grafica3.setFitBars(true);
        grafica3.invalidate();


        ArrayList<BarEntry> entradas4 = new ArrayList<>();
        entradas4.add(new BarEntry(4f, 0));
        entradas4.add(new BarEntry(6f,2));
        entradas4.add(new BarEntry(12f, 3));
        entradas4.add(new BarEntry(18f, 4));
        entradas4.add(new BarEntry(9f, 5));
        entradas4.add(new BarEntry(10f, 6));
        entradas4.add(new BarEntry(11f, 7));
        entradas4.add(new BarEntry(7f, 8));
        entradas4.add(new BarEntry(6f, 9));

        BarDataSet datos4 = new BarDataSet(entradas4, "Velocidad del Viento");
        datos1.setColors(ColorTemplate.PASTEL_COLORS);

        grafica4 = findViewById(R.id.chart_velViento);

        BarData info4 = new BarData(datos4);
        grafica4.setData(info4);
        grafica4.setFitBars(true);
        grafica4.invalidate();



        List<PieEntry> entries = new ArrayList<>();

        entries.add(new PieEntry(18.5f, "Comp. 1"));
        entries.add(new PieEntry(26.7f, "Comp. 2"));
        entries.add(new PieEntry(24.0f, "Comp. 3"));
        entries.add(new PieEntry(30.8f, "Comp. 4"));

        PieDataSet set = new PieDataSet(entries, "Composicion del Suelo");
        PieData data = new PieData(set);

        grafica5 = findViewById(R.id.chart_quim);

        grafica5.setData(data);
        grafica5.invalidate();
    }
}
