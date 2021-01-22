package com.amar.covid19telangana.HealthWorkerAssigning;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

import java.util.ArrayList;

public class HealthWorkerAdapter extends RecyclerView.Adapter<HealthWorkerViewHolder> {

    ArrayList<HealthWorkerPojo> healthworkerlist  = new ArrayList<>();

    public HealthWorkerAdapter(ArrayList<HealthWorkerPojo> healthworkerlist) {

        this.healthworkerlist = healthworkerlist;


    }

    @NonNull
    @Override
    public HealthWorkerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.healthworkerlist,parent,false);
        HealthWorkerViewHolder healthWorkerViewHolder = new HealthWorkerViewHolder(view);

        return healthWorkerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HealthWorkerViewHolder holder, int position) {

        holder.healthworkeraddresstxt.setText(healthworkerlist.get(position).getAddress());
        holder.healthworkerdob.setText(healthworkerlist.get(position).getHealthdob());
        holder.healthworkeremail.setText(healthworkerlist.get(position).getHealthemail());
        holder.healthworkergendertxt.setText(healthworkerlist.get(position).getGender());
        holder.healthworkerhealthresume.setText(healthworkerlist.get(position).getHealthresume());
        holder.healthworkerliving.setText(healthworkerlist.get(position).getLiving());
        holder.healthworkername.setText(healthworkerlist.get(position).getName());
        holder.healthworkernationality.setText(healthworkerlist.get(position).getHealthnationallity());
        holder.healthworkerpaid.setText(healthworkerlist.get(position).getPaid());
        holder.healthworkerphonetxt.setText(healthworkerlist.get(position).getPhoneno());
        holder.healthworkerretired.setText(healthworkerlist.get(position).getRetired());
        holder.healthworkerspeciality.setText(healthworkerlist.get(position).getSpeciality());
        holder.healthworkersubspeciality.setText(healthworkerlist.get(position).getSubspeciality());
        holder.healthworkertype.setText(healthworkerlist.get(position).getHealthtype());
    }

    @Override
    public int getItemCount() {
        return healthworkerlist.size();
    }
}
