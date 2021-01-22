package com.amar.covid19telangana.Products;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.R;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class OurProduct extends AppCompatActivity {

    RecyclerView ourproductrecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_product);

        ourproductrecycler = (RecyclerView) findViewById(R.id.ourproductrecycler);

        loadImagesDynamically();


    }

    private void loadImagesDynamically() {
        final ArrayList<ProductsPojo> images = new ArrayList<>();
        CollectionReference db = FirebaseFirestore.getInstance().collection("product");
        db.addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots,
                                @Nullable FirebaseFirestoreException e) {
                if(queryDocumentSnapshots != null) {
                    images.clear();
                    for(DocumentSnapshot snapshot : queryDocumentSnapshots.getDocuments()) {
                        ProductsPojo imageData = snapshot.toObject(ProductsPojo.class);
                        images.add(imageData);
                    }

                    ourproductrecycler.setLayoutManager(new GridLayoutManager(OurProduct.this,2,LinearLayoutManager.VERTICAL,false));

                    ourproductrecycler.setAdapter(new OurProductAdapter(getApplicationContext(),images));
                }

            }
        });
    }
}
