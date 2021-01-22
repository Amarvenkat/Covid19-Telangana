package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19telangana.Adapters.GovHelplineAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GovHelpline extends AppCompatActivity {
    ProgressBar progressBar;
    ArrayList<String> govhelpcity;
    ArrayList<String> govhelpcontact;
    ArrayList<String> govhelpdescription;
    ArrayList<String> govhelpnameoforganization;
    ArrayList<String> govhelpphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gov_helpline);

         govhelpcity = new ArrayList<String>();
         govhelpcontact = new ArrayList<String>();
         govhelpdescription = new ArrayList<String>();
         govhelpnameoforganization = new ArrayList<String>();
         govhelpphone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.govhelpline_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        progressBar = (ProgressBar) findViewById(R.id.progressbargov);
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

                    String checkcata = "Government Helpline";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        govhelpcity.add(resources.get(i).getCity());
                        govhelpcontact.add(resources.get(i).getContact());
                        govhelpdescription.add(resources.get(i).getDescription());
                        govhelpnameoforganization.add(resources.get(i).getName_of_organization());
                        govhelpphone.add(resources.get(i).getPhonenumber());
                    }

                    recyclerView.setAdapter(new GovHelplineAdapter(govhelpcity,govhelpcontact,govhelpdescription,govhelpnameoforganization,govhelpphone, R.layout.details, getApplicationContext()));
                }
                recyclerView.setAdapter(new GovHelplineAdapter(govhelpcity,govhelpcontact,govhelpdescription,govhelpnameoforganization,govhelpphone, R.layout.details, getApplicationContext()));
                progressBar.setVisibility(View.INVISIBLE);

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
