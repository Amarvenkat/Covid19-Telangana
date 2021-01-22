package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.ViewHolder.CounsellingViewHolder;
import com.amar.covid19telangana.ViewHolder.RecyclerViewHolder;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CounsellingAdapter extends RecyclerView.Adapter<CounsellingViewHolder>{

    ArrayList<String> cimg = new ArrayList<String>();
    ArrayList<String> cweb = new ArrayList<String>();
    ArrayList<String> cname = new ArrayList<String>();
    ArrayList<String> cno = new ArrayList<String>();
    ArrayList<String> clang = new ArrayList<String>();
    Context context;
    public CounsellingAdapter(Context applicationContext, ArrayList<String> cimg, ArrayList<String> cweb, ArrayList<String> cname, ArrayList<String> clang, ArrayList<String> cno) {

        this.context = applicationContext;
        this.cimg = cimg;
        this.clang = clang;
        this.cname = cname;
        this.cweb = cweb;
        this.cno = cno;

    }

    @NonNull
    @Override
    public CounsellingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.counselling_list,parent,false);
        CounsellingViewHolder counsellingViewHolder = new CounsellingViewHolder(view);

        return counsellingViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CounsellingViewHolder holder, int position) {

        holder.clanguage.setText(clang.get(position));
        holder.ctitle.setText(cname.get(position));
        holder.cphone.setText(cno.get(position));
        holder.cmail.setText(cweb.get(position));
        Picasso.with(context).load(cimg.get(position)).fit().into(holder.cimgview);
        holder.cphone.setTag(holder);
        holder.cphone.setOnClickListener(clicklistner);
    }
    View.OnClickListener clicklistner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            CounsellingViewHolder reviewholder = (CounsellingViewHolder) view.getTag();
            int position = reviewholder.getPosition();
            String no = cno.get(position);


            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+no));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);

        }
    };

    @Override
    public int getItemCount() {
        return cimg.size();
    }
}
