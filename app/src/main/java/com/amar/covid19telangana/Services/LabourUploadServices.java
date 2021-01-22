package com.amar.covid19telangana.Services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.amar.covid19telangana.MigrantLabour.LabourPojo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import static com.amar.covid19telangana.Util.Constants.KEY_ADDRESS;
import static com.amar.covid19telangana.Util.Constants.KEY_GENDER;
import static com.amar.covid19telangana.Util.Constants.KEY_HTADDRESS;
import static com.amar.covid19telangana.Util.Constants.KEY_HTCONTACTNO;
import static com.amar.covid19telangana.Util.Constants.KEY_HTDISTRICT;
import static com.amar.covid19telangana.Util.Constants.KEY_HTNAME;
import static com.amar.covid19telangana.Util.Constants.KEY_HTSTATE;
import static com.amar.covid19telangana.Util.Constants.KEY_JOBSTATUS;
import static com.amar.covid19telangana.Util.Constants.KEY_LATITUDE;
import static com.amar.covid19telangana.Util.Constants.KEY_LONGITUDE;
import static com.amar.covid19telangana.Util.Constants.KEY_MARITALSTATUS;
import static com.amar.covid19telangana.Util.Constants.KEY_MTCOMPANYADDRESS;
import static com.amar.covid19telangana.Util.Constants.KEY_MTCOMPANYNAME;
import static com.amar.covid19telangana.Util.Constants.KEY_MTCOMPANYOWNERNAME;
import static com.amar.covid19telangana.Util.Constants.KEY_MTDISTRICT;
import static com.amar.covid19telangana.Util.Constants.KEY_MTSTATE;
import static com.amar.covid19telangana.Util.Constants.KEY_NAME;
import static com.amar.covid19telangana.Util.Constants.KEY_NOOFADULT;
import static com.amar.covid19telangana.Util.Constants.KEY_NOOFCHILD;
import static com.amar.covid19telangana.Util.Constants.KEY_NOOFDEPENDANT;
import static com.amar.covid19telangana.Util.Constants.KEY_NOOFFEMALE;
import static com.amar.covid19telangana.Util.Constants.KEY_NOOFMALE;
import static com.amar.covid19telangana.Util.Constants.KEY_PHONE_NO;
import static com.amar.covid19telangana.Util.Constants.MYPREF;

public class LabourUploadServices extends Service {

    SharedPreferences sharedPreferences;

    public LabourUploadServices() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {



        sharedPreferences = getSharedPreferences(MYPREF, Context.MODE_PRIVATE);
        String name = sharedPreferences.getString(KEY_NAME,"");
        String phoneno = sharedPreferences.getString(KEY_PHONE_NO,"");
        String gender = sharedPreferences.getString(KEY_GENDER,"");
        String address = sharedPreferences.getString(KEY_ADDRESS,"");
        String latitude = sharedPreferences.getString(KEY_LATITUDE,"");
        String longitude = sharedPreferences.getString(KEY_LONGITUDE,"");

        String htname = sharedPreferences.getString(KEY_HTNAME,"");
        String htaddress = sharedPreferences.getString(KEY_HTADDRESS,"");
        String htdistrict = sharedPreferences.getString(KEY_HTDISTRICT,"");
        String htstate = sharedPreferences.getString(KEY_HTSTATE,"");
        String htcontactno = sharedPreferences.getString(KEY_HTCONTACTNO,"");
        String mtcompanyname = sharedPreferences.getString(KEY_MTCOMPANYNAME,"");
        String noofadult = sharedPreferences.getString(KEY_NOOFADULT,"");
        String noofchild = sharedPreferences.getString(KEY_NOOFCHILD,"");
        String noofmale = sharedPreferences.getString(KEY_NOOFMALE,"");
        String nooffemale = sharedPreferences.getString(KEY_NOOFFEMALE,"");
        String mtcompanyownername = sharedPreferences.getString(KEY_MTCOMPANYOWNERNAME,"");
        String mtcompanyaddress = sharedPreferences.getString(KEY_MTCOMPANYADDRESS,"");
        String mtdistrict = sharedPreferences.getString(KEY_MTDISTRICT,"");
        String mtstate = sharedPreferences.getString(KEY_MTSTATE,"");
        String jobstatus = sharedPreferences.getString(KEY_JOBSTATUS,"");
        String maritalstatus = sharedPreferences.getString(KEY_MARITALSTATUS,"");
        String noofdependant = sharedPreferences.getString(KEY_NOOFDEPENDANT,"");

        CollectionReference db = FirebaseFirestore.getInstance().collection("labour");

        LabourPojo labourpojo = new LabourPojo(name,gender,phoneno,address,latitude,longitude,htname,htaddress,htdistrict,htstate,htcontactno,mtcompanyname,noofadult,noofchild,noofmale,nooffemale,mtcompanyownername,mtcompanyaddress,mtdistrict,mtstate,noofdependant,jobstatus,maritalstatus);

        db.add(labourpojo).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
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
    }
}
