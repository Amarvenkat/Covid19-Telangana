package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.ViewHolder.RecyclerViewHolder;

import java.util.ArrayList;

public class CommunityKitchenAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    LayoutInflater inflater;
    Context context;
    int details;

     ArrayList<String> kitccity = new ArrayList<String>();
     ArrayList<String> kitccontact = new ArrayList<String>();
     ArrayList<String> kitcdescription = new ArrayList<String>();
     ArrayList<String> kitcnameoforganization = new ArrayList<String>();
     ArrayList<String> kitcphone = new ArrayList<String>();


    public CommunityKitchenAdapter(ArrayList<String> kitccity, ArrayList<String> kitccontact, ArrayList<String> kitcdescription, ArrayList<String> kitcnameoforganization, ArrayList<String> kitcphone, int details, Context applicationContext) {

        this.context = applicationContext;
        this.details = details;
        this.kitccity = kitccity;
        this.kitccontact = kitccontact;
        this.kitcdescription = kitcdescription;
        this.kitcnameoforganization = kitcnameoforganization;
        this.kitcphone = kitcphone;

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

        holder.textCity.setText(kitccity.get(position));
        holder.textContact.setText(kitccontact.get(position));
        holder.textDescription.setText(kitcdescription.get(position));
        holder.textOrganization.setText(kitcnameoforganization.get(position));
        holder.textPhone.setText(kitcphone.get(position));

    }

    @Override
    public int getItemCount() {
        return kitccity.size();
    }
}
