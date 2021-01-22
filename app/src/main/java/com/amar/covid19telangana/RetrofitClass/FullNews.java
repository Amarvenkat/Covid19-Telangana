package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.amar.covid19telangana.R;
import com.squareup.picasso.Picasso;

public class FullNews extends AppCompatActivity {

    private static final String NEWSTITLE ="newstitle" ;
    private static final String NEWSDESCRIPTION ="newsdescription" ;
    private static final String NEWSCONTENT = "newscontent";
    private static final String NEWSAUTHORNAME = "newsauthorname";
    private static final String NEWSNAME = "newsname";
    private static final String NEWSIMAGEURL = "newsimageurl";
    Context context;
    ImageView fullnewsimg;
    TextView fullnewstitle,fullnewsdescription,fullnewscontent,fullnewsauthorname,fullnewsname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_news);

        fullnewsimg = (ImageView) findViewById(R.id.fullnewsimg);
        fullnewstitle = (TextView) findViewById(R.id.fullnewstitle);
        fullnewsdescription = (TextView) findViewById(R.id.fullnewsdescription);
        fullnewscontent = (TextView) findViewById(R.id.fullnewscontent);
        fullnewsauthorname = (TextView) findViewById(R.id.fullnewsauthorname);
        fullnewsname = (TextView) findViewById(R.id.fullnewsname);



        Bundle bundle   = getIntent().getExtras();
        String url      = bundle.getString(NEWSIMAGEURL);
        String newstitle = bundle.getString(NEWSTITLE);
        String newsdescription = bundle.getString(NEWSDESCRIPTION);
        String newscontent = bundle.getString(NEWSCONTENT);
        final String newsauthorname = bundle.getString(NEWSAUTHORNAME);
        String newsname = bundle.getString(NEWSNAME);

        fullnewstitle.setText(newstitle);
        fullnewsdescription.setText(newsdescription);
        fullnewscontent.setText(newscontent);
        fullnewsauthorname.setText(newsauthorname);
        fullnewsname.setText(newsname);

        fullnewsauthorname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(newsauthorname));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(intent);
            }
        });

     //   Toast.makeText(this,""+url,Toast.LENGTH_LONG).show();
        Picasso.with(getApplicationContext()).load(url).fit().into(fullnewsimg);



    }
}
