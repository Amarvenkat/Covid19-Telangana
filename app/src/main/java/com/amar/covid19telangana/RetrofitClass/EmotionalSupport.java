package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.Adapters.EmotionalSupportAapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EmotionalSupport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotional_support);

        final ArrayList<String> mentalcity = new ArrayList<String>();
        final ArrayList<String> mentalcontact = new ArrayList<String>();
        final ArrayList<String> mentaldescription = new ArrayList<String>();
        final ArrayList<String> mentalnameoforganization = new ArrayList<String>();
        final ArrayList<String> mentalphone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mental_recycler);
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

                    String checkcata = "Mental well being and Emotional Support";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        mentalcity.add(resources.get(i).getCity());
                        mentalcontact.add(resources.get(i).getContact());
                        mentaldescription.add(resources.get(i).getDescription());
                        mentalnameoforganization.add(resources.get(i).getName_of_organization());
                        mentalphone.add(resources.get(i).getPhonenumber());
                    }

                    recyclerView.setAdapter(new EmotionalSupportAapter(mentalcity,mentalcontact,mentaldescription,mentalnameoforganization,mentalphone, R.layout.details, getApplicationContext()));
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
