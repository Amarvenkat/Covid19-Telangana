package com.amar.covid19telangana.CollectionFood;

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

public class CollectionofFoodAdmin extends AppCompatActivity {

    RecyclerView collectionofFoodrecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collectionof_food_admin);

        collectionofFoodrecycler = (RecyclerView) findViewById(R.id.collectionfoodrecycler);


        loadData();


    }

    private void loadData() {
        final ArrayList<CollectionFoodPojo> collectionFoodlist  = new ArrayList<>();

        CollectionReference db = FirebaseFirestore.getInstance().collection("collectionfood");
        db.addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots,
                                @Nullable FirebaseFirestoreException e) {
                if (queryDocumentSnapshots != null) {
                    collectionFoodlist.clear();
                    for (DocumentSnapshot snapshot : queryDocumentSnapshots.getDocuments()) {
                        CollectionFoodPojo dbvalueData = snapshot.toObject(CollectionFoodPojo.class);

                        collectionFoodlist.add(dbvalueData);


                    }
                    collectionofFoodrecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    collectionofFoodrecycler.setAdapter(new CollectionofFoodAdapter(collectionFoodlist));

                }


            }
        });


    }
}