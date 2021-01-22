package com.amar.covid19telangana.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class InformationRecyclerViewHolder extends RecyclerView.ViewHolder {
    public CardView infocard;
    public TextView infotitle;
    public TextView infodescription;
    public ImageView infoimg;

    public InformationRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        infocard = (CardView) itemView.findViewById(R.id.infocard);
        infoimg = (ImageView) itemView.findViewById(R.id.infoimage);
        infotitle = (TextView) itemView.findViewById(R.id.infotitle);
        infodescription = (TextView) itemView.findViewById(R.id.infodescription);


    }
}
