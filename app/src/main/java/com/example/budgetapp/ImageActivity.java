package com.example.budgetapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.MenuItem;
public class ImageActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4,e5;
    String cat,cat1,cat2,cat3,cat4;
    TextView month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);


       LinearLayout linear=(LinearLayout)findViewById(R.id.layout1);
        linear.setBackgroundColor(Color.rgb(214,250,250));
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText1);
        e3 = findViewById(R.id.editText2);
        e4 = findViewById(R.id.editText3);
        e5=findViewById(R.id.editText5);
        month=findViewById(R.id.month);
        String mon=getIntent().getStringExtra("month");
        month.setText(mon);
        cat=getIntent().getStringExtra("text");
        cat1=getIntent().getStringExtra("text1");
        cat2=getIntent().getStringExtra("text2");
        cat3=getIntent().getStringExtra("text3");
        cat4=getIntent().getStringExtra("text4");
        e1.setText(cat);
        e2.setText(cat1);
        e3.setText(cat2);
        e4.setText(cat3);
        e5.setText(cat4);


    }

    public void bu11(View view)
    {
        try{
String s1=e1.getText().toString();
String s2=e2.getText().toString();
String s3=e3.getText().toString();
String s4=e4.getText().toString();
String s5=e5.getText().toString();
    if(s1.equals("")) {
        e1.setText("0");
    }
     if(s2.equals(""))
     {
        e2.setText("0");
     }
     if(s3.equals(""))
     {
                e3.setText("0");
     }
            if(s4.equals(""))
            {
                e4.setText("0");
            }
            if(s5.equals(""))
            {
                e5.setText("0");
            }


            int i=Integer.parseInt(s1);
        int j=Integer.parseInt(s2);
        int k=Integer.parseInt(s3);
        int l=Integer.parseInt(s4);
        int m=Integer.parseInt(s5);
Intent intent=new Intent(this,HomeActivity.class);
intent.putExtra("e1",s1);
intent.putExtra("e2",s2);
intent.putExtra("e3",s3);
intent.putExtra("e4",s4);
        intent.putExtra("e5",i);
        intent.putExtra("e6",j);
        intent.putExtra("e7",k);
        intent.putExtra("e8",l);
        intent.putExtra("e0",m);
startActivity(intent);}
        catch(NumberFormatException e){}
        catch(Exception e){}
    }


}