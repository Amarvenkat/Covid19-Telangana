package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19telangana.Adapters.FreeFoodAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FreeFood extends AppCompatActivity {
    ProgressBar progressBar;
    ArrayList<String> foodcity;
    ArrayList<String> foodcontact;
    ArrayList<String> fooddescription;
    ArrayList<String> foodnameoforganization;
    ArrayList<String> foodphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_food);


        foodcity = new ArrayList<String>();
        foodcontact = new ArrayList<String>();
        fooddescription = new ArrayList<String>();
        foodnameoforganization = new ArrayList<String>();
        foodphone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.freefood_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        progressBar = (ProgressBar) findViewById(R.id.progressbarfood);


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

                    String checkcata = "Free Food";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        foodcity.add(resources.get(i).getCity());
                        foodcontact.add(resources.get(i).getContact());
                        fooddescription.add(resources.get(i).getDescription());
                        foodnameoforganization.add(resources.get(i).getName_of_organization());
                        foodphone.add(resources.get(i).getPhonenumber());
                    }

                    recyclerView.setAdapter(new FreeFoodAdapter(foodcity,foodcontact,fooddescription,foodnameoforganization,foodphone, R.layout.details, getApplicationContext()));
                    progressBar.setVisibility(View.INVISIBLE);

                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
