package com.example.first_try;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;


import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Coint extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coint);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView sinalagma = (TextView) findViewById(R.id.textView);
        sinalagma.setText("1 Λίρα = 1.11 Ευρώ");
    }


    public void metatropiNomismatos(View view){
        EditText textSeLires = (EditText) findViewById(R.id.editTextNumberDecimal);
        TextView apotelesma = (TextView) findViewById(R.id.textView2);
        String poso = textSeLires.getText().toString();

        if (poso.matches("")) {
            Toast.makeText(this, "Δέν έδωσες ποσό για μετατροπή", Toast.LENGTH_LONG).show();

        }
        else {
            double PosoSeDouble = Double.parseDouble(poso);
            double PosoMetaTonPollaplasiasmo = PosoSeDouble * 0.89;
            String posoToString = String.valueOf(PosoMetaTonPollaplasiasmo);
            apotelesma.setText("Οι " + PosoSeDouble + " ευρώ είναι " + posoToString + " λίρες");
        }
    }



    public void katharismos(View view){
        EditText textSeLires = (EditText) findViewById(R.id.editTextNumberDecimal);
        TextView apotelesma = (TextView) findViewById(R.id.textView2);
        textSeLires.setText(null);
        apotelesma.setText(null);
    }
}