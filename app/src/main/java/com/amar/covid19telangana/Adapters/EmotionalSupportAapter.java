package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.ViewHolder.RecyclerViewHolder;

import java.util.ArrayList;

public class EmotionalSupportAapter  extends RecyclerView.Adapter<RecyclerViewHolder> {

    LayoutInflater inflater;
    Context context;
    int details;

     ArrayList<String> mentalcity = new ArrayList<String>();
     ArrayList<String> mentalcontact = new ArrayList<String>();
     ArrayList<String> mentaldescription = new ArrayList<String>();
     ArrayList<String> mentalnameoforganization = new ArrayList<String>();
     ArrayList<String> mentalphone = new ArrayList<String>();



    public EmotionalSupportAapter(ArrayList<String> mentalcity, ArrayList<String> mentalcontact, ArrayList<String> mentaldescription, ArrayList<String> mentalnameoforganization, ArrayList<String> mentalphone, int details, Context applicationContext) {

        this.context = applicationContext;
        this.details = details;
        this.mentalcity = mentalcity;
        this.mentalcontact = mentalcontact;
        this.mentaldescription = mentaldescription;
        this.mentalnameoforganization = mentalnameoforganization;
        this.mentalphone = mentalphone;

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


        holder.textCity.setText(mentalcity.get(position));
        holder.textContact.setText(mentalcontact.get(position));
        holder.textDescription.setText(mentaldescription.get(position));
        holder.textOrganization.setText(mentalnameoforganization.get(position));
        holder.textPhone.setText(mentalphone.get(position));

    }


    @Override
    public int getItemCount() {
        return mentalcity.size();
    }
}
