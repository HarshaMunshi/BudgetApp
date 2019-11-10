package com.example.budgetapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private DrawerLayout drawer;
    Spinner spinner;
TextView t1,t2,t3,t4,t5,t6,t7;
String cat,cat1,cat2,cat3;
String monthvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        LinearLayout linear=(LinearLayout)findViewById(R.id.layout1);
        linear.setBackgroundColor(Color.rgb(255,102,104));
        drawer = findViewById(R.id.drawer_layout);
        spinner=findViewById(R.id.spinner);
        NavigationView navigationView=findViewById(R.id.nav_view);
            navigationView.bringToFront();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
@Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId())
                {

                    case R.id.nav_share:

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                new BlankFragment()).commit();

                        break;
                    case R.id.nav_fb:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                new fb()).commit();
                        break;
                    case R.id.nav_insta:
                        Toast.makeText(getApplicationContext(), "draw", Toast.LENGTH_LONG).show();

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                new Insta()).commit();

                        break;
                    case R.id.nav_youtube:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                new Youtube()).commit();

                        break;


                    default:return true;
                }
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        t1=findViewById(R.id.textView11);
t2=findViewById(R.id.textView13);
t3=findViewById(R.id.textView15);
t4=findViewById(R.id.textView17);
t6=findViewById(R.id.textView7);
t7=findViewById(R.id.textView8);
        t5=findViewById(R.id.textView6);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
       //populate spinner with data

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(toolbar.getContext(),
                R.array.months, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                      @Override
                                                      public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                          switch(position) {
                                                              case 0:
                                                                    monthvalue="January";
                                                                  Toast.makeText(getApplicationContext(), "jan", Toast.LENGTH_LONG).show();
                                                          break;
                                                              case 1:
                                                                  monthvalue="February";
                                                                  Toast.makeText(getApplicationContext(), "feb", Toast.LENGTH_LONG).show();
                                                                  break;
                                                              case 2:
                                                                  monthvalue="March";
                                                                  Toast.makeText(getApplicationContext(), "mar", Toast.LENGTH_LONG).show();
                                                                  break;
                                                              case 3:
                                                                  monthvalue="April";
                                                                  Toast.makeText(getApplicationContext(), "apr", Toast.LENGTH_LONG).show();
                                                                  break;
                                                              case 4:
                                                                  monthvalue="May";
                                                                  Toast.makeText(getApplicationContext(), "may", Toast.LENGTH_LONG).show();
                                                                  break;
                                                              case 5:
                                                                  monthvalue="June";
                                                                  Toast.makeText(getApplicationContext(), "jun", Toast.LENGTH_LONG).show();
                                                                  break;
                                                              case 6:
                                                                  monthvalue="July";
                                                                  Toast.makeText(getApplicationContext(), "Jul", Toast.LENGTH_LONG).show();
                                                                  break;
                                                              case 7:
                                                                  monthvalue="August";
                                                                  Toast.makeText(getApplicationContext(), "Aug", Toast.LENGTH_LONG).show();
                                                                  break;
                                                              case 8:
                                                                  monthvalue="September";
                                                                  Toast.makeText(getApplicationContext(), "sep", Toast.LENGTH_LONG).show();
                                                                  break;
                                                              case 9:
                                                                  monthvalue="October";
                                                                  Toast.makeText(getApplicationContext(), "oct", Toast.LENGTH_LONG).show();
                                                                  break;
                                                              case 10:
                                                                  monthvalue="November";
                                                                  Toast.makeText(getApplicationContext(), "nov", Toast.LENGTH_LONG).show();
                                                                  break;
                                                              case 11:
                                                                  monthvalue="December";
                                                                  Toast.makeText(getApplicationContext(), "dec", Toast.LENGTH_LONG).show();
                                                                  break;

                                                          }}

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
                                                  });

        cat=getIntent().getStringExtra("e1");
        cat1=getIntent().getStringExtra("e2");
        cat2=getIntent().getStringExtra("e3");
        cat3=getIntent().getStringExtra("e4");
       int i=getIntent().getIntExtra("e5",0);
        int j=getIntent().getIntExtra("e6",0);
        int k=getIntent().getIntExtra("e7",0);
        int l=getIntent().getIntExtra("e8",0);
        int z=getIntent().getIntExtra("e0",0);
        int m=(-i-j-k-l);
        int y=z+m;
        String k1=String.valueOf(m);
        String k2=String.valueOf(z);
        String k3=String.valueOf(y);
t1.setText(cat);
t2.setText(cat1);
t3.setText(cat2);
t4.setText(cat3);
t5.setText(k1);
t6.setText(k2);
t7.setText(k3);

    }

    public void onDrawerOpened(View drawerView) {

        drawerView.bringToFront();
        drawer.requestLayout();
    }



    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {

            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    public void bu(View view)
    {
        String s1=t1.getText().toString();
        String s2=t2.getText().toString();
        String s3=t3.getText().toString();
        String s4=t4.getText().toString();
        String s5=t6.getText().toString();
        Intent intent=new Intent(this,ImageActivity.class);
        intent.putExtra("text",s1);
        intent.putExtra("text1",s2);
        intent.putExtra("text2",s3);
        intent.putExtra("text3",s4);
        intent.putExtra("text4",s5);
        intent.putExtra("month",monthvalue);
        startActivity(intent);

    }
    public void bu11(View view)
    {String s1=t5.getText().toString();
        String s2=t6.getText().toString();
        String s3=t7.getText().toString();
        Intent intent=new Intent(this,Income.class);
        intent.putExtra("inc",s2);
        intent.putExtra("exp",s1);
        intent.putExtra("bal",s3);

        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

    }
}




