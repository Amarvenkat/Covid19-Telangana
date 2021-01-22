package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19telangana.Adapters.TestinglabAdapter;
import com.amar.covid19telangana.ApiInterface.ApiResources;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Testinglab extends AppCompatActivity {
    ProgressBar progressBar;
    ArrayList<String> testcity;
    ArrayList<String> testcontact;
    ArrayList<String> testdescription;
    ArrayList<String> testnameoforganization;
    ArrayList<String> testphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testinglab);
        testcity = new ArrayList<String>();
        testcontact = new ArrayList<String>();
        testdescription = new ArrayList<String>();
        testnameoforganization = new ArrayList<String>();
        testphone = new ArrayList<String>();
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.testinglab_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        progressBar = (ProgressBar) findViewById(R.id.progressbartest);


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

                for (int i=0;i<resources.size();i++){

                    String checkcata = "CoVID-19 Testing Lab";
                    String checkstate = "Telangana";
                    String category = resources.get(i).getCategory();
                    String state = resources.get(i).getState();

                    if (category.equals(checkcata) && state.equals(checkstate) ){
                        testcity.add(resources.get(i).getCity());
                        testcontact.add(resources.get(i).getContact());
                        testdescription.add(resources.get(i).getDescription());
                        testnameoforganization.add(resources.get(i).getName_of_organization());
                        testphone.add(resources.get(i).getPhonenumber());
                    }

                    }
                    recyclerView.setAdapter(new TestinglabAdapter(testcity,testcontact,testdescription,testnameoforganization,testphone, R.layout.details, getApplicationContext()));

                progressBar.setVisibility(View.INVISIBLE);

            }

            @Override
            public void onFailure(Throwable t) {


            }
        });


    }

}
