package com.amar.covid19telangana.Products;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

class ProductViewHolder extends RecyclerView.ViewHolder {

    public CardView ourProductcard;
    public TextView ourProducttext;
    public ImageView ourProductImg;
    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        ourProductcard = (CardView) itemView.findViewById(R.id.ourproductcard);
        ourProductImg = (ImageView) itemView.findViewById(R.id.ourproductimg);
        ourProducttext = (TextView) itemView.findViewById(R.id.ourproducttext);



    }
}
