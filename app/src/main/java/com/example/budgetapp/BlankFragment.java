package com.example.budgetapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.jetbrains.annotations.Nullable;





public class BlankFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Intent myintent=new Intent();
        myintent.setAction(Intent.ACTION_SEND);
        myintent.setType("text/plain");
        String sharebody="Your body hear";
        String sharesub="Your subject hear";
        myintent.putExtra(Intent.EXTRA_TEXT,sharebody);
        myintent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
        startActivity(Intent.createChooser(myintent,"Share Using"));
        Log.d("message","share is clicked");
        return  inflater.inflate(R.layout.fragment_blank,container,false);
    }
}
