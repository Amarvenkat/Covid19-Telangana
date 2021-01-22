package com.amar.covid19telangana.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class NewsMainViewHolder extends RecyclerView.ViewHolder{

    public CardView newsmaincard;
    public TextView newsmainntitle;
    public ImageView newsmainimg;

    public NewsMainViewHolder(@NonNull View itemView) {
        super(itemView);

        newsmaincard = (CardView) itemView.findViewById(R.id.newsmaincard);
        newsmainimg = (ImageView) itemView.findViewById(R.id.newsmainimg);
        newsmainntitle = (TextView) itemView.findViewById(R.id.newsmaintitle);


    }
}
