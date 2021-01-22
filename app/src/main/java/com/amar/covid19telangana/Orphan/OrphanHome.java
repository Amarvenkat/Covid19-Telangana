package com.amar.covid19telangana.Orphan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.Services.OrphanService;

import static com.amar.covid19telangana.Util.Constants.ORPHANHELP;
import static com.amar.covid19telangana.Util.Constants.ORPHANLIVING;
import static com.amar.covid19telangana.Util.Constants.ORPHANORPHANLIVING;
import static com.amar.covid19telangana.Util.Constants.ORPHANSHELDING;

public class OrphanHome extends AppCompatActivity {

    CheckBox orphancarearrangements,orphanmedicinesupplies,orphandailyliving,orphanmedicalattention,orphanownhealth;
    Button btnsubmit;
    String orphanLiving,orphanOrphanLiving,orphanShelding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orphan_home);

        orphancarearrangements = (CheckBox) findViewById(R.id.orphancarearrangements);
        orphanmedicinesupplies = (CheckBox) findViewById(R.id.orphanmedicinesupplies);
        orphandailyliving = (CheckBox) findViewById(R.id.orphandailyliving);
        orphanmedicalattention = (CheckBox) findViewById(R.id.orphanmedicalattention);
        orphanownhealth = (CheckBox) findViewById(R.id.orphanownhealth);
        btnsubmit = (Button) findViewById(R.id.orphansubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder help = new StringBuilder();

                if (orphancarearrangements.isChecked()){

                    help.append(" Ongoing care arrangements ");

                }

                if (orphanmedicinesupplies.isChecked()){

                    help.append(" Support with medicine supplies ");

                }
                if (orphandailyliving.isChecked()){

                    help.append(" Support with daily living ");

                }

                if (orphanmedicalattention.isChecked()){

                    help.append(" Urgent medical attention ");
                }

                if (orphanownhealth.isChecked()){

                    help.append(" Looking after your own health ");
                }

                Bundle bundle = new Bundle();
                Intent intent = new Intent(OrphanHome.this, OrphanService.class);
                bundle.putString(ORPHANHELP, String.valueOf(help));
                bundle.putString(ORPHANLIVING,orphanLiving);
                bundle.putString(ORPHANORPHANLIVING,orphanOrphanLiving);
                bundle.putString(ORPHANSHELDING,orphanShelding);
                intent.putExtras(bundle);
                startService(intent);

            }
        });



    }

    public void onRadioOrphanLiving(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.orphanlivingyes:
                if (checked)

                    orphanLiving = "Yes";

                break;
            case R.id.orphanlivingno:
                if (checked)

                    orphanLiving = "No";

                break;
        }

    }

    public void onRadioOrphanOrphanLiving(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.orphanorphanyes:
                if (checked)

                    orphanOrphanLiving = "Yes";

                break;
            case R.id.orphanorphanno:
                if (checked)

                    orphanOrphanLiving = "No";

                break;
        }

    }

    public void onRadioOrphanShelding(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.orphansheldingyes:
                if (checked)

                    orphanShelding = "Yes";

                break;
            case R.id.orphansheldingno:
                if (checked)

                    orphanShelding = "No";

                break;

            case R.id.orphansheldingnotsure:
                if (checked)

                    orphanShelding = "Not Sure";

                break;
        }

    }
}