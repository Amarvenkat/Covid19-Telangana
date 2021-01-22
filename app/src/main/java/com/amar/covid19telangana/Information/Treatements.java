package com.amar.covid19telangana.Information;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.amar.covid19telangana.R;
import com.squareup.picasso.Picasso;

public class Treatements extends AppCompatActivity {

    ImageView treatementimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatements);

        treatementimg = (ImageView) findViewById(R.id.treatementimg);
        Picasso.with(this).load(R.drawable.treatementreal).fit().into(treatementimg);

    }
}
