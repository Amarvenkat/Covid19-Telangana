package com.amar.covid19telangana.Unorganizedworker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.Adapters.LabourFirebaseAdapter;
import com.amar.covid19telangana.MigrantLabour.LabourPojo;
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

public class UnorganizedAdmin extends AppCompatActivity {

    RecyclerView unorganizeRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unorganized_admin);

        unorganizeRecycler = (RecyclerView) findViewById(R.id.unorganizedAdminrecycler);
        loadData();
    }

    private void loadData() {
        final ArrayList<UnorganizedPojo> unorganizedworkerlist  = new ArrayList<>();

        CollectionReference db = FirebaseFirestore.getInstance().collection("unorganizedworker");
        db.addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots,
                                @Nullable FirebaseFirestoreException e) {
                if (queryDocumentSnapshots != null) {
                    unorganizedworkerlist.clear();
                    for (DocumentSnapshot snapshot : queryDocumentSnapshots.getDocuments()) {
                        UnorganizedPojo dbvalueData = snapshot.toObject(UnorganizedPojo.class);

                        unorganizedworkerlist.add(dbvalueData);


                    }
                    unorganizeRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    unorganizeRecycler.setAdapter(new UnorganizedAdapter(unorganizedworkerlist));

                }


            }
        });


    }
}