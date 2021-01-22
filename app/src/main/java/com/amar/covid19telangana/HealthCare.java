package com.amar.covid19telangana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.amar.covid19telangana.Adapters.InformationRecyclerAdapter;
import com.amar.covid19telangana.Information.Precation;
import com.amar.covid19telangana.Information.Prevention;
import com.amar.covid19telangana.Information.Symptoms;
import com.amar.covid19telangana.Information.Treatements;
import com.amar.covid19telangana.Products.ProductsHome;
import com.amar.covid19telangana.Selfassesment.SelfAssesment;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HealthCare extends AppCompatActivity {
    CardView  selfasses,carddoctor,products,counselling,hometretment;
    ImageView imgselfasses,imgdoctorcard;
    RecyclerView informationRecycler;
    ArrayList<Integer> infoimg         = new ArrayList<Integer>();
    ArrayList<Integer> infotitle       = new ArrayList<Integer>();
    ArrayList<Integer> infodescription = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_care);

        hometretment = (CardView) findViewById(R.id.hometreatment);
        selfasses = (CardView) findViewById(R.id.cardselfasses);
        carddoctor = (CardView) findViewById(R.id.carddoctor);
        counselling = (CardView) findViewById(R.id.counselling);
        imgselfasses = (ImageView) findViewById(R.id.imgselfasses);
        imgdoctorcard = (ImageView) findViewById(R.id.imgdoctorcard);
        informationRecycler = (RecyclerView) findViewById(R.id.information_recycler);
        products = (CardView) findViewById(R.id.product);

        infoimg.add(R.drawable.precaution);
        infoimg.add(R.drawable.symtoms);
        infoimg.add(R.drawable.prevention);
        infoimg.add(R.drawable.treatment);

        infotitle.add(R.string.precaution);
        infotitle.add(R.string.symptoms);
        infotitle.add(R.string.prevention);
        infotitle.add(R.string.treatement);

        infodescription.add(R.string.precaution_during_quarantine);
        infodescription.add(R.string.sign_identify_the_risk_of_infection);
        infodescription.add(R.string.help_you_avoid_the_risk_of_infection);
        infodescription.add(R.string.supportive_care_to_avoid_it);


        final ImageView img1 = new ImageView(this);
        Picasso.with(img1.getContext()).load(R.drawable.selfassesment).into(img1, new com.squareup.picasso.Callback() {
            @Override
            public void onSuccess() {
                imgselfasses.setBackgroundDrawable(img1.getDrawable());
            }

            @Override
            public void onError() {
            }
        });

        Picasso.with(this).load(R.drawable.doctorappoin).fit().into(imgdoctorcard);
        selfasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HealthCare.this, SelfAssesment.class);
                startActivity(intent);

            }
        });

        carddoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.practo.com/hyderabad/doctors"));
                startActivity(intent);


            }
        });
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(HealthCare.this, ProductsHome.class);
                startActivity(intent1);

            }
        });
        counselling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HealthCare.this,Counselling.class);
                startActivity(intent);

            }
        });

        hometretment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HealthCare.this,HomeTreatment.class);
                startActivity(intent);

            }
        });


        InformationRecyclerAdapter informationrecycleradapter = new InformationRecyclerAdapter(this,infoimg,infotitle,infodescription);

        informationRecycler.setAdapter(informationrecycleradapter);
        informationRecycler.setLayoutManager(new GridLayoutManager(this,2, LinearLayoutManager.VERTICAL,false));

    }

}
