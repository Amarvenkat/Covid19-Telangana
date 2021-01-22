package com.amar.covid19telangana.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

  public   TextView textCity,textContact,textDescription,textOrganization,textPhone;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        textCity = (TextView) itemView.findViewById(R.id.textcity);
        textContact = (TextView) itemView.findViewById(R.id.textcontact);
        textDescription =(TextView) itemView.findViewById(R.id.textdescription);
        textOrganization = (TextView) itemView.findViewById(R.id.textorgname);
        textPhone = (TextView) itemView.findViewById(R.id.textphone);


    }
}
