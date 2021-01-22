package com.amar.covid19telangana.HealthWorkerAssigning;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class HealthWorkerViewHolder extends RecyclerView.ViewHolder {

public     TextView healthworkername,healthworkerphonetxt,healthworkergendertxt,healthworkeraddresstxt,healthworkeremail,healthworkerdob,healthworkernationality,healthworkerhealthresume;
   public TextView healthworkertype,healthworkerliving,healthworkerpaid,healthworkerretired,healthworkerspeciality,healthworkersubspeciality;
    public HealthWorkerViewHolder(@NonNull View itemView) {
        super(itemView);

         healthworkername = (TextView)itemView.findViewById(R.id.healthworkername);
         healthworkerphonetxt =(TextView) itemView.findViewById(R.id.healthworkerphonetxt);
         healthworkergendertxt = (TextView)itemView.findViewById(R.id.healthworkergendertxt);
         healthworkeraddresstxt = (TextView)itemView.findViewById(R.id.healthworkeraddresstxt);
         healthworkeremail =(TextView) itemView.findViewById(R.id.healthworkeremail);
         healthworkerdob = (TextView)itemView.findViewById(R.id.healthworkerdob);
         healthworkernationality =(TextView) itemView.findViewById(R.id.healthworkernationality);
         healthworkerhealthresume = (TextView)itemView.findViewById(R.id.healthworkerhealthresume);
         healthworkertype =(TextView) itemView.findViewById(R.id.healthworkertype);
         healthworkerliving = (TextView)itemView.findViewById(R.id.healthworkerliving);
         healthworkerpaid =(TextView) itemView.findViewById(R.id.healthworkerpaid);
         healthworkerretired =(TextView) itemView.findViewById(R.id.healthworkerretired);
         healthworkerspeciality = (TextView)itemView.findViewById(R.id.healthworkerspeciality);
         healthworkersubspeciality =(TextView) itemView.findViewById(R.id.healthworkersubspeciality);





    }
}
