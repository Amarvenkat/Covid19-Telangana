package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.ViewHolder.ZoneDistrictsViewHolder;

import java.util.ArrayList;

public class ZoneDistrictsAdapter extends RecyclerView.Adapter<ZoneDistrictsViewHolder> {

    ArrayList<String> zonedistrict = new ArrayList<String>();
    ArrayList<String> zonecolour = new ArrayList<String>();
    Context context;
    LayoutInflater inflater;
    public ZoneDistrictsAdapter(Context context, ArrayList<String> zonedistrict, ArrayList<String> zonecolour) {

        this.context =  context;
        this.zonedistrict = zonedistrict;
        this.zonecolour = zonecolour;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ZoneDistrictsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.zonedistrictholder,parent,false);
        ZoneDistrictsViewHolder zoneDistrictsViewHolder = new ZoneDistrictsViewHolder(view);

        return zoneDistrictsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ZoneDistrictsViewHolder holder, int position) {

        holder.zonedistricttext.setText(zonedistrict.get(position));
        if (zonecolour.get(position).equals("Green")){

            holder.zonedistrictcard.setCardBackgroundColor(Color.GREEN);
        }
        if (zonecolour.get(position).equals("Orange")){

            holder.zonedistrictcard.setCardBackgroundColor(Color.parseColor("#FFA726"));
        }
        if (zonecolour.get(position).equals("Red")){

            holder.zonedistrictcard.setCardBackgroundColor(Color.RED);
        }

    }

    @Override
    public int getItemCount() {
        return zonedistrict.size();
    }
}
