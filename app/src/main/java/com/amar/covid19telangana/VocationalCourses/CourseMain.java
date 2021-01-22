package com.amar.covid19telangana.VocationalCourses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.amar.covid19telangana.Adapters.CourseMainAdapter;
import com.amar.covid19telangana.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CourseMain extends AppCompatActivity {

    RecyclerView coursemainrecycler;
    ArrayList<Integer> coursenamelist = new ArrayList<Integer>();
    ArrayList<Integer> courseimglist = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_main);

        coursemainrecycler = (RecyclerView) findViewById(R.id.coursemainrecycler);

        coursenamelist.add(R.string.school_students);
        coursenamelist.add(R.string.online_courses);
        coursenamelist.add(R.string.language);
        coursenamelist.add(R.string.novel);
        coursenamelist.add(R.string.cookery);

        courseimglist.add(R.drawable.school);
        courseimglist.add(R.drawable.onlinecourse);
        courseimglist.add(R.drawable.lang);
        courseimglist.add(R.drawable.book);
        courseimglist.add(R.drawable.cookery);



        CourseMainAdapter courseMainAdapter  = new CourseMainAdapter(getApplicationContext(),courseimglist,coursenamelist);
        coursemainrecycler.setAdapter(courseMainAdapter);
        coursemainrecycler.setLayoutManager(new GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,false));







    }
}
