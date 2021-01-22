package com.amar.covid19telangana.MigrantLabour;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.Services.LabourUploadServices;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.amar.covid19telangana.Util.Constants;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;

import static com.amar.covid19telangana.Util.Constants.KEY_HTCONTACTNO;
import static com.amar.covid19telangana.Util.Constants.KEY_HTDISTRICT;
import static com.amar.covid19telangana.Util.Constants.KEY_HTNAME;
import static com.amar.covid19telangana.Util.Constants.KEY_HTSTATE;
import static com.amar.covid19telangana.Util.Constants.KEY_JOBSTATUS;
import static com.amar.covid19telangana.Util.Constants.KEY_MARITALSTATUS;
import static com.amar.covid19telangana.Util.Constants.KEY_MTCOMPANYADDRESS;
import static com.amar.covid19telangana.Util.Constants.KEY_MTCOMPANYNAME;
import static com.amar.covid19telangana.Util.Constants.KEY_MTCOMPANYOWNERNAME;
import static com.amar.covid19telangana.Util.Constants.KEY_MTDISTRICT;
import static com.amar.covid19telangana.Util.Constants.KEY_MTSTATE;
import static com.amar.covid19telangana.Util.Constants.KEY_NAME;
import static com.amar.covid19telangana.Util.Constants.KEY_NOOFADULT;
import static com.amar.covid19telangana.Util.Constants.KEY_NOOFCHILD;
import static com.amar.covid19telangana.Util.Constants.KEY_NOOFDEPENDANT;
import static com.amar.covid19telangana.Util.Constants.KEY_NOOFFEMALE;
import static com.amar.covid19telangana.Util.Constants.KEY_NOOFMALE;
import static com.amar.covid19telangana.Util.Constants.MYPREF;

public class LabourDetails extends AppCompatActivity {

    private static final String IS_BASICDETAILS  = "basic_details";
    int PERMISSION_ID = 44;
    FusedLocationProviderClient mFusedLocationClient;
    private static final String KEY_LATITUDE   = "latitude";
    private static final String KEY_LONGITUDE  = "longitude";

