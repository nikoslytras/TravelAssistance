package com.example.first_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View.OnClickListener open_eng = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startEng = new Intent(MainActivity.this , ENG_MAIN.class);
                startActivity(startEng);
            }
        };
        ImageView engflag = (ImageView) (findViewById(R.id.englang));
        engflag.setOnClickListener(open_eng);

        View.OnClickListener open_it = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startEng = new Intent(MainActivity.this , IT_MAIN.class);
                startActivity(startEng);
            }
        };
        ImageView ITflag = (ImageView) (findViewById(R.id.italy));
        ITflag.setOnClickListener(open_it);

        View.OnClickListener open_fra = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startFra = new Intent(MainActivity.this , FRA_MAIN.class);
                startActivity(startFra);
            }
        };
        ImageView FRAflag = (ImageView) (findViewById(R.id.france));
        FRAflag.setOnClickListener(open_fra);

    }


}
