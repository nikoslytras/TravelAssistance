package com.example.first_try;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Translate_FRA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate_fra);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_FRA);
        CategoryAdapter_FRA adapter = new CategoryAdapter_FRA(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_FRA);
        tabLayout.setupWithViewPager(viewPager);
    }
}
