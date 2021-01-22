package com.amar.covid19telangana.Alarm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;

import com.amar.covid19telangana.R;

import java.util.Calendar;

public class Medicine1 extends AppCompatActivity {
    AlarmManager alarmManager;
    private PendingIntent pendingIntent;
    private TimePicker alarmTimePicker;
    private static Medicine1 inst;
    private TextView alarmTextView;
    Button off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine1);


        alarmTimePicker = (TimePicker) findViewById(R.id.alarmTimePickermedi1);
        alarmTextView = (TextView) findViewById(R.id.alarmTextmedi1);
        ToggleButton alarmToggle = (ToggleButton) findViewById(R.id.alarmTogglebreakmedi1);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        off = (Button) findViewById(R.id.buttonoffmedi1);

    }

    public static Medicine1 instance() {
        return inst;
    }

    public void onStart() {
        super.onStart();
        inst = this;
    }

    public void onToggleClicked(View view) {
        if (((ToggleButton) view).isChecked()) {
            Log.d("MyActivity", "Alarm On");
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, alarmTimePicker.getCurrentHour());
            calendar.set(Calendar.MINUTE, alarmTimePicker.getCurrentMinute());
            calendar.set(Calendar.SECOND,0);
            Intent myIntent = new Intent(Medicine1.this, Medicine1.class);
            pendingIntent = PendingIntent.getBroadcast(Medicine1.this, 0, myIntent, 0);
            alarmManager.set(AlarmManager.RTC, calendar.getTimeInMillis(), pendingIntent);
        } else {
            alarmManager.cancel(pendingIntent);
            setAlarmText("");
            Log.d("MyActivity", "Alarm Off");
        }
    }


    public void setAlarmText(String alarmText) {
        alarmTextView.setText(alarmText);
    }
}