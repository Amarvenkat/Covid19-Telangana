package com.amar.covid19telangana.Alarm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;

import com.amar.covid19telangana.R;

import java.util.Calendar;

public class Dinner extends AppCompatActivity {
    AlarmManager alarmManager;
    private PendingIntent pendingIntent;
    private TimePicker alarmTimePicker;
    private static Dinner inst;
    private TextView alarmTextView;
    Button off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        alarmTimePicker = (TimePicker) findViewById(R.id.alarmTimePickerDinner);
        alarmTextView = (TextView) findViewById(R.id.alarmTextDinner);
        ToggleButton alarmToggle = (ToggleButton) findViewById(R.id.alarmToggleDinner);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        off = (Button) findViewById(R.id.buttonoffDinner);

        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
                if (alarmUri == null) {

                    alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                }
                final Ringtone ringtone = RingtoneManager.getRingtone(Dinner.this, alarmUri);
                ringtone.stop();
            }
        });
    }

    public static Dinner instance() {
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
            Intent myIntent = new Intent(Dinner.this, DinnerReceiver.class);
            pendingIntent = PendingIntent.getBroadcast(Dinner.this, 0, myIntent, 0);
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