    EditText htname,htaddress,htstreetname,htstreetno,htdistrict,htstate,htcontactno,mtcompanyname,noofadult,noofchild,noofmale,nooffemale;
    EditText mtcompanyownername,mtcompanyaddress,mtstreetname,mtstreetno,mtdistrict,mtstate,noofdependant;
    Button btnlaboursubmit;
    SharedPreferences sharedPreferences;
    String employed,maritalstatus;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labour_details);

        //btnlaboursubmit = (Button) findViewById(R.id.btnlaboursubmit);
        htname = (EditText) findViewById(R.id.htname);
        htaddress = (EditText) findViewById(R.id.htaddress);
        htdistrict = (EditText) findViewById(R.id.htdistrict);
        htstate = (EditText) findViewById(R.id.htstate);
        htcontactno = (EditText) findViewById(R.id.htcontactno);
        mtcompanyname = (EditText) findViewById(R.id.mtcompanyname);
        mtcompanyownername = (EditText) findViewById(R.id.mtcompanyownername);
        mtcompanyaddress = (EditText) findViewById(R.id.mtcompanyaddress);
        mtdistrict = (EditText) findViewById(R.id.mtdistrict);
        mtstate = (EditText) findViewById(R.id.mtstate);
        //jobstatus = (EditText) findViewById(R.id.jobstatus);
       // maritalstatus = (EditText) findViewById(R.id.maritalstatus);
        noofdependant = (EditText) findViewById(R.id.noofdependant);
        noofadult = (EditText) findViewById(R.id.noofadult);
        noofchild = (EditText) findViewById(R.id.noofchild);
        noofmale = (EditText) findViewById(R.id.noofmale);
        nooffemale = (EditText) findViewById(R.id.nooffemale);
        img = (ImageView) findViewById(R.id.biglabourimg);
        FloatingActionButton btnlaboursubmit = (FloatingActionButton) findViewById(R.id.btnlaboursubmit);

        sharedPreferences = getSharedPreferences(MYPREF, Context.MODE_PRIVATE);
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(LabourDetails.this);

        getLastLocation();
        Picasso.with(this).load(R.drawable.labour).fit().into(img);

        btnlaboursubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (sharedPreferences.contains(KEY_HTNAME)){

                    Toast.makeText(LabourDetails.this,"You have already submitted",Toast.LENGTH_SHORT).show();


                    mFusedLocationClient = LocationServices.getFusedLocationProviderClient(LabourDetails.this);

                    getLastLocation();


               }else{

                    callsharedpreference();

                }

                }
        });
    }

    private void callsharedpreference() {
        sharedPreferences.edit().putString(KEY_HTNAME,htname.getText().toString()).apply();
        sharedPreferences.edit().putString(Constants.KEY_HTADDRESS,htaddress.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_HTDISTRICT,htdistrict.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_HTSTATE,htstate.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_HTCONTACTNO,htcontactno.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_MTCOMPANYNAME,mtcompanyname.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_NOOFADULT,noofadult.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_NOOFCHILD,noofchild.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_NOOFMALE,noofmale.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_NOOFFEMALE,nooffemale.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_MTCOMPANYOWNERNAME,mtcompanyownername.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_MTCOMPANYADDRESS,mtcompanyaddress.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_MTDISTRICT,mtdistrict.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_MTSTATE,mtstate.getText().toString()).apply();
        sharedPreferences.edit().putString(KEY_JOBSTATUS,employed.toString()).apply();
        sharedPreferences.edit().putString(KEY_MARITALSTATUS,maritalstatus.toString()).apply();
        sharedPreferences.edit().putString(KEY_NOOFDEPENDANT,noofdependant.getText().toString()).apply();

        callservices();

    }



    public void onempRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.jobstatusemployer:
                if (checked)
                    employed = "Employed";
                break;
            case R.id.jobstatusunemployer:
                if (checked)
                    employed = "Unemployed";
                break;

        }
    }

    public void onmariRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.matitalstatusmarried:
                if (checked)
                    maritalstatus = "Married";

                break;
            case R.id.matitalstatusunmarried:
                if (checked)
                    maritalstatus = "Unmarried";
                break;

        }
    }


    @SuppressLint("MissingPermission")
    private void getLastLocation(){
        if (checkPermissions()) {
            if (isLocationEnabled()) {
                mFusedLocationClient.getLastLocation().addOnCompleteListener(
                        new OnCompleteListener<Location>() {
                            @Override
                            public void onComplete(@NonNull Task<Location> task) {
                                Location location = task.getResult();
                                if (location == null) {
                                    requestNewLocationData();
                                } else {

                                    showlocation(location.getLatitude(),location.getLongitude());

                                }
                            }
                        }
                );
            } else {
                Toast.makeText(this, "Turn on location", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent);
            }
        } else {
            requestPermissions();
        }
    }

    private void showlocation(double latitude, double longitude) {
      //  sharedPreferences = getSharedPreferences(MYPREF, Context.MODE_PRIVATE);

        if (sharedPreferences.contains(KEY_LATITUDE) && sharedPreferences.contains(KEY_LONGITUDE)){


        }else {


            sharedPreferences.edit().putString(KEY_LATITUDE, String.valueOf(latitude)).apply();
            sharedPreferences.edit().putString(KEY_LONGITUDE,String.valueOf(longitude)).apply();

        }



    }



    @SuppressLint("MissingPermission")
    private void requestNewLocationData(){

        LocationRequest mLocationRequest = new LocationRequest();
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        mLocationRequest.setInterval(0);
        mLocationRequest.setFastestInterval(0);
        mLocationRequest.setNumUpdates(1);

        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        mFusedLocationClient.requestLocationUpdates(
                mLocationRequest, mLocationCallback,
                Looper.myLooper()
        );

    }

    private LocationCallback mLocationCallback = new LocationCallback() {
        @Override
        public void onLocationResult(LocationResult locationResult) {
            Location mLastLocation = locationResult.getLastLocation();

                  }
    };

    private boolean checkPermissions() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

            return true;
        }
        return false;

    }

    private void requestPermissions() {
        ActivityCompat.requestPermissions(
                this,
                new String[]{Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION},
                PERMISSION_ID
        );
    }

    private boolean isLocationEnabled() {
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(
                LocationManager.NETWORK_PROVIDER
        );
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_ID) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getLastLocation();
            }
        }
    }


    @Override
    public void onResume(){
        super.onResume();
        if (checkPermissions()) {
            getLastLocation();
        }

    }

    private void callservices() {


        startService(new Intent(this, LabourUploadServices.class));



    }

}

