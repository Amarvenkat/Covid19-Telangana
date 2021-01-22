package com.amar.covid19telangana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.amar.covid19telangana.Adapters.MainRecyclerAdapter;
import com.amar.covid19telangana.CollectionFood.CollectionFoodMain;
import com.amar.covid19telangana.HealthWorkerAssigning.HealthWorkerAssigning;
import com.amar.covid19telangana.MigrantLabour.LabourDetails;
import com.amar.covid19telangana.Orphan.OrphanHome;
import com.amar.covid19telangana.RetrofitClass.Accommodation;
import com.amar.covid19telangana.RetrofitClass.Ambulance;
import com.amar.covid19telangana.RetrofitClass.Fire;
import com.amar.covid19telangana.RetrofitClass.FreeFood;
import com.amar.covid19telangana.RetrofitClass.Fundraisers;
import com.amar.covid19telangana.RetrofitClass.GovHelpline;
import com.amar.covid19telangana.RetrofitClass.Hospital;
import com.amar.covid19telangana.RetrofitClass.Other;
import com.amar.covid19telangana.RetrofitClass.Police;
import com.amar.covid19telangana.RetrofitClass.Testinglab;
import com.amar.covid19telangana.RetrofitClass.Transportation;
import com.amar.covid19telangana.Unorganizedworker.UnorganizedMain;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DisasterManagement extends AppCompatActivity {

    RecyclerView recyclerView,titlerecycler;
    ArrayList<Integer> titlearray      = new ArrayList<Integer>();
    ArrayList<Integer> decriptionarray = new ArrayList<Integer>();
    ArrayList<Integer> iconarray       = new ArrayList<Integer>();
    ArrayList<Integer> title = new ArrayList<>();
    CardView travelcard,labour,helpline,unorganized,collectionfood,healthworker,orphan,medicalstore,volentire;
    ImageView img;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disaster_management);
        //recyclerView = (RecyclerView) findViewById(R.id.mainrecycler);

//        travelcard = (CardView) findViewById(R.id.travelpasscard);
//        labour = (CardView) findViewById(R.id.labourcard);
//        helpline = (CardView) findViewById(R.id.helpline);
//        unorganized = (CardView) findViewById(R.id.unorganizedworker);
//        collectionfood = (CardView) findViewById(R.id.collectionfood);
//        healthworker = (CardView) findViewById(R.id.healthworker);
//        orphan = (CardView) findViewById(R.id.orphan);
//        medicalstore = (CardView) findViewById(R.id.medicalstore);
//        volentire = (CardView) findViewById(R.id.volunteer);
         titlerecycler = (RecyclerView) findViewById(R.id.titlerecycler);
         lottieAnimationView = (LottieAnimationView) findViewById(R.id.disanimation);
     //   img = (ImageView) findViewById(R.id.laborimg);

        lottieAnimationView.setAnimation("diseaster.json");

        title.add(R.string.migrant_labour);
        title.add(R.string.e_pass_or_personal_pass);
        title.add(R.string.toll_free_number);
        title.add(R.string.support_to_unorganized_sector_worker);
        title.add(R.string.collection_of_food);
        title.add(R.string.health_and_essentian_worker_assigning);
        title.add(R.string.support_to_orphans_and_vulnerable_category);
        title.add(R.string.medical_store);
        title.add(R.string.volunteer_registration_and_assigning_work);

        title.add(R.string.covid_19_testing_lab);
        title.add(R.string.free_food);
        title.add(R.string.fundraisers);
        title.add(R.string.hospitals_and_centers);
        title.add(R.string.police);
        title.add(R.string.government_helpline);
        title.add(R.string.accommodation_and_shelter_homes);
        title.add(R.string.transportation);
        title.add(R.string.fire_brigade);
        title.add(R.string.ambulance);
        title.add(R.string.other);



//        decriptionarray.add(R.string.dec0);
//        decriptionarray.add(R.string.dec1);
//        decriptionarray.add(R.string.dec2);
//        decriptionarray.add(R.string.dec3);
//        decriptionarray.add(R.string.dec4);
//        decriptionarray.add(R.string.dec5);
//        decriptionarray.add(R.string.dec6);
//        decriptionarray.add(R.string.dec7);
//        decriptionarray.add(R.string.dec8);
//        decriptionarray.add(R.string.dec9);
//        decriptionarray.add(R.string.dec10);

        iconarray.add(R.drawable.migrantlabour);
        iconarray.add(R.drawable.epass);
        iconarray.add(R.drawable.phone);
        iconarray.add(R.drawable.unorganisedworker);
        iconarray.add(R.drawable.food);
        iconarray.add(R.drawable.workerassining);
        iconarray.add(R.drawable.supporttoorphen);
        iconarray.add(R.drawable.medicalstore);
        iconarray.add(R.drawable.volunteer);
        iconarray.add(R.drawable.lab);
        iconarray.add(R.drawable.freefood);

        iconarray.add(R.drawable.moneybag);
        iconarray.add(R.drawable.hosp);
        iconarray.add(R.drawable.police);
        iconarray.add(R.drawable.govehelpline);
        iconarray.add(R.drawable.home);
        iconarray.add(R.drawable.trans);
        iconarray.add(R.drawable.fire);
        iconarray.add(R.drawable.ambu);
        iconarray.add(R.drawable.other);
//        Picasso.with(this).load(R.drawable.labour).fit().into(img);
//        MainRecyclerAdapter mainrecycleradapter = new MainRecyclerAdapter(this,titlearray,decriptionarray,iconarray);
//
//        recyclerView.setAdapter(mainrecycleradapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        TileRecyclerAdapter tileRecyclerAdapter =new TileRecyclerAdapter(getApplicationContext(),title,iconarray);
        titlerecycler.setAdapter(tileRecyclerAdapter);
        titlerecycler.setLayoutManager(new GridLayoutManager(this,4,LinearLayoutManager.VERTICAL,false));

//        travelcard.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://policeportal.tspolice.gov.in/"));
//                startActivity(intent);
//
//            }
//        });
//
//        labour.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(DisasterManagement.this, LabourDetails.class);
//                Pair[] pairs = new Pair[1];
//                pairs[0] = new Pair<View,String>(img,"ani");
//                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(DisasterManagement.this,pairs);
//
//                startActivity(intent,options.toBundle());
//
//
//            }
//        });
//
//        helpline.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(DisasterManagement.this,Helpline.class);
//                startActivity(intent);
//
//            }
//        });
//
//        unorganized.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(DisasterManagement.this, UnorganizedMain.class);
//                startActivity(intent);
//
//            }
//        });
//        collectionfood.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent  = new Intent(DisasterManagement.this, CollectionFoodMain.class);
//                startActivity(intent);
//
//            }
//        });
//
//        healthworker.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent  = new Intent(DisasterManagement.this, HealthWorkerAssigning.class);
//                startActivity(intent);
//
//            }
//        });
//        orphan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent  = new Intent(DisasterManagement.this, OrphanHome.class);
//                startActivity(intent);
//
//            }
//        });
//
//        medicalstore.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.healthfrog.in/chemists/medical-store/"));
//                startActivity(intent);
//
//            }
//        });
//
//        volentire.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mygov.in/task/join-war-against-covid-19-register-volunteer/"));
//                startActivity(intent);
//
//            }
//        });

    }

}
