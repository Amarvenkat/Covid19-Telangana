package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19telangana.Adapters.TransportationAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Transportation extends AppCompatActivity {

    ProgressBar progressBar;
    ArrayList<String> transcity;
    ArrayList<String> transcontact;
    ArrayList<String> transdescription;
    ArrayList<String> transnameoforganization;
    ArrayList<String> transphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation);

        transcity = new ArrayList<String>();
        transcontact = new ArrayList<String>();
        transdescription = new ArrayList<String>();
        transnameoforganization = new ArrayList<String>();
        transphone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.transportation_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        progressBar = (ProgressBar) findViewById(R.id.progressbartrans);
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

                    String checkcata = "Transportation";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        transcity.add(resources.get(i).getCity());
                        transcontact.add(resources.get(i).getContact());
                        transdescription.add(resources.get(i).getDescription());
                        transnameoforganization.add(resources.get(i).getName_of_organization());
                        transphone.add(resources.get(i).getPhonenumber());
                    }

                }
                recyclerView.setAdapter(new TransportationAdapter(transcity,transcontact,transdescription,transnameoforganization,transphone, R.layout.details, getApplicationContext()));
                progressBar.setVisibility(View.INVISIBLE);

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
