package com.amar.covid19telangana.Dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.Adapters.LiveDataAdapter;
import com.amar.covid19telangana.ApiInterface.ApiCovid19;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;
import com.amar.covid19telangana.RetrofitClass.Covid19Main;
import com.amar.covid19telangana.RetrofitClass.StateWise;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LiveReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_report);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.live_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiCovid19 apiService =
                ApiClient.getClient().create(ApiCovid19.class);

        Call<Covid19Main> call = apiService.getReport();
        call.enqueue(new Callback<Covid19Main>() {
            @Override
            public void onResponse(Response<Covid19Main> response) {

                List<StateWise> state = response.body().getState();


                recyclerView.setAdapter(new LiveDataAdapter(state,R.layout.live_state,getApplicationContext()));

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });


    }
}
