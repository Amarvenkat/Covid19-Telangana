package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19telangana.Adapters.FundraisersAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fundraisers extends AppCompatActivity {

    ProgressBar progressBar;
    ArrayList<String> fundcity;
    ArrayList<String> fundcontact;
    ArrayList<String> funddescription;
    ArrayList<String> fundnameoforganization;
    ArrayList<String> fundphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundraisers);

        fundcity = new ArrayList<String>();
        fundcontact = new ArrayList<String>();
        funddescription = new ArrayList<String>();
        fundnameoforganization = new ArrayList<String>();
        fundphone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.fund_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        progressBar = (ProgressBar) findViewById(R.id.progressbarfund);
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

                for (int i=0;i<resources.size();i++){

                    String checkcata = "Fundraisers";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate) ){
                        fundcity.add(resources.get(i).getCity());
                        fundcontact.add(resources.get(i).getContact());
                        funddescription.add(resources.get(i).getDescription());
                        fundnameoforganization.add(resources.get(i).getName_of_organization());
                        fundphone.add(resources.get(i).getPhonenumber());
                    }

                }
                recyclerView.setAdapter(new FundraisersAdapter(fundcity,fundcontact,funddescription,fundnameoforganization,fundphone, R.layout.details, getApplicationContext()));
                progressBar.setVisibility(View.INVISIBLE);

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });


    }
}
