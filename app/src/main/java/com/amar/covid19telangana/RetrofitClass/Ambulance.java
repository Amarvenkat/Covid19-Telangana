package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19telangana.Adapters.AmbulanceAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Ambulance extends AppCompatActivity {

    ProgressBar progressBar;
    ArrayList<String> ambucity;
    ArrayList<String> ambucontact;
    ArrayList<String> ambudescription;
    ArrayList<String> ambunameoforganization;
    ArrayList<String> ambuphone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);


        ambucity = new ArrayList<String>();
        ambucontact = new ArrayList<String>();
        ambudescription = new ArrayList<String>();
        ambunameoforganization = new ArrayList<String>();
        ambuphone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ambulance_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        progressBar = (ProgressBar) findViewById(R.id.progressbarambu);
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

                    String checkcata = "Ambulance";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        ambucity.add(resources.get(i).getCity());
                        ambucontact.add(resources.get(i).getContact());
                        ambudescription.add(resources.get(i).getDescription());
                        ambunameoforganization.add(resources.get(i).getName_of_organization());
                        ambuphone.add(resources.get(i).getPhonenumber());
                    }


                }
                recyclerView.setAdapter(new AmbulanceAdapter(ambucity,ambucontact,ambudescription,ambunameoforganization,ambuphone, R.layout.details, getApplicationContext()));
                progressBar.setVisibility(View.INVISIBLE);

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
