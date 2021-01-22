package com.amar.covid19telangana.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class ZoneDistrictsViewHolder extends RecyclerView.ViewHolder {

   public CardView zonedistrictcard;
   public TextView zonedistricttext;

    public ZoneDistrictsViewHolder(@NonNull View itemView) {
        super(itemView);

        zonedistrictcard = (CardView) itemView.findViewById(R.id.zonedistrictcard);
        zonedistricttext = (TextView) itemView.findViewById(R.id.zonedistrictext);

    }
}
