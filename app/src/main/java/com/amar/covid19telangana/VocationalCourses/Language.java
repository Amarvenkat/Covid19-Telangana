package com.amar.covid19telangana.VocationalCourses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.Adapters.CourseAdapter;
import com.amar.covid19telangana.R;

import java.util.ArrayList;

public class Language extends AppCompatActivity {

    ArrayList<Integer> languagetitle = new ArrayList<Integer>();
    ArrayList<Integer> languageimg = new ArrayList<Integer>();
    ArrayList<String> languageurl = new ArrayList<String>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        recyclerView = (RecyclerView) findViewById(R.id.language_recycler);

        languagetitle.add(R.string.duolingo);
        languagetitle.add(R.string.open_culture);
        languagetitle.add(R.string.live_mocha);
        languagetitle.add(R.string.babbel);

        languageimg.add(R.string.d);
        languageimg.add(R.string.o);
        languageimg.add(R.string.l);
        languageimg.add(R.string.b);

        languageurl.add("https://www.duolingo.com/");
        languageurl.add("http://www.openculture.com/freelanguagelessons");
        languageurl.add("https://www.livemocha.co/");
        languageurl.add("https://www.babbel.com/");

        CourseAdapter courseAdapter = new CourseAdapter(getApplicationContext(),languagetitle,languageimg,languageurl);
        recyclerView.setAdapter(courseAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
