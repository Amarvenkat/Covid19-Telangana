package com.amar.covid19telangana.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.amar.covid19telangana.R;

public class MainGridRecyclerViewHolder extends RecyclerView.ViewHolder {
    public CardView main_grid_card;
    public TextView main_grid_title;
     ImageView main_grid_img;
    public LottieAnimationView main_grid_imga;

    public MainGridRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        main_grid_card = (CardView) itemView.findViewById(R.id.main_grid_card);
        main_grid_imga = (LottieAnimationView) itemView.findViewById(R.id.main_grid_image);
        main_grid_title = (TextView) itemView.findViewById(R.id.main_grid_title);


    }
}
