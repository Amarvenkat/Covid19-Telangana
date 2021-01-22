package com.amar.covid19telangana.Information;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.amar.covid19telangana.R;
import com.squareup.picasso.Picasso;

public class Symptoms extends AppCompatActivity {

    ImageView symptomsimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);

        symptomsimg = (ImageView) findViewById(R.id.symptomsimg);
        Picasso.with(this).load(R.drawable.symtompsreal).fit().into(symptomsimg);
    }
}
