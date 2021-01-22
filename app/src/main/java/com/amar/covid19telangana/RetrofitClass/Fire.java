package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19telangana.Adapters.FireAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fire extends AppCompatActivity {

    ProgressBar progressBar;
    ArrayList<String> firecity;
    ArrayList<String> firecontact;
    ArrayList<String> firedescription;
    ArrayList<String> firenameoforganization;
    ArrayList<String> firephone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);


        firecity = new ArrayList<String>();
        firecontact = new ArrayList<String>();
        firedescription = new ArrayList<String>();
        firenameoforganization = new ArrayList<String>();
        firephone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.fire_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        progressBar = (ProgressBar) findViewById(R.id.progressbarfire);
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

                    String checkcata = "Fire Brigade";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        firecity.add(resources.get(i).getCity());
                        firecontact.add(resources.get(i).getContact());
                        firedescription.add(resources.get(i).getDescription());
                        firenameoforganization.add(resources.get(i).getName_of_organization());
                        firephone.add(resources.get(i).getPhonenumber());
                    }

                }
                recyclerView.setAdapter(new FireAdapter(firecity,firecontact,firedescription,firenameoforganization,firephone, R.layout.details, getApplicationContext()));
                progressBar.setVisibility(View.INVISIBLE);

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
