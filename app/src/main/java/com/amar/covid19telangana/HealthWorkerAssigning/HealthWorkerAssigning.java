    package com.amar.covid19telangana.HealthWorkerAssigning;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.AdapterView;
    import android.widget.ArrayAdapter;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.RadioButton;
    import android.widget.Spinner;
    import android.widget.Toast;

    import com.amar.covid19telangana.R;
    import com.amar.covid19telangana.Services.HealthWorkerService;
    import com.amar.covid19telangana.Services.UnorganizedService;
    import com.amar.covid19telangana.Unorganizedworker.UnorganizedMain;

    import java.lang.reflect.Array;
    import java.util.ArrayList;
    import java.util.List;

    import static com.amar.covid19telangana.Util.Constants.HEALTHDOB;
    import static com.amar.covid19telangana.Util.Constants.HEALTHEMAIL;
    import static com.amar.covid19telangana.Util.Constants.HEALTHNATIONALITY;
    import static com.amar.covid19telangana.Util.Constants.HEALTHRESUME;
    import static com.amar.covid19telangana.Util.Constants.HEALTHTYPE;
    import static com.amar.covid19telangana.Util.Constants.LIVING;
    import static com.amar.covid19telangana.Util.Constants.PAID;
    import static com.amar.covid19telangana.Util.Constants.RETIRED;
    import static com.amar.covid19telangana.Util.Constants.SPECIALITY;
    import static com.amar.covid19telangana.Util.Constants.SUBSPECIALITY;

    public class HealthWorkerAssigning extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

        String paid,retired,living,item;
        Spinner spinner;
        EditText speciality,subspeciality,healthemail,healthresume,healthdob,healthnationality;
        Button btnsubmit;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_health_worker_assigning);

            spinner = (Spinner) findViewById(R.id.spinner);
            speciality = (EditText) findViewById(R.id.speciality);
            subspeciality = (EditText) findViewById(R.id.subspeciality);
            healthemail = (EditText) findViewById(R.id.healthemail);
            healthresume = (EditText) findViewById(R.id.healthresume);
            healthdob = (EditText) findViewById(R.id.healthdob);
            healthnationality = (EditText) findViewById(R.id.healthnationality);
            btnsubmit = (Button)  findViewById(R.id.healthsubmit);


            spinner.setOnItemSelectedListener(this);
            List<String> categories = new ArrayList<String>();
            categories.add("Physician");
            categories.add("Nurse");
            categories.add("Allied Health");
            categories.add("Dentist");
            categories.add("Pharmacist - Allied Heath Profesional");


            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner.setAdapter(dataAdapter);

            spinner.getSelectedItem();

            btnsubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(HealthWorkerAssigning.this, HealthWorkerService.class);

                    Bundle bundle = new Bundle();
                    bundle.putString(HEALTHTYPE,item);
                    bundle.putString(SPECIALITY,speciality.getText().toString());
                    bundle.putString(SUBSPECIALITY,subspeciality.getText().toString());
                    bundle.putString(HEALTHEMAIL,healthemail.getText().toString());
                    bundle.putString(HEALTHRESUME,healthresume.getText().toString());
                    bundle.putString(HEALTHDOB,healthdob.getText().toString());
                    bundle.putString(HEALTHNATIONALITY,healthnationality.getText().toString());
                    bundle.putString(PAID,paid);
                    bundle.putString(LIVING,living);
                    bundle.putString(RETIRED,retired);
                    intent.putExtras(bundle);
                    startService(intent);

                }
            });







        }

        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            // On selecting a spinner item
             item = parent.getItemAtPosition(position).toString();

            // Showing selected spinner item
            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }

        public void onRadioButtonVolunteer(View view) {
            boolean checked = ((RadioButton) view).isChecked();

            switch(view.getId()) {
                case R.id.paidradio:
                    if (checked)

                        paid = "Paid";

                    break;
                case R.id.unpaidradio:
                    if (checked)

                        paid = "UnPaid";

                    break;
            }
        }

        public void onRadioButtonLiving(View view) {
            boolean checked = ((RadioButton) view).isChecked();

            switch(view.getId()) {
                case R.id.yesradioliving:
                    if (checked)

                        living= "Yes";

                    break;
                case R.id.noradioliving:
                    if (checked)

                        living = "No";

                    break;
            }
        }

        public void onRadioButtonRetired(View view) {
            boolean checked = ((RadioButton) view).isChecked();

            switch(view.getId()) {
                case R.id.yesradioretired:
                    if (checked)

                        retired = "Yes";

                    break;
                case R.id.noradioretired:
                    if (checked)

                        retired = "No";

                    break;
            }
        }
    }