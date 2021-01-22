package com.amar.covid19telangana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.Adapters.CounsellingAdapter;

import java.util.ArrayList;

public class Counselling extends AppCompatActivity {

    ArrayList<String> cimg = new ArrayList<String>();
    ArrayList<String> cweb = new ArrayList<String>();
    ArrayList<String> cname = new ArrayList<String>();
    ArrayList<String> cno = new ArrayList<String>();
    ArrayList<String> clang = new ArrayList<String>();
    RecyclerView counsellingrecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselling);

        counsellingrecycler = (RecyclerView) findViewById(R.id.counsellingrecycler);

        cimg.add("https://thelivelovelaughfoundation.org/img/mitram_foundation_logo.png");
        cimg.add("https://thelivelovelaughfoundation.org/img/arpita-foundation-logo-icon.png");
        cimg.add("https://thelivelovelaughfoundation.org/img/sneha_helpline_circle.png");
        cimg.add("https://thelivelovelaughfoundation.org/img/icall_logo.png");
        cimg.add("https://thelivelovelaughfoundation.org/img/sahai_helpline_circle.png");
        cimg.add("https://thelivelovelaughfoundation.org/img/lifeline_helpline_circle.png");
        cimg.add("https://thelivelovelaughfoundation.org/img/sumaitri_helpline_circle.png");
        cimg.add("https://thelivelovelaughfoundation.org/img/cooj_helpline_circle.png");
        cimg.add("https://thelivelovelaughfoundation.org/img/roshni_trust_circle.png");
        cimg.add("https://thelivelovelaughfoundation.org/img/samaritans_mumbai_circle.png");
        cimg.add("https://thelivelovelaughfoundation.org/img/parivarthan_helpline_circle.png");
        cimg.add("https://thelivelovelaughfoundation.org/img/covid19.jpg");

        cweb.add("share@mitramfoundation.org");
        cweb.add("arpita.helpline@gmail.com");
        cweb.add("NA");
        cweb.add("icall@tiss.edu");
        cweb.add("sahaihelpline@gmail.com");
        cweb.add("lifelinekolkata@gmail.com");
        cweb.add("feelingsuicidal@sumaitri.net");
        cweb.add(" YouMatterByCooj@gmail.com");
        cweb.add("roshnihelp@gmail.com");
        cweb.add("talk2samaritans@gmail.com");
        cweb.add("www.parivarthan.org");
        cweb.add("covid19helplineindia@gmail.com");

        cname.add("Mitram Foundation");
        cname.add("Arpita Suicide Prevention Helpline");
        cname.add("Sneha");
        cname.add("iCALL");
        cname.add("Sahai");
        cname.add("Lifeline");
        cname.add("Sumaitri");
        cname.add("COOJ Mental Health Foundation (COOJ)");
        cname.add("Roshni Trust");
        cname.add("Samaritans Mumbai");
        cname.add("Parivarthan");
        cname.add("Covid19 India Helpline");

        cno.add("080-2572-2573");
        cno.add("080 23655557");
        cno.add("044-24640050");
        cno.add("022-25521111 ");
        cno.add("080–25497777 ");
        cno.add("033-24637401");
        cno.add("011-23389090");
        cno.add("0832-2252525");
        cno.add("040-66202000");
        cno.add(" +91 84229 84528");
        cno.add("+91 7676 602 602 ");
        cno.add(" +91 7707 070 002");

        clang.add("English, हिंदी");
        clang.add("English, हिंदी, उर्दू, ಅವುಗಳನ್ನು, தமிழ், తెలుగు, മലയാളം, Konkani, Assamese, ગુજરતી, বাঙালি");
        clang.add(" தமிழ், English");
        clang.add("मराठी, বাঙালি, తెలుగు, हिंदी, English");
        clang.add(" हिंदी, English");
        clang.add(" বাঙালি, हिंदी, English");
        clang.add(" हिंदी, English");
        clang.add("English");
        clang.add("తెలుగు, اردو, हिंदी, English");
        clang.add("मराठी, हिंदी, English");
        clang.add("తెలుగు, മലയാളി");
        clang.add("NA");

        CounsellingAdapter counsellingAdapter = new CounsellingAdapter(getApplicationContext(),cimg,cweb,cname,clang,cno);
        counsellingrecycler.setLayoutManager(new LinearLayoutManager(this));

        counsellingrecycler.setAdapter(counsellingAdapter);

    }
}