    package com.amar.covid19telangana.Services;

    import android.app.Service;
    import android.content.Context;
    import android.content.Intent;
    import android.content.SharedPreferences;
    import android.os.Bundle;
    import android.os.IBinder;
    import android.widget.Toast;

    import androidx.annotation.NonNull;

    import com.amar.covid19telangana.Orphan.OrphanPojo;
    import com.amar.covid19telangana.Unorganizedworker.UnorganizedPojo;
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
    import static com.amar.covid19telangana.Util.Constants.ORPHANHELP;
    import static com.amar.covid19telangana.Util.Constants.ORPHANLIVING;
    import static com.amar.covid19telangana.Util.Constants.ORPHANORPHANLIVING;
    import static com.amar.covid19telangana.Util.Constants.ORPHANSHELDING;

    public class OrphanService extends Service {
        SharedPreferences sharedPreferences;
        public OrphanService() {
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

            Bundle bundle =intent.getExtras();
            String help = bundle.getString(ORPHANHELP);
            String orphanliving = bundle.getString(ORPHANLIVING);
            String orphanorphanliving = bundle.getString(ORPHANORPHANLIVING);
            String orphanshelding = bundle.getString(ORPHANSHELDING);

            CollectionReference db = FirebaseFirestore.getInstance().collection("orphan");

            OrphanPojo orphanPojo = new OrphanPojo(name,phoneno,gender,address,help,orphanliving,orphanorphanliving,orphanshelding);

            db.add(orphanPojo).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
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
