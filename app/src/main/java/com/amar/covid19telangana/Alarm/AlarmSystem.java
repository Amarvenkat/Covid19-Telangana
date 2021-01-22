package com.amar.covid19telangana.Alarm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amar.covid19telangana.R;

public class AlarmSystem extends AppCompatActivity {

    CardView wakeup,breakfast,medicine1,lunch,medicine2,exercise,dinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_system);

        wakeup = (CardView) findViewById(R.id.wakeup);
        breakfast = (CardView) findViewById(R.id.breakfast);
        medicine1 = (CardView) findViewById(R.id.medicine1);
        lunch = (CardView) findViewById(R.id.lunch);
        medicine2 = (CardView) findViewById(R.id.medicine2);
        exercise = (CardView) findViewById(R.id.exercise);
        dinner = (CardView) findViewById(R.id.dinner);


        wakeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AlarmSystem.this,Wakeup.class);
                startActivity(intent);

            }
        });

        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AlarmSystem.this,Breakfast.class);
                startActivity(intent);

            }
        });

        medicine1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AlarmSystem.this,Medicine1.class);
                startActivity(intent);

            }
        });
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AlarmSystem.this,Lunch.class);
                startActivity(intent);

            }
        });

        medicine2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AlarmSystem.this,Medicine2.class);
                startActivity(intent);

            }
        });

        exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AlarmSystem.this,Exercise.class);
                startActivity(intent);

            }
        });

        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AlarmSystem.this,Dinner.class);
                startActivity(intent);

            }
        });
    }
}