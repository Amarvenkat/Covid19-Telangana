package com.amar.covid19telangana.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class CounsellingViewHolder extends RecyclerView.ViewHolder {

    public ImageView cimgview;
    public TextView ctitle,cmail,cphone,clanguage;
    public CounsellingViewHolder(@NonNull View itemView) {
        super(itemView);

        cimgview = (ImageView) itemView.findViewById(R.id.cimgview);
        ctitle = (TextView) itemView.findViewById(R.id.ctitle);
        cmail = (TextView) itemView.findViewById(R.id.cmail);
        cphone = (TextView) itemView.findViewById(R.id.cno);
        clanguage = (TextView) itemView.findViewById(R.id.clang);


    }
}
