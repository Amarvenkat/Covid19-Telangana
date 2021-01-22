package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.Adapters.MedicalAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Medical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);

        final ArrayList<String> medicalcity = new ArrayList<String>();
        final ArrayList<String> medicalcontact = new ArrayList<String>();
        final ArrayList<String> medicaldescription = new ArrayList<String>();
        final ArrayList<String> medicalnameoforganization = new ArrayList<String>();
        final ArrayList<String> medicalphone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.medical_recycler);
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

                    String checkcata = "Medical store & Medicine supplies";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        medicalcity.add(resources.get(i).getCity());
                        medicalcontact.add(resources.get(i).getContact());
                        medicaldescription.add(resources.get(i).getDescription());
                        medicalnameoforganization.add(resources.get(i).getName_of_organization());
                        medicalphone.add(resources.get(i).getPhonenumber());
                    }

                    recyclerView.setAdapter(new MedicalAdapter(medicalcity,medicalcontact,medicaldescription,medicalnameoforganization,medicalphone, R.layout.details, getApplicationContext()));
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}

