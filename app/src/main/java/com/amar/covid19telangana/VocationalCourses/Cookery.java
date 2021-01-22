package com.amar.covid19telangana.VocationalCourses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.Adapters.CourseAdapter;
import com.amar.covid19telangana.R;

import java.util.ArrayList;

public class Cookery extends AppCompatActivity {

    ArrayList<Integer> cookerytitle = new ArrayList<Integer>();
    ArrayList<Integer> cookeryimg = new ArrayList<Integer>();
    ArrayList<String> cookeryurl = new ArrayList<String>();
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookery);

        recyclerView = (RecyclerView) findViewById(R.id.cookery_recycler);

        cookerytitle.add(R.string.nishamadhulika);
        cookerytitle.add(R.string.sanjeev_kapoor);
        cookerytitle.add(R.string.vah_reh_vah);

        cookeryimg.add(R.string.n);
        cookeryimg.add(R.string.s);
        cookeryimg.add(R.string.v);

        cookeryurl.add("https://nishamadhulika.com/");
        cookeryurl.add("https://www.sanjeevkapoor.com/Restaurants/Khazana ");
        cookeryurl.add("https://www.vahrehvah.com/");

        CourseAdapter courseAdapter = new CourseAdapter(getApplicationContext(),cookerytitle,cookeryimg,cookeryurl);
        recyclerView.setAdapter(courseAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
