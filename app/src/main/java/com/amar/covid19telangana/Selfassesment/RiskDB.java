package com.amar.covid19telangana.Selfassesment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.amar.covid19telangana.Adapters.FirebaseAdapter;
import com.amar.covid19telangana.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class RiskDB extends AppCompatActivity {


    private List<RiskPerson> listData;
    RecyclerView recyclerView;
    DatabaseReference nm;
    private FirebaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risk_d_b);

        //  t1 = (TextView) findViewById(R.id.text1);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerdb);


        loadData();


    }

    private void loadData() {
        final ArrayList<RiskPerson> dbvalue = new ArrayList<>();
        final ArrayList<String> lat = new ArrayList<>();
        final ArrayList<String> lon = new ArrayList<>();

        CollectionReference db = FirebaseFirestore.getInstance().collection("user");
        db.addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots,
                                @Nullable FirebaseFirestoreException e) {
                if (queryDocumentSnapshots != null) {
                    dbvalue.clear();
                    for (DocumentSnapshot snapshot : queryDocumentSnapshots.getDocuments()) {
                        RiskPerson dbvalueData = snapshot.toObject(RiskPerson.class);

                        dbvalue.add(dbvalueData);

                        //         latlon(dbvalueData.getLatitude(),dbvalueData.getLongitude(),dbvalue.size());

                    }
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    recyclerView.setAdapter(new FirebaseAdapter(dbvalue));
                    for (int i = 0; i < dbvalue.size(); i++) {
                        RiskPerson ld = dbvalue.get(i);


                        lat.add(ld.getLatitude());
                        lon.add(ld.getLongitude());

                        /*Log.d("Tag","lat"+ld.getLatitude());
                        Log.d("Tag","lat"+ld.getLongitude());*/
                    }
                    for (int i = 0; i < dbvalue.size(); i++) {
                        Log.d("Tag", "lat" + lat.get(i));
                        Log.d("Tag", "lat" + lon.get(i));
                    }
                }


            }
        });


    }
}