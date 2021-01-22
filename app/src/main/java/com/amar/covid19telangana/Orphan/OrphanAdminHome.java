package com.amar.covid19telangana.Orphan;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.CollectionFood.CollectionFoodPojo;
import com.amar.covid19telangana.CollectionFood.CollectionofFoodAdapter;
import com.amar.covid19telangana.R;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class OrphanAdminHome extends AppCompatActivity {

    RecyclerView orphanrecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orphan_admin_home);

        orphanrecycler = (RecyclerView) findViewById(R.id.orphanrecycler);



        loadData();


    }

    private void loadData() {
        final ArrayList<OrphanPojo> orphanlist  = new ArrayList<>();

        CollectionReference db = FirebaseFirestore.getInstance().collection("orphan");
        db.addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots,
                                @Nullable FirebaseFirestoreException e) {
                if (queryDocumentSnapshots != null) {
                    orphanlist.clear();
                    for (DocumentSnapshot snapshot : queryDocumentSnapshots.getDocuments()) {
                        OrphanPojo dbvalueData = snapshot.toObject(OrphanPojo.class);

                        orphanlist.add(dbvalueData);


                    }
                    orphanrecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    orphanrecycler.setAdapter(new OrphanAdapter(orphanlist));

                }


            }
        });


    }
}