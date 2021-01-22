package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.ViewHolder.RecyclerViewHolder;

import java.util.ArrayList;

public class MedicalAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    LayoutInflater inflater;
    Context context;
    int details;


     ArrayList<String> medicalcity = new ArrayList<String>();
     ArrayList<String> medicalcontact = new ArrayList<String>();
     ArrayList<String> medicaldescription = new ArrayList<String>();
     ArrayList<String> medicalnameoforganization = new ArrayList<String>();
     ArrayList<String> medicalphone = new ArrayList<String>();
    public MedicalAdapter(ArrayList<String> medicalcity, ArrayList<String> medicalcontact, ArrayList<String> medicaldescription, ArrayList<String> medicalnameoforganization, ArrayList<String> medicalphone, int details, Context applicationContext) {

        this.context = applicationContext;
        this.details = details;
        this.medicalcity = medicalcity;
        this.medicalcontact = medicalcontact;
        this.medicaldescription = medicaldescription;
        this.medicalnameoforganization = medicalnameoforganization;
        this.medicalphone = medicalphone;

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


        holder.textCity.setText(medicalcity.get(position));
        holder.textContact.setText(medicalcontact.get(position));
        holder.textDescription.setText(medicaldescription.get(position));
        holder.textOrganization.setText(medicalnameoforganization.get(position));
        holder.textPhone.setText(medicalphone.get(position));


    }

    @Override
    public int getItemCount() {
        return medicalcity.size();
    }
}
