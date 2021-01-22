    package com.amar.covid19telangana.Dashboard;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.recyclerview.widget.LinearLayoutManager;
    import androidx.recyclerview.widget.RecyclerView;

    import android.content.Intent;
    import android.os.Bundle;

    import com.amar.covid19telangana.Adapters.ZoneStateAdapter;
    import com.amar.covid19telangana.R;

    import java.util.ArrayList;

    public class ZoneState extends AppCompatActivity {

        ArrayList<Integer> statename = new ArrayList<Integer>();
        RecyclerView zonestaterecycler;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_zone_state);

            zonestaterecycler = (RecyclerView) findViewById(R.id.zonestaterecycler);

            statename.add(R.string.state1);
            statename.add(R.string.state2);
            statename.add(R.string.state3);
            statename.add(R.string.state4);
            statename.add(R.string.state5);
            statename.add(R.string.state6);
            statename.add(R.string.state7);
            statename.add(R.string.state8);
            statename.add(R.string.state9);
            statename.add(R.string.state10);
            statename.add(R.string.state11);
            statename.add(R.string.state12);
            statename.add(R.string.state13);
            statename.add(R.string.state14);
            statename.add(R.string.state15);
            statename.add(R.string.state16);
            statename.add(R.string.state17);
            statename.add(R.string.state18);
            statename.add(R.string.state19);
            statename.add(R.string.state20);
            statename.add(R.string.state21);
            statename.add(R.string.state22);
            statename.add(R.string.state23);
            statename.add(R.string.state24);
            statename.add(R.string.state25);
            statename.add(R.string.state26);
            statename.add(R.string.state27);
            statename.add(R.string.state28);
            statename.add(R.string.state29);
            statename.add(R.string.state30);
            statename.add(R.string.state31);
            statename.add(R.string.state32);
            statename.add(R.string.state33);
            statename.add(R.string.state34);
            statename.add(R.string.state35);

            ZoneStateAdapter zoneStateAdapter  =  new ZoneStateAdapter(this,statename);
            zonestaterecycler.setLayoutManager(new LinearLayoutManager(this));
            zonestaterecycler.setAdapter(zoneStateAdapter);
        }
    }
