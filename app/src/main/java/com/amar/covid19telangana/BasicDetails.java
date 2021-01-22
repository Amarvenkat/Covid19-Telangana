package com.amar.covid19telangana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.amar.covid19telangana.Util.Constants;

import static com.amar.covid19telangana.Util.Constants.IS_BASICDETAILS;
import static com.amar.covid19telangana.Util.Constants.KEY_ADDRESS;
import static com.amar.covid19telangana.Util.Constants.KEY_GENDER;
import static com.amar.covid19telangana.Util.Constants.KEY_NAME;
import static com.amar.covid19telangana.Util.Constants.KEY_PHONE_NO;
import static com.amar.covid19telangana.Util.Constants.MYPREF;



public class BasicDetails extends AppCompatActivity {

    String gender;

    SharedPreferences sharedPreferences;
    EditText bdname,bdphoneno,bdgender,bdaddress;
    Button bdsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_details);

        bdname = (EditText) findViewById(R.id.bdname);
        bdphoneno= (EditText) findViewById(R.id.bdphone);
     //   bdgender = (EditText) findViewById(R.id.bdgender);
        bdaddress = (EditText) findViewById(R.id.bdaddress);
        bdsubmit = (Button) findViewById(R.id.bdsubmit);


        sharedPreferences = getSharedPreferences(MYPREF, Context.MODE_PRIVATE);

        if (sharedPreferences.contains(KEY_NAME)){

            finish();
            Intent intent = new Intent(BasicDetails.this,MainActivity.class);
            startActivity(intent);


         /*   if(sharedPreferences.contains(KEY_NAME) && sharedPreferences.contains(KEY_PHONE_NO) && sharedPreferences.contains(KEY_GENDER) && sharedPreferences.contains(KEY_ADDRESS) ){
*/


        }else{


            bdsubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    sharedPreferences.edit().putBoolean(IS_BASICDETAILS,true);

                    sharedPreferences.edit().putString(KEY_NAME,bdname.getText().toString()).apply();
                    sharedPreferences.edit().putString(KEY_PHONE_NO,bdphoneno.getText().toString()).apply();
                    sharedPreferences.edit().putString(KEY_GENDER,gender.toString()).apply();
                    sharedPreferences.edit().putString(KEY_ADDRESS,bdaddress.getText().toString()).apply();

                  finish();
                    Intent intent = new Intent(BasicDetails.this,MainActivity.class);
/*
                    Bundle bundle = new Bundle();
                    bundle.putString(KEY_NAME, usernameEditText.getText().toString());
                    bundle.putString(KEY_PHONE_NO, passwordEditText.getText().toString());
                    intent.putExtras(bundle);
*/
                    startActivity(intent);
                }
            });


        }




    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_male:
                if (checked)
                    gender = "Male";
                    break;
            case R.id.radio_female:
                if (checked)
                    gender = "Female";
                    break;
        }
    }
}
