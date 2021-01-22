package com.amar.covid19telangana.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class OnlinecourseRecyclerViewHolder extends RecyclerView.ViewHolder {

   public TextView courseimg,coursetitle;
    public CardView coursecard;
    public OnlinecourseRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        coursecard  = (CardView)  itemView.findViewById(R.id.coursecard);
        courseimg   = (TextView) itemView.findViewById(R.id.courseimg);
        coursetitle = (TextView)  itemView.findViewById(R.id.coursetitle);

    }
}
