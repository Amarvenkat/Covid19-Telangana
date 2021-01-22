package com.amar.covid19telangana.CollectionFood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.Services.CollectionFoodService;

public class CollectionFoodMain extends AppCompatActivity {

    private static final String FOODAVAILABLE = "foodavailable" ;
    private static final String QUANTITY = "quantity";
    Button btnsubmit;
    String quantity;
    CheckBox snacks,provision,cookedfood,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection_food_main);

        snacks = (CheckBox) findViewById(R.id.collectionfoodtypeSnacks);
        provision = (CheckBox) findViewById(R.id.collectionfoodtypeProvision);
        cookedfood = (CheckBox) findViewById(R.id.collectionfoodtypeCookedfood);
        other = (CheckBox) findViewById(R.id.collectionfoodtypeOther);
        btnsubmit = (Button) findViewById(R.id.collectionfoodsubmit);

         btnsubmit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 StringBuilder foodavailable = new StringBuilder();
                 if (snacks.isChecked()){

                     foodavailable.append("Snacks ");

                 }
                 if (provision.isChecked()){

                     foodavailable.append("Provision ");

                 }
                 if (cookedfood.isChecked()){

                     foodavailable.append("Cooked Food ");

                 }
                 if (other.isChecked()){

                     other.append("Other ");

                 }
                 Intent intent = new Intent(CollectionFoodMain.this, CollectionFoodService.class);
                 Bundle bundle = new Bundle();
                 bundle.putString(FOODAVAILABLE,foodavailable.toString());
                 bundle.putString(QUANTITY,quantity);
                 intent.putExtras(bundle);
                 startService(intent);
             }


         });


    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();


        switch(view.getId()) {
            case R.id.quantity1to10:
                if (checked) {
                    quantity = "1 to 10";
                }
                break;
            case R.id.quantity11to100:
                if (checked) {
                    quantity = "11 to 100";
                }
                break;
            case R.id.quantityabove100:
                if (checked) {
                    quantity = "above 100";
                }
                break;
        }

        }
}