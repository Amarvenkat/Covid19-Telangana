package com.amar.covid19telangana.Services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.amar.covid19telangana.Selfassesment.RiskPerson;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import static com.amar.covid19telangana.Util.Constants.KEY_ADDRESS;
import static com.amar.covid19telangana.Util.Constants.KEY_GENDER;
import static com.amar.covid19telangana.Util.Constants.KEY_LATITUDE;
import static com.amar.covid19telangana.Util.Constants.KEY_LONGITUDE;
import static com.amar.covid19telangana.Util.Constants.KEY_NAME;
import static com.amar.covid19telangana.Util.Constants.KEY_PHONE_NO;
import static com.amar.covid19telangana.Util.Constants.MYPREF;

public class DataUploadService extends Service {


    SharedPreferences sharedPreferences;

    public DataUploadService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        sharedPreferences = getSharedPreferences(MYPREF, Context.MODE_PRIVATE);
        String riskname = sharedPreferences.getString(KEY_NAME,"");
        String riskphoneno = sharedPreferences.getString(KEY_PHONE_NO,"");
        String riskgender = sharedPreferences.getString(KEY_GENDER,"");
        String riskaddress = sharedPreferences.getString(KEY_ADDRESS,"");
        String latitude = sharedPreferences.getString(KEY_LATITUDE,"");
        String longitude = sharedPreferences.getString(KEY_LONGITUDE,"");

        CollectionReference db = FirebaseFirestore.getInstance().collection("user");

        //DatabaseReference myRef = database.getReference("user");

        RiskPerson person = new RiskPerson(riskname,riskgender,riskphoneno,riskaddress,latitude,longitude);

        //myRef.setValue(person);
        db.add(person).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
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

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"service destroied",Toast.LENGTH_SHORT).show();
    }
}
