package com.amar.covid19telangana.Selfassesment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.Services.DataUploadService;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import static com.amar.covid19telangana.Util.Constants.KEY_LATITUDE;
import static com.amar.covid19telangana.Util.Constants.KEY_LONGITUDE;
import static com.amar.covid19telangana.Util.Constants.MYPREF;

public class SelfAssesment extends AppCompatActivity {


    public int symptom;
    String question1;

    String finalresult;
    ScrollView scrollView;
    Button submit;
    CheckBox cb1, cb2, cb3, cb4, cb5,cb6,cb7,cb8,cb9,cb10,cb11,cbnone;
    RadioGroup radioGroup;
    SharedPreferences sharedPreferences;
    RadioButton selectedRadioButton;
    TextView selfassesmentresult;
    ImageView imgmsg;
    CardView selfresultcard,selfques1card,selfans1card,selfques2card,selfques3card,selfques4card,selfans2card,selfans3card,selfans4card;
    int PERMISSION_ID = 44;
    FusedLocationProviderClient mFusedLocationClient;
    String sympresult = null;
    String quesresult = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_assesment);

        imgmsg = (ImageView) findViewById(R.id.imgmsg);
        submit = (Button) findViewById(R.id.btnsubmitassesment);
        selfassesmentresult = (TextView) findViewById(R.id.selfaccesresult);

