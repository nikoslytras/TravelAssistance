package com.example.first_try;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;



public class ENG_MAIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    public void opentranslates(View view){
        Intent openTheEngTranslations = new Intent(ENG_MAIN.this, Translate_ENG.class);
        startActivity(openTheEngTranslations);

    }

    public void openlocations(View view){
        FragmentManager fm = getSupportFragmentManager();
        Locations_ENG location = new Locations_ENG();
        fm.beginTransaction().replace(R.id.ENGMAIN, location).addToBackStack(null).commit();
    }

    public void openimportantlocations(View view){
        FragmentManager fm = getSupportFragmentManager();
        Important_Locations_ENG location = new Important_Locations_ENG();
        fm.beginTransaction().replace(R.id.ENGMAIN, location).addToBackStack(null).commit();
    }

    public void openphones(View view){
        FragmentManager fm = getSupportFragmentManager();
        Phones_ENG phone = new Phones_ENG();
        fm.beginTransaction().replace(R.id.ENGMAIN, phone).addToBackStack(null).commit();
    }

    public void opencoint(View view){
        Intent openTheCoint = new Intent(ENG_MAIN.this, Coint.class);
        startActivity(openTheCoint);

    }

    public void openperigrafh(View view){
        String url = "https://el.wikipedia.org/wiki/%CE%91%CE%B3%CE%B3%CE%BB%CE%AF%CE%B1";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }
}
