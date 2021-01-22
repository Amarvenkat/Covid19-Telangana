package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.Adapters.SeniorAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Senior extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior);

        final ArrayList<String> seniorcity = new ArrayList<String>();
        final ArrayList<String> seniorcontact = new ArrayList<String>();
        final ArrayList<String> seniordescription = new ArrayList<String>();
        final ArrayList<String> seniornameoforganization = new ArrayList<String>();
        final ArrayList<String> seniorphone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.seniorcitizen_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiResources apiService =
                ApiClient.getClient().create(ApiResources.class);


        Call<Covid19Resources> call = apiService.getResourse();

        call.enqueue(new Callback<Covid19Resources>() {
            @Override
            public void onResponse(Response<Covid19Resources> response) {
                int statusCode = response.code();
                List<Resource> resources = response.body().getResources();
                for (int i=0;i<resources.size();i++) {

                    String checkcata = "Senior Citizen Support";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        seniorcity.add(resources.get(i).getCity());
                        seniorcontact.add(resources.get(i).getContact());
                        seniordescription.add(resources.get(i).getDescription());
                        seniornameoforganization.add(resources.get(i).getName_of_organization());
                        seniorphone.add(resources.get(i).getPhonenumber());
                    }

                    recyclerView.setAdapter(new SeniorAdapter(seniorcity,seniorcontact,seniordescription,seniornameoforganization,seniorphone, R.layout.details, getApplicationContext()));
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
