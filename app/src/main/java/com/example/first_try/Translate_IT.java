package com.example.first_try;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Translate_IT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate_it);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_IT);
        CategoryAdapter_IT adapter = new CategoryAdapter_IT(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_IT);
        tabLayout.setupWithViewPager(viewPager);
    }
}
