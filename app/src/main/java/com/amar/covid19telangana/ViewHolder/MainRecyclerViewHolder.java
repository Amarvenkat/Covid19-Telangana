package com.amar.covid19telangana.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class MainRecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView recyclerTitleMain,recyclerDescMain;
    public ImageView recyclerImageMain;
    public CardView cardView;

    public MainRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        recyclerTitleMain = (TextView) itemView.findViewById(R.id.recycler_title);
        recyclerDescMain = (TextView) itemView.findViewById(R.id.recycler_desc);
        recyclerImageMain = (ImageView) itemView.findViewById(R.id.recycler_image);
        cardView = (CardView) itemView.findViewById(R.id.cardclick);
    }
}
