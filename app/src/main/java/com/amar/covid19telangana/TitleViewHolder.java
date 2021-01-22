package com.amar.covid19telangana;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class TitleViewHolder extends RecyclerView.ViewHolder {

    TextView titletxt;
    CardView titlebtn;
    ImageView titleimg;
    public TitleViewHolder(@NonNull View itemView) {
        super(itemView);

        titletxt = itemView.findViewById(R.id.titletext);
        titlebtn = itemView.findViewById(R.id.titlebtn);
        titleimg = itemView.findViewById(R.id.titleimg);
    }
}
