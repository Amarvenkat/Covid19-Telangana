package com.amar.covid19telangana.HealthWorkerAssigning;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.Unorganizedworker.UnorganizedAdapter;
import com.amar.covid19telangana.Unorganizedworker.UnorganizedPojo;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class HealthWorkerAdminHome extends AppCompatActivity {

    RecyclerView healthworkerrecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_worker_admin_home);

        healthworkerrecycler = (RecyclerView) findViewById(R.id.healthworkerrecycler);


        loadData();
    }

    private void loadData() {
        final ArrayList<HealthWorkerPojo> healthworkerlist  = new ArrayList<>();

        CollectionReference db = FirebaseFirestore.getInstance().collection("healthworker");
        db.addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots,
                                @Nullable FirebaseFirestoreException e) {
                if (queryDocumentSnapshots != null) {
                    healthworkerlist.clear();
                    for (DocumentSnapshot snapshot : queryDocumentSnapshots.getDocuments()) {
                        HealthWorkerPojo dbvalueData = snapshot.toObject(HealthWorkerPojo.class);

                        healthworkerlist.add(dbvalueData);


                    }
                    healthworkerrecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    healthworkerrecycler.setAdapter(new HealthWorkerAdapter(healthworkerlist));

                }


            }
        });


    }
}