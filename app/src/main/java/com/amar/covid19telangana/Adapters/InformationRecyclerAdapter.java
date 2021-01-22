package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.HealthCare;
import com.amar.covid19telangana.Information.Precation;
import com.amar.covid19telangana.Information.Prevention;
import com.amar.covid19telangana.Information.Symptoms;
import com.amar.covid19telangana.Information.Treatements;
import com.amar.covid19telangana.ViewHolder.InformationRecyclerViewHolder;
import com.amar.covid19telangana.MainActivity;
import com.amar.covid19telangana.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class InformationRecyclerAdapter extends RecyclerView.Adapter<InformationRecyclerViewHolder>{

    ArrayList<Integer> infoimg         = new ArrayList<Integer>();
    ArrayList<Integer> infotitle       = new ArrayList<Integer>();
    ArrayList<Integer> infodescription = new ArrayList<Integer>();
    MainActivity mainActivity;
    LayoutInflater inflater;
    Context context;

    public InformationRecyclerAdapter(HealthCare context, ArrayList<Integer> infoimg, ArrayList<Integer> infotitle, ArrayList<Integer> infodescription) {

        this.context = context;
        this.infotitle = infotitle;
        this.infodescription = infodescription;
        this.infoimg = infoimg;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public InformationRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.recycler_information,parent,false);

        InformationRecyclerViewHolder holder = new InformationRecyclerViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull InformationRecyclerViewHolder holder, int position) {

        holder.infotitle.setText(infotitle.get(position));
        holder.infodescription.setText(infodescription.get(position));
        Picasso.with(context).load(infoimg.get(position)).resize(100,100).into(holder.infoimg);
        holder.infocard.setTag(holder);
        holder.infocard.setOnClickListener(clicklistner);

    }

    View.OnClickListener clicklistner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            InformationRecyclerViewHolder reviewholder = (InformationRecyclerViewHolder) view.getTag();
            int position = reviewholder.getPosition();


            getinformationintent(position);
        }
    };

    @Override
    public int getItemCount() {
        return 4;
    }
    public void getinformationintent(int position){

        switch (position){
            case 0:
                Intent intent = new Intent(this.context, Precation.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

                break;
            case 1:

                Intent intent1 = new Intent(this.context, Symptoms.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this.context, Prevention.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent2);


                break;
            case 3:

                Intent intent3 = new Intent(this.context, Treatements.class);
                intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent3);
                break;


        }


    }

}
