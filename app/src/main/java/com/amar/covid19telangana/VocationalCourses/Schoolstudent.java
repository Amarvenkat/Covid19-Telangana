package com.amar.covid19telangana.VocationalCourses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.Adapters.CourseAdapter;
import com.amar.covid19telangana.R;

import java.util.ArrayList;

public class Schoolstudent extends AppCompatActivity {

    ArrayList<Integer> schooltitle = new ArrayList<Integer>();
    ArrayList<Integer> schoolimg = new ArrayList<Integer>();
    ArrayList<String> schoolurl = new ArrayList<String>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schoolstudent);

        recyclerView = (RecyclerView) findViewById(R.id.school_recycler);

        schooltitle.add(R.string.meritnation);
        schooltitle.add(R.string.byjus);
        schooltitle.add(R.string.cbse_online);
        schooltitle.add(R.string.topper_learning);

        schoolimg.add(R.string.m);
        schoolimg.add(R.string.b);
        schoolimg.add(R.string.c);
        schoolimg.add(R.string.t);

        schoolurl.add("https://www.meritnation.com/");
        schoolurl.add("https://byjus.com/");
        schoolurl.add("https://cbse.online/ ");
        schoolurl.add("https://www.topperlearning.com/ ");


        CourseAdapter courseAdapter = new CourseAdapter(getApplicationContext(),schooltitle,schoolimg,schoolurl);
        recyclerView.setAdapter(courseAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
