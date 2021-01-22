package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19telangana.Adapters.HospitalAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Hospital extends AppCompatActivity {
    ProgressBar progressBar;
    ArrayList<String> hospcity;
    ArrayList<String> hospcontact;
    ArrayList<String> hospdescription;
    ArrayList<String> hospnameoforganization;
    ArrayList<String> hospphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        hospcity = new ArrayList<String>();
        hospcontact = new ArrayList<String>();
        hospdescription = new ArrayList<String>();
        hospnameoforganization = new ArrayList<String>();
        hospphone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.hosp_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        progressBar = (ProgressBar) findViewById(R.id.progressbarhos);


        progressBar.setVisibility(View.INVISIBLE);

        ApiResources apiService =
                ApiClient.getClient().create(ApiResources.class);

        progressBar.setVisibility(View.VISIBLE);
        Call<Covid19Resources> call = apiService.getResourse();

        call.enqueue(new Callback<Covid19Resources>() {
            @Override
            public void onResponse(Response<Covid19Resources> response) {
                int statusCode = response.code();
                List<Resource> resources = response.body().getResources();
                for (int i=0;i<resources.size();i++) {

                    String checkcata = "Hospitals and Centers";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        hospcity.add(resources.get(i).getCity());
                        hospcontact.add(resources.get(i).getContact());
                        hospdescription.add(resources.get(i).getDescription());
                        hospnameoforganization.add(resources.get(i).getName_of_organization());
                        hospphone.add(resources.get(i).getPhonenumber());
                    }


                }
                recyclerView.setAdapter(new HospitalAdapter(hospcity,hospcontact,hospdescription,hospnameoforganization,hospphone, R.layout.details, getApplicationContext()));
                progressBar.setVisibility(View.INVISIBLE);

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }}
