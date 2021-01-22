package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.MainActivity;
import com.amar.covid19telangana.R;
import com.amar.covid19telangana.ViewHolder.InformationRecyclerViewHolder;
import com.amar.covid19telangana.ViewHolder.MainGridRecyclerViewHolder;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainGridRecyclerAdapter extends RecyclerView.Adapter<MainGridRecyclerViewHolder> {

    ArrayList<Integer> maingridname    = new ArrayList<Integer>();
    ArrayList<String> maingridimg    = new ArrayList<String>();
    MainActivity mainActivity;
    LayoutInflater inflater;
    Context context;

    public MainGridRecyclerAdapter(MainActivity mainActivity, ArrayList<Integer> maingridname, ArrayList<String> maingridimg) {

        this.mainActivity = mainActivity;
        this.maingridname = maingridname;
        this.maingridimg = maingridimg;
        inflater = LayoutInflater.from(mainActivity);

    }

    @NonNull
    @Override
    public MainGridRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.recycler_grid_card,parent,false);
        MainGridRecyclerViewHolder holder = new MainGridRecyclerViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainGridRecyclerViewHolder holder, int position) {

        holder.main_grid_title.setText(maingridname.get(position));
       // Picasso.with(mainActivity).load(maingridimg.get(position)).resize(100,100).into(holder.main_grid_img);
        holder.main_grid_imga.setAnimation(maingridimg.get(position));
        holder.main_grid_card.setTag(holder);
        holder.main_grid_card.setOnClickListener(clicklistner);


    }

    View.OnClickListener clicklistner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            MainGridRecyclerViewHolder reviewholder = (MainGridRecyclerViewHolder) view.getTag();
            int position = reviewholder.getPosition();

            mainActivity.getmaingridintent(position);
        }
    };

    @Override
    public int getItemCount() {
        return 4;
    }
}
