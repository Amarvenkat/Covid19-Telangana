package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.ViewHolder.CounsellingViewHolder;
import com.amar.covid19telangana.ViewHolder.HelplineViewHolder;

import java.util.ArrayList;

public class HelplineAdapter extends RecyclerView.Adapter<HelplineViewHolder> {

    ArrayList<Integer> statehelpline = new ArrayList<Integer>();
    ArrayList<String> statenumber = new ArrayList<String>();
    Context context;
    public HelplineAdapter(Context applicationContext, ArrayList<Integer> statehelpline, ArrayList<String> statenumber) {

        this.context = applicationContext;
        this.statenumber = statenumber;
        this.statehelpline = statehelpline;

    }

    @NonNull
    @Override
    public HelplineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(context).inflate(R.layout.helplinelist,parent,false);
        HelplineViewHolder helplineViewHolder = new HelplineViewHolder(view);


        return helplineViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HelplineViewHolder holder, int position) {

        holder.statebtn.setText(statehelpline.get(position));
        holder.statebtn.setTag(holder);
        holder.statebtn.setOnClickListener(clicklistner);

    }

    View.OnClickListener clicklistner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            HelplineViewHolder reviewholder = (HelplineViewHolder) view.getTag();
            int position = reviewholder.getPosition();
            String no = statenumber.get(position);


            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+no));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);

        }
    };
    @Override
    public int getItemCount() {
        return statehelpline.size();
    }
}
