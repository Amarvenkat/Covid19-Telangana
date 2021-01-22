package com.amar.covid19telangana.Unorganizedworker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.Services.UnorganizedService;

import static com.amar.covid19telangana.Util.Constants.FEMALEDEPENDANT;
import static com.amar.covid19telangana.Util.Constants.HELP;
import static com.amar.covid19telangana.Util.Constants.MALEDEPENDANT;
import static com.amar.covid19telangana.Util.Constants.MARITALSTATUS;
import static com.amar.covid19telangana.Util.Constants.NATURE_OF_WORK;
import static com.amar.covid19telangana.Util.Constants.UNORGANIZEDAGE;

public class UnorganizedMain extends AppCompatActivity {
    RadioButton selectedRadioButton;
    RadioGroup radioGroup;
    String natureofwork;
    String maritalstatus;
    //String help;
    Button btnsubmit;
    EditText age,maledependant,femaledependant;
    CheckBox food,healthandmedicine,accomodation,job;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unorganized_main);


        food = (CheckBox)findViewById(R.id.food);
        healthandmedicine = (CheckBox)findViewById(R.id.healthandmedicine);
        accomodation = (CheckBox)findViewById(R.id.accomodation);
        job = (CheckBox)findViewById(R.id.job);

        btnsubmit = (Button) findViewById(R.id.unorganizedworkersubmit);
        age = (EditText) findViewById(R.id.unorganizedworkerage);
        maledependant = (EditText) findViewById(R.id.maledependent);
        femaledependant = (EditText) findViewById(R.id.femaledependent);



        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder help = new StringBuilder();
                if (food.isChecked()){

                    help.append("Food ");

                }

                if (healthandmedicine.isChecked()){

                    help.append("Healthcare and Medicine");

                }
                if (accomodation.isChecked()){

                    help.append("Accomodation ");

                }

                if (job.isChecked()){
                    help.append("Job ");

                }



                Intent intent = new Intent(UnorganizedMain.this, UnorganizedService.class);
                Bundle bundle = new Bundle();
                bundle.putString(NATURE_OF_WORK,natureofwork);
                bundle.putString(MARITALSTATUS,maritalstatus);
                bundle.putString(HELP, String.valueOf(help));
                bundle.putString(MALEDEPENDANT,maledependant.getText().toString());
                bundle.putString(FEMALEDEPENDANT,femaledependant.getText().toString());
                bundle.putString(UNORGANIZEDAGE,age.getText().toString());
                intent.putExtras(bundle);
                startService(intent);

            }
        });


    }
    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
       // selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());

        switch(view.getId()) {
            case R.id.agricultural:
                if (checked){
                    natureofwork = "Agriculture";
                }
                break;
            case R.id.otherunorganized:
                if (checked){
                    natureofwork = "Other";
                }
                break;
            case R.id.transportation:
                if (checked){
                    natureofwork = "Transportation";
                }
                break;
            case R.id.building:
                if (checked){
                    natureofwork = "Building";
                }
                break;
            case R.id.hotel:
                if (checked){
                    natureofwork = "Hotel and Restaurants Labour";
                }
                break;
            case R.id.industrial:
                if (checked){
                    natureofwork = "Industrial and Manufacturing";
                }
                break;
            case R.id.fisherMan:
                if (checked){
                    natureofwork = "Fisher Man";
                }
                break;

        }
    }
    public void onRadioButtonClickedmaritalstatus(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.married:
                if (checked)

                    maritalstatus = "Married";

                    break;
            case R.id.unmarried:
                if (checked)

                    maritalstatus = "UnMarried";

                    break;
        }
    }
}