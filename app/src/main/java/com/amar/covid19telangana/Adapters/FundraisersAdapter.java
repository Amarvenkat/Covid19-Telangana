package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.ViewHolder.RecyclerViewHolder;

import java.util.ArrayList;

public class FundraisersAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {


    LayoutInflater inflater;
    Context context;
    int details;

    ArrayList<String> fundcity = new ArrayList<String>();
    ArrayList<String> fundcontact = new ArrayList<String>();
    ArrayList<String> funddescription = new ArrayList<String>();
    ArrayList<String> fundnameoforganization = new ArrayList<String>();
    ArrayList<String> fundphone = new ArrayList<String>();


    public FundraisersAdapter(ArrayList<String> fundcity, ArrayList<String> fundcontact, ArrayList<String> funddescription, ArrayList<String> fundnameoforganization, ArrayList<String> fundphone, int details, Context applicationContext) {

    this.context = applicationContext;
    this.fundcity = fundcity;
    this.fundcontact = fundcontact;
    this.funddescription = funddescription;
    this.fundnameoforganization  = fundnameoforganization;
    this.fundphone = fundphone;
    this.details = details;

    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(details, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);


        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        holder.textCity.setText(fundcity.get(position));
        holder.textContact.setText(fundcontact.get(position));
        holder.textDescription.setText(funddescription.get(position));
        holder.textOrganization.setText(fundnameoforganization.get(position));
        holder.textPhone.setText(fundphone.get(position));

        holder.textContact.setTag(holder);
        holder.textPhone.setTag(holder);
        holder.textPhone.setOnClickListener(clicklistner);
        holder.textContact.setOnClickListener(listener);
    }
    View.OnClickListener clicklistner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            RecyclerViewHolder reviewholder = (RecyclerViewHolder) view.getTag();
            int position = reviewholder.getPosition();
            String no = fundphone.get(position);

            Log.d("Tag" ,"Phone no "+no);

            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+no));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);

        }
    };

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            RecyclerViewHolder reviewholder = (RecyclerViewHolder) view.getTag();
            int position = reviewholder.getPosition();

            String url = fundcontact.get(position);

            Toast.makeText(context,"Redirecting to"+url,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent);

        }
    };


    @Override
    public int getItemCount() {
        return fundcity.size();
    }
}
