package com.amar.covid19telangana.VocationalCourses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.Adapters.CourseAdapter;
import com.amar.covid19telangana.R;

import java.util.ArrayList;

public class Onlinecourse extends AppCompatActivity {

    ArrayList<Integer> onlinecouresetitle = new ArrayList<Integer>();
    ArrayList<Integer> onlinecoureseimg = new ArrayList<Integer>();
    ArrayList<String> onlinecoureseurl = new ArrayList<String>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onlinecourse);

        recyclerView = (RecyclerView) findViewById(R.id.online_course_recycle) ;

        onlinecouresetitle.add(R.string.edureka);
        onlinecouresetitle.add(R.string.coursera);
        onlinecouresetitle.add(R.string.khanacademy);
        onlinecouresetitle.add(R.string.udemy);
        onlinecouresetitle.add(R.string.edx);

        onlinecoureseimg.add(R.string.e);
        onlinecoureseimg.add(R.string.c);
        onlinecoureseimg.add(R.string.k);
        onlinecoureseimg.add(R.string.u);
        onlinecoureseimg.add(R.string.e);

        onlinecoureseurl.add("https://www.edureka.co/");
        onlinecoureseurl.add("https://www.coursera.org/");
        onlinecoureseurl.add("https://www.khanacademy.org/");
        onlinecoureseurl.add("https://www.udemy.com/");
        onlinecoureseurl.add("https://www.edx.org/");




        CourseAdapter courseAdapter = new CourseAdapter(getApplicationContext(),onlinecouresetitle,onlinecoureseimg,onlinecoureseurl);
        recyclerView.setAdapter(courseAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }
}
