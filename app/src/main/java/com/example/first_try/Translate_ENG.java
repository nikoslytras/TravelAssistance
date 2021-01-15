package com.example.first_try;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Translate_ENG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate_eng);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_ENG);


        CategoryAdapter_ENG adapter = new CategoryAdapter_ENG(this, getSupportFragmentManager());


        viewPager.setAdapter(adapter);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_ENG);

        tabLayout.setupWithViewPager(viewPager);
    }
}
