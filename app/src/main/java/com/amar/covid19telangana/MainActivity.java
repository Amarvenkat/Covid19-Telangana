package com.amar.covid19telangana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.amar.covid19telangana.Adapters.MainGridRecyclerAdapter;
import com.amar.covid19telangana.Adapters.NewsAdapterMain;
import com.amar.covid19telangana.ApiInterface.ApiCovid19;
import com.amar.covid19telangana.ApiInterface.ApiNews;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.Apiclients.ApiNewsClient;
import com.amar.covid19telangana.Dashboard.StateMap;
import com.amar.covid19telangana.RetrofitClass.Articles;
import com.amar.covid19telangana.RetrofitClass.Covid19Main;
import com.amar.covid19telangana.RetrofitClass.DailyNews;
import com.amar.covid19telangana.RetrofitClass.StateWise;

import com.amar.covid19telangana.Util.LocaleHelper;
import com.amar.covid19telangana.VocationalCourses.CourseMain;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;
import java.util.List;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.amar.covid19telangana.Util.Constants.KEY_NAME;
import static com.amar.covid19telangana.Util.Constants.MYPREF;

public class MainActivity extends AppCompatActivity   {

    SharedPreferences sharedPreferences;
    Button donate,loginadmin;
    TextView active,livetotal,death,recovered;
    MainActivity mainActivity;
    Context context;
    ImageView imgfirst;
    NestedScrollView nestedScrollView;
    LinearLayout linearLayout;
    RecyclerView newsrecyclerView,informationRecycler,mainGridRecycler;
    ProgressBar progressBar;

    public  static final String THIRD  = "third";
    ArrayList<Integer> maingridname    = new ArrayList<Integer>();
    ArrayList<String> maingridimg    = new ArrayList<String>();


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            linearLayout = (LinearLayout) findViewById(R.id.linearlayoutmain);
            nestedScrollView = (NestedScrollView) findViewById(R.id.nestedscrollview);
            newsrecyclerView = (RecyclerView) findViewById(R.id.news_recycler);
            loginadmin = (Button) findViewById(R.id.loginadmin);
            mainGridRecycler =(RecyclerView) findViewById(R.id.main_grid);
            donate = (Button) findViewById(R.id.donate);
            livetotal = (TextView) findViewById(R.id.livetotal);
            active = (TextView) findViewById(R.id.liveactive);
            death = (TextView) findViewById(R.id.livedeath);
            recovered = (TextView) findViewById(R.id.liverecovered);
            imgfirst = (ImageView) findViewById(R.id.imgfirst);
            progressBar = (ProgressBar) findViewById(R.id.progressbarmain);



            maingridname.add(R.string.dashboard);
            maingridname.add(R.string.healthcare);
            maingridname.add(R.string.education_and_skilling);
            maingridname.add(R.string.disaster_management);


            ////////////////////////////////////////////////////////////////////////////////////////////

            //mainGrid
            maingridimg.add("dashboard.json");
            maingridimg.add("healthcare.json");
            maingridimg.add("education.json");
            maingridimg.add("diseaster.json");

            ///////////////////////////////////////////////////////////////////////////////////////////

            //Logical error
            ConnectivityManager connectivityManager = ((ConnectivityManager) getSystemService(MainActivity.CONNECTIVITY_SERVICE));
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

            if(networkInfo != null && networkInfo.isConnected()){


            }else {

                Toast.makeText(this,"Connect to Internet",Toast.LENGTH_LONG).show();

            }

            //statusCheck();


            ////////////////////////////////////////////////////////////////////////////////////////////

            final ImageView img = new ImageView(this);
//            Picasso.with(img.getContext()).load(R.drawable.backgroundimg).into(img, new com.squareup.picasso.Callback() {
//                @Override
//                public void onSuccess() {
//                    linearLayout.setBackgroundDrawable(img.getDrawable());
//                }
//
//                @Override
//                public void onError() {
//                }
//            });
//            //Picasso.with(this).load(R.drawable.travelpass).fit().into(travelimg);

            ///////////////////////////////////////////////////////////////////////////////////////////


            sharedPreferences = getSharedPreferences(MYPREF, Context.MODE_PRIVATE);


            if (sharedPreferences.contains(KEY_NAME)) {
                Toast.makeText(this, "Welcome " + sharedPreferences.getString(KEY_NAME, ""), Toast.LENGTH_LONG).show();

            }else {
                finish();
                Intent intent = new Intent(MainActivity.this, BasicDetails.class);

                startActivity(intent);
            }

