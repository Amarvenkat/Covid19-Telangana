package com.amar.covid19telangana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amar.covid19telangana.Alarm.AlarmSystem;

public class HomeTreatment extends AppCompatActivity {

    CardView alarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_treatment);

        alarm = (CardView) findViewById(R.id.alarm);

        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeTreatment.this, AlarmSystem.class);
                startActivity(intent);


            }
        });


    }
}