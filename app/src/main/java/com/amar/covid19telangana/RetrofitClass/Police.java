package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19telangana.Adapters.PoliceAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Police extends AppCompatActivity {

    ProgressBar progressBar;
    ArrayList<String> policecity;
    ArrayList<String> policecontact;
    ArrayList<String> policedescription;
    ArrayList<String> policenameoforganization;
    ArrayList<String> policephone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);

        policecity = new ArrayList<String>();
        policecontact = new ArrayList<String>();
        policedescription = new ArrayList<String>();
        policenameoforganization = new ArrayList<String>();
        policephone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.police_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        progressBar = (ProgressBar) findViewById(R.id.progressbarpolice);
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

                    String checkcata = "Police";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        policecity.add(resources.get(i).getCity());
                        policecontact.add(resources.get(i).getContact());
                        policedescription.add(resources.get(i).getDescription());
                        policenameoforganization.add(resources.get(i).getName_of_organization());
                        policephone.add(resources.get(i).getPhonenumber());
                    }

                    recyclerView.setAdapter(new PoliceAdapter(policecity,policecontact,policedescription,policenameoforganization,policephone, R.layout.details, getApplicationContext()));
                    progressBar.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
