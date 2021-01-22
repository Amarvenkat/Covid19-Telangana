package com.amar.covid19telangana.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class CourseMainViewHolder  extends RecyclerView.ViewHolder{

    public    CardView  coursecardmain;
    public    ImageView courseimgmain;
    public  TextView  coursetitlemain;

    public CourseMainViewHolder(@NonNull View itemView) {
        super(itemView);

        coursecardmain  = (CardView)  itemView.findViewById(R.id.coursecardmain);
        courseimgmain   = (ImageView) itemView.findViewById(R.id.courseimgmain);
        coursetitlemain = (TextView)  itemView.findViewById(R.id.coursetitlemain);


    }
}