//        selfques1card = (CardView) findViewById(R.id.selfques1card);




        cb1 = (CheckBox) findViewById(R.id.symp1);
        cb2 = (CheckBox) findViewById(R.id.symp2);
        cb3 = (CheckBox) findViewById(R.id.symp3);
        cb4 = (CheckBox) findViewById(R.id.symp4);
        cb5 = (CheckBox) findViewById(R.id.symp5);
        cb6 = (CheckBox) findViewById(R.id.symp6);
        cb7 = (CheckBox) findViewById(R.id.symp7);
        cb8 = (CheckBox) findViewById(R.id.symp8);
        cb9 = (CheckBox) findViewById(R.id.symp9);
        cb10= (CheckBox) findViewById(R.id.symp10);
        cb11 = (CheckBox) findViewById(R.id.symp11);
        cbnone = (CheckBox) findViewById(R.id.none);


        scrollView = (ScrollView) findViewById(R.id.scrollselfasses);
        //radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        selfresultcard = (CardView) findViewById(R.id.selfresultcard);


        selfques2card = (CardView) findViewById(R.id.selfques2card);
        selfques3card = (CardView) findViewById(R.id.selfques3card);
        selfques4card = (CardView) findViewById(R.id.selfques4card);

        selfans2card = (CardView) findViewById(R.id.selfans2card);
        selfans3card = (CardView) findViewById(R.id.selfans3card);
        selfans4card = (CardView) findViewById(R.id.selfans4card);


        if (selfresultcard.getVisibility() == View.VISIBLE)
            selfresultcard.setVisibility(View.INVISIBLE);
  /*      if (selfques1card.getVisibility() == View.VISIBLE)
            selfques1card.setVisibility(View.INVISIBLE);
        if (selfans1card.getVisibility() == View.VISIBLE)
            selfans1card.setVisibility(View.INVISIBLE);
*/
        if (selfques2card.getVisibility() == View.VISIBLE)
            selfques2card.setVisibility(View.INVISIBLE);
        if (selfans2card.getVisibility() == View.VISIBLE)
            selfans2card.setVisibility(View.INVISIBLE);

        if (selfques3card.getVisibility() == View.VISIBLE)
            selfques3card.setVisibility(View.INVISIBLE);
        if (selfans3card.getVisibility() == View.VISIBLE)
            selfans3card.setVisibility(View.INVISIBLE);

        if (selfques4card.getVisibility() == View.VISIBLE)
            selfques4card.setVisibility(View.INVISIBLE);
        if (selfans4card.getVisibility() == View.VISIBLE)
            selfans4card.setVisibility(View.INVISIBLE);

        if (submit.getVisibility() == View.VISIBLE)
            submit.setVisibility(View.INVISIBLE);

        android.app.AlertDialog.Builder builder = new AlertDialog.Builder(this);

        LayoutInflater inflater = getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.self_assesment_message, null));
        builder.setCancelable(true);
        builder.show();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sympresult = null;

                if (cb1.isChecked()){

                    if (sympresult == null || sympresult.equals("Medium") || sympresult.equals("Low")){


                    sympresult = "High";

                    }
                }
                if (cb2.isChecked()){

                    if (sympresult == null || sympresult.equals("Medium") || sympresult.equals("Low")){


                        sympresult = "High";

                    }
                }
                if (cb3.isChecked()){

                    if (sympresult == null || sympresult.equals("Medium") || sympresult.equals("Low")){


                        sympresult = "High";

                    }
                }
                if (cb4.isChecked()){

                    if (sympresult == null || sympresult.equals("Medium") || sympresult.equals("Low")){


                        sympresult = "High";

                    }
                }

                if (cb5.isChecked()){

                    if (sympresult == null || sympresult.equals("Low")){

                        sympresult = "Medium";
                    }

                }
                if (cb6.isChecked()){

                    if (sympresult == null || sympresult.equals("Low")){

                        sympresult = "Medium";
                    }

                }

                if (cb7.isChecked()){

                    if (sympresult == null || sympresult.equals("Low")){

                        sympresult = "Medium";
                    }

                }

                if (cb8.isChecked()){

                    if (sympresult == null || sympresult.equals("Low")){

                        sympresult = "Medium";
                    }

                }

                if (cb9.isChecked()){

                    if (sympresult == null || sympresult.equals("Low")){

                        sympresult = "Medium";
                    }

                }

                if (cb10.isChecked()){

                    if (sympresult == null || sympresult.equals("Low")){

                        sympresult = "Medium";
                    }

                }
                if (cb11.isChecked()){

                    if (sympresult == null || sympresult.equals("Low")){

                        sympresult = "Medium";
                    }

                }

                if (cbnone.isChecked()){
                    sympresult = "Low";
                }


                showresult();
            }


        });


    }

    public void showresult(){

        if (sympresult.equals("High") && quesresult.equals("Yes")){

            Toast.makeText(SelfAssesment.this,"High risk : You are under a high risk contact a\n" +
                    "heath care provider immediately",Toast.LENGTH_LONG).show();

             finalresult = "High Risk";

            selfassesmentresult.setText(R.string.highrisk);

            selfresultcard.setCardBackgroundColor(Color.RED);;


        }
        if (sympresult.equals("High") && quesresult.equals("No")){

            Toast.makeText(SelfAssesment.this,"Medium risk : Check for other symptoms or\n" +
                    "contact a health care provider within 12 hrs",Toast.LENGTH_LONG).show();

             finalresult = "Medium Risk";
            selfassesmentresult.setText(R.string.mediumrisk);
            selfresultcard.setCardBackgroundColor(Color.parseColor("#FFA726"));

            //Medium risk : Check for other symptoms or
            //contact a health care provider within 12 hrs

        }

        if (sympresult.equals("Medium") && quesresult.equals("Yes")){

            Toast.makeText(SelfAssesment.this,"Medium risk : Check for other symptoms or\n" +
                    "contact a health care provider within 12 hrs",Toast.LENGTH_LONG).show();
            finalresult = "Medium Risk";
            selfassesmentresult.setText(R.string.mediumrisk);
            selfresultcard.setCardBackgroundColor(Color.parseColor("#FFA726"));

            //Medium risk : Check for other symptoms or
            //contact a health care provider within 12 hrs

        }


        if (sympresult.equals("Medium") && quesresult.equals("No")){


            Toast.makeText(SelfAssesment.this,"Low risk: Self monitor for 14 days and\n" +
                    "check for any above-mentioned\n" +
                    "symptoms.",Toast.LENGTH_LONG).show();

            selfresultcard.setCardBackgroundColor(Color.BLUE);
            finalresult = "Low Risk";
            selfassesmentresult.setText(R.string.lowrisk);
            //Low risk: Self monitor for 14 days and
            //check for any above-mentioned
            //symptoms.

        }


        if (sympresult.equals("Low") && quesresult.equals("Yes")){


            Toast.makeText(SelfAssesment.this,"Low risk: Self monitor for 14 days and\n" +
                    "check for any above-mentioned\n" +
                    "symptoms.",Toast.LENGTH_LONG).show();
            selfresultcard.setCardBackgroundColor(Color.BLUE);
            finalresult = "Low Risk";
            selfassesmentresult.setText(R.string.lowrisk);


            //Low risk: Self monitor for 14 days and
            //check for any above-mentioned
            //symptoms.

        }

        if (sympresult.equals("Low") && quesresult.equals("No")){


            Toast.makeText(SelfAssesment.this,"No risk : You have no symptoms that\n" +
                    "currently suggest the need for COVID-19\n" +
                    "testing",Toast.LENGTH_LONG).show();
            selfresultcard.setCardBackgroundColor(Color.GREEN);
            finalresult = "No Risk";
            selfassesmentresult.setText(R.string.norisk);
            //No risk : You have no symptoms that
            //currently suggest the need for COVID-19
            //testing
        }

        if (finalresult.equals("High Risk")){


            mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

            getLastLocation();
        }


    }


    public void onCheckBoxClicked(View view) {


        if (cb1.isChecked() || cb2.isChecked() || cb3.isChecked() || cb4.isChecked() || cb5.isChecked() || cb6.isChecked() || cb7.isChecked() || cb8.isChecked() || cb9.isChecked() || cb10.isChecked() || cb11.isChecked() || cbnone.isChecked() ){

            selfques2card.setVisibility(View.VISIBLE);
            selfans2card.setVisibility(View.VISIBLE);

        }
        Boolean checkBoxState = cbnone.isChecked();


        if (checkBoxState.equals(true)) {

            cb1.setChecked(false);
            cb2.setChecked(false);
            cb3.setChecked(false);
            cb4.setChecked(false);
            cb5.setChecked(false);
            cb6.setChecked(false);
            cb7.setChecked(false);
            cb8.setChecked(false);
            cb9.setChecked(false);
            cb10.setChecked(false);
            cb11.setChecked(false);

        }

    }



    public void onRadioButtonClickedques2(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.ans2yes:
                if (checked){

                    if (quesresult == null || quesresult.equals("No")){

                        quesresult = "Yes";

                    }

                }


                break;
            case R.id.ans2no:
                if (checked){

                    if (quesresult == null){
                        quesresult = "No";
                    }
                }

                break;
        }

        selfques3card.setVisibility(View.VISIBLE);
        selfans3card.setVisibility(View.VISIBLE);


    }

    public void onRadioButtonClickedques3(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.ans3yes:

                if (checked){

                    if (quesresult == null || quesresult.equals("No")){

                        quesresult = "Yes";

                    }

                }
                break;
            case R.id.ans3no:
                if (checked){

                    if (quesresult == null){
                        quesresult = "No";
                    }
                }
                break;
        }

        selfques4card.setVisibility(View.VISIBLE);
        selfans4card.setVisibility(View.VISIBLE);

    }

    public void onRadioButtonClickedques4(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.ans4yes:
                if (checked){

                    if (quesresult == null || quesresult.equals("No")){

                        quesresult = "Yes";

                    }

                }
                break;
            case R.id.ans4no:
                if (checked){

                    if (quesresult == null){
                        quesresult = "No";
                    }
                }

                break;
        }

        submit.setVisibility(View.VISIBLE);
        selfresultcard.setVisibility(View.VISIBLE);

    }



    private void showlocation(double latitude, double longitude) {
        sharedPreferences = getSharedPreferences(MYPREF, Context.MODE_PRIVATE);

        if (sharedPreferences.contains(KEY_LATITUDE) && sharedPreferences.contains(KEY_LONGITUDE)){

            showmessage();

        }else {


            sharedPreferences.edit().putString(KEY_LATITUDE, String.valueOf(latitude)).apply();
            sharedPreferences.edit().putString(KEY_LONGITUDE,String.valueOf(longitude)).apply();


            showmessage();
        }


    }


    public void showmessage() {


        startService(new Intent(this, DataUploadService.class));


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
                                 //   latTextView.setText(location.getLatitude()+"");
                                   // lonTextView.setText(location.getLongitude()+"");

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

            //latTextView.setText(mLastLocation.getLatitude()+"");
            //lonTextView.setText(mLastLocation.getLongitude()+"");
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

/*

    @Override
    public void onResume(){
        super.onResume();
        if (checkPermissions()) {
            getLastLocation();
        }

    }
*/




}
