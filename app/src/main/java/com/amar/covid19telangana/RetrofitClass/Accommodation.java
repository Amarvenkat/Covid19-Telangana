package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19telangana.Adapters.AccommodationAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Accommodation extends AppCompatActivity {

    ProgressBar progressBar;
    ArrayList<String> accomcity;
    ArrayList<String> accomcontact;
    ArrayList<String> accomdescription;
    ArrayList<String> accomnameoforganization;
    ArrayList<String> accomphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accommodation);

        accomcity = new ArrayList<String>();
        accomcontact = new ArrayList<String>();
        accomdescription = new ArrayList<String>();
        accomnameoforganization = new ArrayList<String>();
        accomphone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.accom_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        progressBar = (ProgressBar) findViewById(R.id.progressbaracc);
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

                    String checkcata = "Accommodation and Shelter Homes";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        accomcity.add(resources.get(i).getCity());
                        accomcontact.add(resources.get(i).getContact());
                        accomdescription.add(resources.get(i).getDescription());
                        accomnameoforganization.add(resources.get(i).getName_of_organization());
                        accomphone.add(resources.get(i).getPhonenumber());
                    }

                }
                recyclerView.setAdapter(new AccommodationAdapter(accomcity,accomcontact,accomdescription,accomnameoforganization,accomphone, R.layout.details, getApplicationContext()));
                progressBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
