package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.RetrofitClass.Articles;
import com.amar.covid19telangana.ViewHolder.NewsMainViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsAdapterMain extends RecyclerView.Adapter<NewsMainViewHolder> {

    private static final String NEWSTITLE ="newstitle" ;
    private static final String NEWSDESCRIPTION ="newsdescription" ;
    private static final String NEWSCONTENT = "newscontent";
    private static final String NEWSAUTHORNAME = "newsauthorname";
    private static final String NEWSNAME = "newsname";
    private Context context;
private List<Articles> articles;
private int newscard;
LayoutInflater inflater;
private static final String NEWSIMAGEURL = "newsimageurl";
    public NewsAdapterMain(Context context, List<Articles> articles, int newscard) {

        this.context =context;
        this.articles = articles;
        this.newscard = newscard;

        inflater = LayoutInflater.from(context);

    }


    @NonNull
    @Override
    public NewsMainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(newscard,parent,false);
        NewsMainViewHolder newsMainViewHolder = new NewsMainViewHolder(view);

        return newsMainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final NewsMainViewHolder holder, int position) {


        holder.newsmainntitle.setText(articles.get(position).getNewstitle().toString());
        Picasso.with(context).load(articles.get(position).getNewsimageurl()).fit().into(holder.newsmainimg);


        holder.newsmaincard.setTag(holder);
        holder.newsmaincard.setOnClickListener(clickListner);


    }

    View.OnClickListener clickListner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            NewsMainViewHolder viewHolder = (NewsMainViewHolder) view.getTag();
            int position = viewHolder.getPosition();

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(articles.get(position).getNewsurl()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent);

        }
    };

    @Override
    public int getItemCount() {
        return 20;
    }
}