            ////////////////////////////////////////////////////////////////////////////////////////////


            MainGridRecyclerAdapter mainGridRecyclerAdapter = new MainGridRecyclerAdapter(this,maingridname,maingridimg);
            mainGridRecycler.setAdapter(mainGridRecyclerAdapter);
            mainGridRecycler.setLayoutManager(new GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,false));


            ////////////////////////////////////////////////////////////////////////////////////////////
            progressBar.setVisibility(View.INVISIBLE);

            Picasso.with(this).load(R.drawable.gove).fit().into(imgfirst);



            ApiCovid19 apiService =
                    ApiClient.getClient().create(ApiCovid19.class);

            progressBar.setVisibility(View.VISIBLE);

            Call<Covid19Main> call = apiService.getReport();
            call.enqueue(new Callback<Covid19Main>() {
                @Override
                public void onResponse(Response<Covid19Main> response) {

                    List<StateWise> state = response.body().getState();

                    Integer activeInt = state.get(0).getActive();
                    Integer confirmedInt = state.get(0).getConfirmed();
                    Integer deathInt = state.get(0).getDeaths();
                    Integer recoveredInt = state.get(0).getRecovered();
                    active.setText(activeInt.toString());
                    livetotal.setText(confirmedInt.toString());
                    death.setText(deathInt.toString());
                    recovered.setText(recoveredInt.toString());
                    //progressBar.setVisibility(View.INVISIBLE);
                    progressBar.setVisibility(View.INVISIBLE);

                }

                @Override
                public void onFailure(Throwable t) {

                }
            });


            ApiNews apiServicenews = ApiNewsClient.getClient().create(ApiNews.class);
    Call<DailyNews> callnews =apiServicenews.getResourse();
            callnews.enqueue(new Callback<DailyNews>() {
                @Override
                public void onResponse(Response<DailyNews> response) {
                    List<Articles> articles = response.body().getArticles();



                    NewsAdapterMain newsAdapterMain = new NewsAdapterMain(getApplicationContext(),articles,R.layout.newscard);
                    newsrecyclerView.setAdapter(newsAdapterMain);
                    LinearLayoutManager layoutManager
                            = new LinearLayoutManager(mainActivity, LinearLayoutManager.HORIZONTAL, false);
                    newsrecyclerView.setLayoutManager(layoutManager);
                    }

                @Override
                public void onFailure(Throwable t) {


                    //Toast.makeText(this,"eoorr"+t,Toast.LENGTH_LONG).show();
                    Log.e("TAG", t.toString());

                }
            });



            donate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pmcares.gov.in/en?should_open_safari=true"));
                        startActivity(intent);

                }
            });


            loginadmin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this,LoginAsAdmin.class);
                    startActivity(intent);


                }
            });


        }


        public void getmaingridintent(int position){

            switch (position){
                case 0:
                    Intent intent = new Intent(MainActivity.this, StateMap.class);
                    startActivity(intent);

                    break;
                case 1:

                    Intent intent1 = new Intent(MainActivity.this, HealthCare.class);
                    startActivity(intent1);

                    break;
                case 2:
                    Intent intent2 = new Intent(MainActivity.this, CourseMain.class);
                    startActivity(intent2);

                    break;
                case 3:

                    Intent intent3 = new Intent(MainActivity.this, DisasterManagement.class);
                    startActivity(intent3);
                    break;



            }


        }


        /*public void statusCheck() {
            final LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

            if (!manager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                buildAlertMessageNoGps();

            }
        }

        private void buildAlertMessageNoGps() {
            final AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Your GPS seems to be disabled, do you want to enable it?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(final DialogInterface dialog, final int id) {
                            startActivity(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(final DialogInterface dialog, final int id) {
                            dialog.cancel();
                        }
                    });
            final AlertDialog alert = builder.create();
            alert.show();
        }
    */
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu,menu);
            return super.onCreateOptionsMenu(menu);
        }
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle item selection
            switch (item.getItemId()) {
                case R.id.langenglish:
                    LocaleHelper.setLocale(MainActivity.this, "en");
                    recreate();
                    return true;
                case R.id.langtelugu:
                    LocaleHelper.setLocale(MainActivity.this, "te");
                    recreate();
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }
    }
