package com.example.first_try;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class FRA_MAIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fra_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void opentranslates(View view){
        Intent openTheFraTranslations = new Intent(FRA_MAIN.this, Translate_FRA.class);
        startActivity(openTheFraTranslations);

    }

    public void openlocations(View view){

        FragmentManager fm = getSupportFragmentManager();
        Locations_FRA location = new Locations_FRA();

        fm.beginTransaction().replace(R.id.FRAMAIN, location).addToBackStack(null).commit();
    }

    public void openimportantlocations(View view){
        FragmentManager fm = getSupportFragmentManager();
        Important_Locations_FRA location = new Important_Locations_FRA();
        fm.beginTransaction().replace(R.id.FRAMAIN, location).addToBackStack(null).commit();
    }

    public void openphones(View view){
        FragmentManager fm = getSupportFragmentManager();
        Phones_FRA phone = new Phones_FRA();
        fm.beginTransaction().replace(R.id.FRAMAIN, phone).addToBackStack(null).commit();
    }

    public void openperigrafh(View view){
        String url = "https://el.wikipedia.org/wiki/%CE%93%CE%B1%CE%BB%CE%BB%CE%AF%CE%B1";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }
}
