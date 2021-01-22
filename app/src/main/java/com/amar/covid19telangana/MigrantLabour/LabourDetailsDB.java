    package com.amar.covid19telangana.MigrantLabour;

    import androidx.annotation.Nullable;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.recyclerview.widget.LinearLayoutManager;
    import androidx.recyclerview.widget.RecyclerView;

    import android.os.Bundle;
    import android.util.Log;

    import com.amar.covid19telangana.Adapters.LabourFirebaseAdapter;
    import com.amar.covid19telangana.R;
    import com.google.firebase.firestore.CollectionReference;
    import com.google.firebase.firestore.DocumentSnapshot;
    import com.google.firebase.firestore.EventListener;
    import com.google.firebase.firestore.FirebaseFirestore;
    import com.google.firebase.firestore.FirebaseFirestoreException;
    import com.google.firebase.firestore.QuerySnapshot;

    import java.util.ArrayList;

    public class LabourDetailsDB extends AppCompatActivity {

        RecyclerView labour_details_recycler;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_labour_details_d_b);

            labour_details_recycler = (RecyclerView) findViewById(R.id.labour_details_recycler);

            loadData();
        }

        private void loadData() {
                final ArrayList<LabourPojo> labourlist  = new ArrayList<>();

                CollectionReference db = FirebaseFirestore.getInstance().collection("labour");
                db.addSnapshotListener(new EventListener<QuerySnapshot>() {
                    @Override
                    public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots,
                                        @Nullable FirebaseFirestoreException e) {
                        if (queryDocumentSnapshots != null) {
                            labourlist.clear();
                            for (DocumentSnapshot snapshot : queryDocumentSnapshots.getDocuments()) {
                                LabourPojo dbvalueData = snapshot.toObject(LabourPojo.class);

                                labourlist.add(dbvalueData);


                            }
                            labour_details_recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                            labour_details_recycler.setAdapter(new LabourFirebaseAdapter(labourlist));

                        }


                    }
                });


            }
        }