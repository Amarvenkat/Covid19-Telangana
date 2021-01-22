package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.ViewHolder.RecyclerViewHolder;

import java.util.ArrayList;

public class SeniorAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

        LayoutInflater inflater;
        Context context;
        int details;
    ArrayList<String> seniorcity = new ArrayList<String>();
    ArrayList<String> seniorcontact = new ArrayList<String>();
    ArrayList<String> seniordescription = new ArrayList<String>();
    ArrayList<String> seniornameoforganization = new ArrayList<String>();
    ArrayList<String> seniorphone = new ArrayList<String>();


    public SeniorAdapter(ArrayList<String> seniorcity, ArrayList<String> seniorcontact, ArrayList<String> seniordescription, ArrayList<String> seniornameoforganization, ArrayList<String> seniorphone, int details, Context applicationContext) {

        this.context= applicationContext;
        this.details = details;
        this.seniorcity = seniorcity;
        this.seniorcontact = seniorcontact;
        this.seniordescription = seniordescription;
        this.seniornameoforganization = seniornameoforganization;
        this.seniorphone = seniorphone;

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


        holder.textCity.setText(seniorcity.get(position));
        holder.textContact.setText(seniorcontact.get(position));
        holder.textDescription.setText(seniordescription.get(position));
        holder.textOrganization.setText(seniornameoforganization.get(position));
        holder.textPhone.setText(seniorphone.get(position));


    }

    @Override
    public int getItemCount() {
        return seniorcity.size();
    }


}
