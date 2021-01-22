package com.amar.covid19telangana.Services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.amar.covid19telangana.HealthWorkerAssigning.HealthWorkerPojo;
import com.amar.covid19telangana.Unorganizedworker.UnorganizedPojo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import static com.amar.covid19telangana.Util.Constants.HEALTHDOB;
import static com.amar.covid19telangana.Util.Constants.HEALTHEMAIL;
import static com.amar.covid19telangana.Util.Constants.HEALTHNATIONALITY;
import static com.amar.covid19telangana.Util.Constants.HEALTHRESUME;
import static com.amar.covid19telangana.Util.Constants.HEALTHTYPE;
import static com.amar.covid19telangana.Util.Constants.KEY_ADDRESS;
import static com.amar.covid19telangana.Util.Constants.KEY_GENDER;
import static com.amar.covid19telangana.Util.Constants.KEY_NAME;
import static com.amar.covid19telangana.Util.Constants.KEY_PHONE_NO;
import static com.amar.covid19telangana.Util.Constants.LIVING;
import static com.amar.covid19telangana.Util.Constants.MYPREF;
import static com.amar.covid19telangana.Util.Constants.PAID;
import static com.amar.covid19telangana.Util.Constants.RETIRED;
import static com.amar.covid19telangana.Util.Constants.SPECIALITY;
import static com.amar.covid19telangana.Util.Constants.SUBSPECIALITY;

public class HealthWorkerService extends Service {

    SharedPreferences sharedPreferences;
    public HealthWorkerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        sharedPreferences = getSharedPreferences(MYPREF, Context.MODE_PRIVATE);
        String name = sharedPreferences.getString(KEY_NAME,"name");
        String phoneno = sharedPreferences.getString(KEY_PHONE_NO,"phone no");
        String gender = sharedPreferences.getString(KEY_GENDER,"gender");
        String address = sharedPreferences.getString(KEY_ADDRESS,"address");

        Bundle bundle = intent.getExtras();
        String healthtype = bundle.getString(HEALTHTYPE);
        String speciality = bundle.getString(SPECIALITY);
        String subspeciality = bundle.getString(SUBSPECIALITY);
        String healthemail = bundle.getString(HEALTHEMAIL);
        String healthresume = bundle.getString(HEALTHRESUME);
        String healthdob = bundle.getString(HEALTHDOB);
        String healthnationallity = bundle.getString(HEALTHNATIONALITY);
        String paid = bundle.getString(PAID);
        String living = bundle.getString(LIVING);
        String retired = bundle.getString(RETIRED);



        CollectionReference db = FirebaseFirestore.getInstance().collection("healthworker");

        HealthWorkerPojo healthWorkerPojo = new HealthWorkerPojo(name,phoneno,gender,address,healthtype,speciality,subspeciality,healthemail,healthresume,healthdob,healthnationallity,paid,living,retired);

        db.add(healthWorkerPojo).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(),
                            "Successfully uploaded ", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(),
                            "Something went wrong: " + task.getException().toString(),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


        return super.onStartCommand(intent, flags, startId);
    }
}
