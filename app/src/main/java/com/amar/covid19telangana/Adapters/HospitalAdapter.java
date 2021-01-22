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

public class HospitalAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    LayoutInflater inflater;
    Context context;
    int details;


     ArrayList<String> hospcity = new ArrayList<String>();
     ArrayList<String> hospcontact = new ArrayList<String>();
     ArrayList<String> hospdescription = new ArrayList<String>();
     ArrayList<String> hospnameoforganization = new ArrayList<String>();
     ArrayList<String> hospphone = new ArrayList<String>();


    public HospitalAdapter(ArrayList<String> hospcity, ArrayList<String> hospcontact, ArrayList<String> hospdescription, ArrayList<String> hospnameoforganization, ArrayList<String> hospphone, int details, Context applicationContext) {


        this.context = applicationContext;
        this.details = details;
        this.hospcity = hospcity;
        this.hospcontact = hospcontact;
        this.hospdescription = hospdescription;
        this.hospnameoforganization = hospnameoforganization;
        this.hospphone = hospphone;


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

        holder.textCity.setText(hospcity.get(position));
        holder.textContact.setText(hospcontact.get(position));
        holder.textDescription.setText(hospdescription.get(position));
        holder.textOrganization.setText(hospnameoforganization.get(position));
        holder.textPhone.setText(hospphone.get(position));
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
            String no = hospphone.get(position);

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

            String url = hospcontact.get(position);

            Toast.makeText(context,"Redirecting to"+url,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent);

        }
    };


    @Override
    public int getItemCount() {
        return hospcity.size();
    }
}
