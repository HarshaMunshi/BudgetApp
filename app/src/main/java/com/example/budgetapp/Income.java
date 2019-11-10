package com.example.budgetapp;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;
import android.graphics.Color;
import android.util.Log;

import java.util.ArrayList;


public class Income extends AppCompatActivity implements OnChartValueSelectedListener{
    private TextView mTextMessage;
EditText e1;


    PieChart pieChart;
String s1,s2,s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
        s1=getIntent().getStringExtra("bal");
        s2=getIntent().getStringExtra("inc");
        s3=getIntent().getStringExtra("exp");
        int i=Integer.parseInt(s1);
        int j=Integer.parseInt(s2);
        int k=Integer.parseInt(s3);
        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);


        ArrayList<Entry> yvalues = new ArrayList<Entry>();
        yvalues.add(new Entry(i, 0));
        yvalues.add(new Entry(j, 1));
        yvalues.add(new Entry(k, 2));




        PieDataSet dataSet = new PieDataSet(yvalues, "Money Manager");
        ArrayList<String> xVals = new ArrayList<String>();

        xVals.add("Balance");
        xVals.add("Income");
        xVals.add("Expense");

        PieData data = new PieData(xVals, dataSet);

        data.setValueFormatter(new PercentFormatter());
        pieChart.setData(data);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setTransparentCircleRadius(25f);
        pieChart.setHoleRadius(25f);


        data.setValueTextSize(13f);
        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);

        data.setValueTextColor(Color.DKGRAY);
        pieChart.animateXY(1400, 1400);
        pieChart.setOnChartValueSelectedListener(this);

    }
    @Override
    public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {

        if (e == null)
            return;
        Log.i("VAL SELECTED",
                "Value: " + e.getVal() + ", xIndex: " + e.getXIndex()
                        + ", DataSet index: " + dataSetIndex);
    }

    @Override
    public void onNothingSelected() {
        Log.i("PieChart", "nothing selected");
    }
}
