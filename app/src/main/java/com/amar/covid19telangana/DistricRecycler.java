package com.amar.covid19telangana;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.ViewHolder.DistricRecyclerViewHolder;

import java.util.ArrayList;

public class DistricRecycler extends RecyclerView.Adapter<DistricRecyclerViewHolder>{

    Context context;
    ArrayList<Integer>  districname      = new ArrayList<Integer>();
    ArrayList<Integer> districactive    = new ArrayList<Integer>();
    ArrayList<Integer> districconfirmed = new ArrayList<Integer>();
    ArrayList<Integer> districdeceased  = new ArrayList<Integer>();
    ArrayList<Integer> districrecovered = new ArrayList<Integer>();


    public DistricRecycler(Context telanganaStateWiseCallback, ArrayList<Integer> districname, ArrayList<Integer> districactive, ArrayList<Integer> districconfirmed, ArrayList<Integer> districdeceased, ArrayList<Integer> districrecovered) {

        this.context = telanganaStateWiseCallback;
        this.districname = districname;
        this.districactive = districactive;
        this.districconfirmed = districconfirmed;
        this.districdeceased = districdeceased;
        this.districrecovered = districrecovered;

    }

    @NonNull
    @Override
    public DistricRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.district_layout, parent, false);
        DistricRecyclerViewHolder districRecyclerViewHolder = new DistricRecyclerViewHolder(view);

        return districRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DistricRecyclerViewHolder holder, int position) {


        holder.districtname.setText(districname.get(position));
        holder.districtotal.setText(districconfirmed.get(position).toString());
        holder.districtrecovered.setText(districrecovered.get(position).toString());
        holder.districtdeath.setText(districdeceased.get(position).toString());
        holder.districactive.setText(districactive.get(position).toString());



    }

    @Override
    public int getItemCount() {
        return districname.size();
    }
}
