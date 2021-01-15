package com.example.first_try;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class IT_MAIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void opentranslates(View view){
        Intent openTheItTranslations = new Intent(IT_MAIN.this, Translate_IT.class);
        startActivity(openTheItTranslations);


    }

    public void openlocations(View view){

        FragmentManager fm = getSupportFragmentManager();
        Locations_IT location = new Locations_IT();

        fm.beginTransaction().replace(R.id.ITMAIN, location).addToBackStack(null).commit();
    }

    public void openimportantlocations(View view){
        FragmentManager fm = getSupportFragmentManager();
        Important_Locations_IT location = new Important_Locations_IT();
        fm.beginTransaction().replace(R.id.ITMAIN, location).addToBackStack(null).commit();
    }

    public void openphones(View view){
        FragmentManager fm = getSupportFragmentManager();
        Phones_IT phone = new Phones_IT();
        fm.beginTransaction().replace(R.id.ITMAIN, phone).addToBackStack(null).commit();
    }

    public void openperigrafh(View view){
        String url = "https://el.wikipedia.org/wiki/%CE%99%CF%84%CE%B1%CE%BB%CE%AF%CE%B1";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }
}
