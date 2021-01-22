package com.amar.covid19telangana.Products;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.ViewHolder.RecyclerViewHolder;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;



public class WebproductAdapter extends RecyclerView.Adapter<WebproductViewHolder> {

    ArrayList<String> amazoneimg =new ArrayList<String>();
    ArrayList<String> amazonename =new ArrayList<String>();
    ArrayList<String> amazoneparice = new ArrayList<String>();
    ArrayList<String> amazonelink = new ArrayList<String>();
    Context context;
    public WebproductAdapter(Context applicationContext, ArrayList<String> amazoneimg, ArrayList<String> amazonename, ArrayList<String> amazonelink, ArrayList<String> amazoneparice) {

        this.context = applicationContext;
        this.amazoneimg = amazoneimg;
        this.amazonename = amazonename;
        this.amazonelink = amazonelink;
        this.amazoneparice = amazoneparice;

    }


    @NonNull
    @Override
    public WebproductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.webproductlist,parent,false);
        WebproductViewHolder webproductViewHolder = new WebproductViewHolder(view);

        return webproductViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WebproductViewHolder holder, int position) {

        holder.webproductprice.setText(amazoneparice.get(position));
        holder.webproductname.setText(amazonename.get(position));
        Picasso.with(context).load(amazoneimg.get(position)).fit().into(holder.webproductimg);
        holder.webproductclick.setTag(holder);
        holder.webproductclick.setOnClickListener(clicklistner);


    }


    View.OnClickListener clicklistner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            WebproductViewHolder reviewholder = (WebproductViewHolder) view.getTag();
            int position = reviewholder.getPosition();

            String url = amazonelink.get(position);

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent);

        }
    };

    @Override
    public int getItemCount() {
        return amazoneimg.size();
    }
}
