package com.amar.covid19telangana.Products;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class WebproductViewHolder extends RecyclerView.ViewHolder {

    ImageView webproductimg;
    TextView webproductname,webproductprice;
    LinearLayout webproductclick;
    public WebproductViewHolder(@NonNull View itemView) {
        super(itemView);

        webproductimg = (ImageView) itemView.findViewById(R.id.webproductimgview);
        webproductname = (TextView) itemView.findViewById(R.id.webproductname);
        webproductprice = (TextView) itemView.findViewById(R.id.webproductprice);
        webproductclick = (LinearLayout) itemView.findViewById(R.id.webproductclick);

    }
}
