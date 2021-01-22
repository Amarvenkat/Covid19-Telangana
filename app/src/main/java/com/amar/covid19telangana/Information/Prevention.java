package com.amar.covid19telangana.Information;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.amar.covid19telangana.R;
import com.squareup.picasso.Picasso;

public class Prevention extends AppCompatActivity {
ImageView preventionimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

        preventionimg = (ImageView) findViewById(R.id.preventionimg);



        Picasso.with(this).load(R.drawable.preventionreal).fit().into(preventionimg);

    }
}
