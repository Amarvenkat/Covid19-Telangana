package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.DisasterManagement;
import com.amar.covid19telangana.MainActivity;
import com.amar.covid19telangana.RetrofitClass.Accommodation;
import com.amar.covid19telangana.RetrofitClass.Ambulance;
import com.amar.covid19telangana.RetrofitClass.Fire;
import com.amar.covid19telangana.RetrofitClass.FreeFood;
import com.amar.covid19telangana.RetrofitClass.Fundraisers;
import com.amar.covid19telangana.RetrofitClass.GovHelpline;
import com.amar.covid19telangana.RetrofitClass.Hospital;
import com.amar.covid19telangana.RetrofitClass.Other;
import com.amar.covid19telangana.RetrofitClass.Police;
import com.amar.covid19telangana.RetrofitClass.Testinglab;
import com.amar.covid19telangana.RetrofitClass.Transportation;
import com.amar.covid19telangana.ViewHolder.MainRecyclerViewHolder;
import com.amar.covid19telangana.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerViewHolder> {

LayoutInflater inflater;
MainActivity mainActivity;
Context context;
ArrayList<Integer> titlearray = new ArrayList<Integer>();

ArrayList<Integer> decriptionarray = new ArrayList<Integer>();
ArrayList<Integer> iconarray = new ArrayList<Integer>();


    public MainRecyclerAdapter(DisasterManagement mainActivity, ArrayList<Integer> titlearray, ArrayList<Integer> decriptionarray, ArrayList<Integer> iconarray) {

        this.context = mainActivity;
        this.titlearray = titlearray;
        this.decriptionarray = decriptionarray;
        this.iconarray = iconarray;
        inflater = LayoutInflater.from(mainActivity);
    }

    @NonNull
    @Override
    public MainRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.recycler_name,parent,false);

        MainRecyclerViewHolder holder = new MainRecyclerViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainRecyclerViewHolder holder, int position) {

        holder.recyclerTitleMain.setText(titlearray.get(position));
        holder.recyclerDescMain.setText(decriptionarray.get(position));
        Picasso.with(mainActivity).load(iconarray.get(position)).resize(100,120).into(holder.recyclerImageMain);
        holder.cardView.setTag(holder);
        holder.cardView.setOnClickListener(clickListner);
    }
    View.OnClickListener clickListner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            MainRecyclerViewHolder vholder = (MainRecyclerViewHolder) view.getTag();
            int positon = vholder.getPosition();

            getintent(positon);

        }
    };

    @Override
    public int getItemCount() {
        return titlearray.size();
    }

    public void getintent(int position){


        switch (position){

            case 0:
                Intent intent0 = new Intent(this.context, Testinglab.class);
                intent0.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent0);
                break;
            case 1:
                Intent intent1 = new Intent(this.context, FreeFood.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this.context, Fundraisers.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this.context, Hospital.class);
                intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this.context, Police.class);
                intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this.context, GovHelpline.class);
                intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent5);
                break;
            case 6:
                Intent intent6 = new Intent(this.context, Accommodation.class);
                intent6.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent6);
                break;
            case 7:
                Intent intent7 = new Intent(this.context, Transportation.class);
                intent7.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent7);
                break;
            case 8:
                Intent intent8 = new Intent(this.context, Fire.class);
                intent8.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent8);
                break;
            case 9:
                Intent intent9 = new Intent(this.context, Ambulance.class);
                intent9.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent9);
                break;
            case 10:
                Intent intent10 = new Intent(this.context, Other.class);
                intent10.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent10);
                break;


        }
    }

}
