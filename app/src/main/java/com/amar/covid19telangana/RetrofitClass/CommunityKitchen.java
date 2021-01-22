package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.Adapters.CommunityKitchenAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CommunityKitchen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_kitchen);

        final ArrayList<String> kitccity = new ArrayList<String>();
        final ArrayList<String> kitccontact = new ArrayList<String>();
        final ArrayList<String> kitcdescription = new ArrayList<String>();
        final ArrayList<String> kitcnameoforganization = new ArrayList<String>();
        final ArrayList<String> kitcphone = new ArrayList<String>();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.kitchen_recycler);
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

                    String checkcata = "Community Kitchen";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate)) {
                        kitccity.add(resources.get(i).getCity());
                        kitccontact.add(resources.get(i).getContact());
                        kitcdescription.add(resources.get(i).getDescription());
                        kitcnameoforganization.add(resources.get(i).getName_of_organization());
                        kitcphone.add(resources.get(i).getPhonenumber());
                    }

                    recyclerView.setAdapter(new CommunityKitchenAdapter(kitccity,kitccontact,kitcdescription,kitcnameoforganization,kitcphone, R.layout.details, getApplicationContext()));
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
