package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.ViewHolder.ZoneStateViewHolder;
import com.amar.covid19telangana.Dashboard.ZoneDistricts;
import com.amar.covid19telangana.Dashboard.ZoneState;

import java.util.ArrayList;

public class ZoneStateAdapter extends RecyclerView.Adapter<ZoneStateViewHolder> {

    private static final String STRINGSTATE = "statename";
    ArrayList<Integer> statename = new ArrayList<Integer>();
    ArrayList<String>  stringstate = new ArrayList<String>();
    Context context;
    public ZoneStateAdapter(ZoneState zoneState, ArrayList<Integer> statename) {

        this.context = zoneState;
        this.statename = statename;

    }

    @NonNull
    @Override
    public ZoneStateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.zonestatelist,parent,false);
        ZoneStateViewHolder viewHolder = new ZoneStateViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ZoneStateViewHolder holder, int position) {


        holder.btnstate.setText(statename.get(position));
        holder.btnstate.setTag(holder);
        holder.btnstate.setOnClickListener(clickListner);

    }

    View.OnClickListener clickListner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            ZoneStateViewHolder viewHolder = (ZoneStateViewHolder) view.getTag();
            int position = viewHolder.getPosition();

            stringstate.add("Andaman and Nicobar Islands");
            stringstate.add("Andhra Pradesh");
            stringstate.add("Arunachal Pradesh");
            stringstate.add("Assam");
            stringstate.add("Bihar");
            stringstate.add("Chhattisgarh");
            stringstate.add("Delhi");
            stringstate.add("Dadra and Nagar Haveli and Daman and Diu");
            stringstate.add("Goa");
            stringstate.add("Gujarat");
            stringstate.add("Himachal Pradesh");
            stringstate.add("Haryana");
            stringstate.add("Jharkhand");
            stringstate.add("Jammu and Kashmir");
            stringstate.add("Karnataka");
            stringstate.add("Kerala");
            stringstate.add("Ladakh");
            stringstate.add("Lakshadweep");
            stringstate.add("Maharashtra");
            stringstate.add("Meghalaya");
            stringstate.add("Manipur");
            stringstate.add("Madhya Pradesh");
            stringstate.add("Mizoram");
            stringstate.add("Nagaland");
            stringstate.add("Odisha");
            stringstate.add("Punjab");
            stringstate.add("Puducherry");
            stringstate.add("Rajasthan");
            stringstate.add("Sikkim");
            stringstate.add("Telangana");
            stringstate.add("Tamil Nadu");
            stringstate.add("Tripura");
            stringstate.add("Uttar Pradesh");
            stringstate.add("Uttarakhand");
            stringstate.add("West Bengal");


            Bundle bundle = new Bundle();

            Log.d("Tag",""+position);


            String state = (stringstate.get(position));

            bundle.putString(STRINGSTATE, state);

            Intent intent = new Intent(context, ZoneDistricts.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtras(bundle);
            context.startActivity(intent);

        }
    };

    @Override
    public int getItemCount() {
        return statename.size();
    }
}
