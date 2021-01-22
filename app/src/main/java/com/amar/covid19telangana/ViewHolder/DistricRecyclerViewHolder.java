package com.amar.covid19telangana.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class DistricRecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView districtname,districtotal,districactive,districtdeath,districtrecovered;


    public DistricRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);


        districtname = (TextView) itemView.findViewById(R.id.district_name);
        districtotal = (TextView) itemView.findViewById(R.id.district_total);
        districactive =(TextView) itemView.findViewById(R.id.distric_active);
        districtdeath = (TextView) itemView.findViewById(R.id.distric_death);
        districtrecovered = (TextView) itemView.findViewById(R.id.distric_recovered);
    }
}
