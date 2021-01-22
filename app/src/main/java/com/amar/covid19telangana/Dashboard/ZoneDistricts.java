package com.amar.covid19telangana.Dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.amar.covid19telangana.Adapters.ZoneDistrictsAdapter;
import com.amar.covid19telangana.ApiInterface.ApiZone;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;
import com.amar.covid19telangana.RetrofitClass.Covid19Zone;
import com.amar.covid19telangana.RetrofitClass.Zone;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ZoneDistricts extends AppCompatActivity {
    private static final String STRINGSTATE = "statename";
    ArrayList<String> zonedistrict = new ArrayList<String>();
    ArrayList<String> zonecolour = new ArrayList<String>();
    RecyclerView zonedistricrecycler;
    Context context;
    ZoneDistricts zoneDistricts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone_districts);

        zonedistricrecycler = (RecyclerView) findViewById(R.id.zonedistricrecycler);
        Bundle bundle;
        bundle = getIntent().getExtras();

        final String state = bundle.getString(STRINGSTATE);

        Toast.makeText(this, "" + state, Toast.LENGTH_LONG).show();


        ApiZone apiServicezone = ApiClient.getClient().create(ApiZone.class);
        final Call<Covid19Zone> callnews = apiServicezone.getZone();
        callnews.enqueue(new Callback<Covid19Zone>() {
            @Override
            public void onResponse(Response<Covid19Zone> response) {

                List<Zone> zonesretro = response.body().getZone();
                //String ar = articles.get(0).getZonecolour();

                for (int i = 0; i < zonesretro.size(); i++) {


                    if (zonesretro.get(i).getZonestate().equals(state)) {

                        zonedistrict.add(zonesretro.get(i).getZonedistrict());
                        zonecolour.add(zonesretro.get(i).getZonecolour());

                    }
                }
               ZoneDistrictsAdapter zoneDistrictsAdapter = new ZoneDistrictsAdapter(getApplicationContext(),zonedistrict,zonecolour);
               zonedistricrecycler.setLayoutManager(new LinearLayoutManager(zoneDistricts));
               zonedistricrecycler.setAdapter(zoneDistrictsAdapter);
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });


    }
}