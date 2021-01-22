package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19telangana.Adapters.OtherAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Other extends AppCompatActivity {

    ProgressBar progressBar;
    ArrayList<String> othercity;
    ArrayList<String> othercontact;
    ArrayList<String> otherdescription;
    ArrayList<String> othernameoforganization;
    ArrayList<String> otherphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);


        othercity = new ArrayList<String>();
        othercontact = new ArrayList<String>();
        otherdescription = new ArrayList<String>();
        othernameoforganization = new ArrayList<String>();
        otherphone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.other_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        progressBar = (ProgressBar) findViewById(R.id.progressbarother);
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

                    String checkcata = "Other";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        othercity.add(resources.get(i).getCity());
                        othercontact.add(resources.get(i).getContact());
                        otherdescription.add(resources.get(i).getDescription());
                        othernameoforganization.add(resources.get(i).getName_of_organization());
                        otherphone.add(resources.get(i).getPhonenumber());
                    }

                }
                recyclerView.setAdapter(new OtherAdapter(othercity,othercontact,otherdescription,othernameoforganization,otherphone, R.layout.details, getApplicationContext()));
                progressBar.setVisibility(View.INVISIBLE);

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
