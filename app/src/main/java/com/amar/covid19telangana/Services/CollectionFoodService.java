package com.amar.covid19telangana.Services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.amar.covid19telangana.CollectionFood.CollectionFoodPojo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import static com.amar.covid19telangana.Util.Constants.KEY_ADDRESS;
import static com.amar.covid19telangana.Util.Constants.KEY_GENDER;
import static com.amar.covid19telangana.Util.Constants.KEY_NAME;
import static com.amar.covid19telangana.Util.Constants.KEY_PHONE_NO;
import static com.amar.covid19telangana.Util.Constants.MYPREF;

public class CollectionFoodService extends Service {

    private static final String FOODAVAILABLE = "foodavailable" ;
    private static final String QUANTITY = "quantity";
    SharedPreferences sharedPreferences;
    public CollectionFoodService() {
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
        String foodavailable = bundle.getString(FOODAVAILABLE);
        String quantity = bundle.getString(QUANTITY);

        CollectionReference db = FirebaseFirestore.getInstance().collection("collectionfood");

        CollectionFoodPojo collectionFoodPojo = new CollectionFoodPojo (name,phoneno,gender,address,foodavailable,quantity);
        db.add(collectionFoodPojo).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
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
