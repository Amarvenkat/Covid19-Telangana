package com.amar.covid19telangana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.Adapters.HelplineAdapter;

import java.util.ArrayList;

public class Helpline extends AppCompatActivity {

    ArrayList<Integer> statehelpline = new ArrayList<Integer>();
    ArrayList<String> statenumber = new ArrayList<String>();
    RecyclerView helplinerecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);

        helplinerecycler = (RecyclerView) findViewById(R.id.helplinerecycler);
        statehelpline.add(R.string.state1);
        statehelpline.add(R.string.state2);
        statehelpline.add(R.string.state3);
        statehelpline.add(R.string.state4);
        statehelpline.add(R.string.state5);
        statehelpline.add(R.string.state6);
        statehelpline.add(R.string.state7);
        statehelpline.add(R.string.state8);
        statehelpline.add(R.string.state9);
        statehelpline.add(R.string.state10);
        statehelpline.add(R.string.state11);
        statehelpline.add(R.string.state12);
        statehelpline.add(R.string.state13);
        statehelpline.add(R.string.state14);
        statehelpline.add(R.string.state15);
        statehelpline.add(R.string.state16);
        statehelpline.add(R.string.state17);
        statehelpline.add(R.string.state18);
        statehelpline.add(R.string.state19);
        statehelpline.add(R.string.state20);
        statehelpline.add(R.string.state21);
        statehelpline.add(R.string.state22);
        statehelpline.add(R.string.state23);
        statehelpline.add(R.string.state24);
        statehelpline.add(R.string.state25);
        statehelpline.add(R.string.state26);
        statehelpline.add(R.string.state27);
        statehelpline.add(R.string.state28);
        statehelpline.add(R.string.state29);
        statehelpline.add(R.string.state30);
        statehelpline.add(R.string.state31);
        statehelpline.add(R.string.state32);
        statehelpline.add(R.string.state33);
        statehelpline.add(R.string.state34);
        statehelpline.add(R.string.state35);


        statenumber.add("03192-232102");
        statenumber.add("0866-2410978");
        statenumber.add("9436055743");
        statenumber.add("6913347770");
        statenumber.add("104");
        statenumber.add("9779558282");
        statenumber.add("011-22307145");
        statenumber.add("104");
        statenumber.add("104");
        statenumber.add("104");
        statenumber.add("104");
        statenumber.add("8558893911");
        statenumber.add("104");
        statenumber.add("01912520982,");
        statenumber.add("104");
        statenumber.add("0471-2552056");
        statenumber.add("01982256462");
        statenumber.add("104");
        statenumber.add("020-26127394");
        statenumber.add("108");
        statenumber.add("3852411668");
        statenumber.add("104");
        statenumber.add("102");
        statenumber.add("7005539653");
        statenumber.add("9439994859");
        statenumber.add("104");
        statenumber.add("104");
        statenumber.add("0141-2225624");
        statenumber.add("104");
        statenumber.add("104");
        statenumber.add("044-29510500");
        statenumber.add("0381-2315879");
        statenumber.add("18001805145");
        statenumber.add("104");
        statenumber.add("03323412600");

        HelplineAdapter helplineAdapter = new HelplineAdapter(getApplicationContext(),statehelpline,statenumber);
        helplinerecycler.setLayoutManager(new LinearLayoutManager(this));
        helplinerecycler.setAdapter(helplineAdapter);


    }
}