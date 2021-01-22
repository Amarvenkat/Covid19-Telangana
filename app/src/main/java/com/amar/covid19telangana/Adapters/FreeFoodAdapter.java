package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.ViewHolder.RecyclerViewHolder;

import java.util.ArrayList;


public class FreeFoodAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    LayoutInflater inflater;
    Context context;
    int details;


    ArrayList<String> foodcity = new ArrayList<String>();
    ArrayList<String> foodcontact = new ArrayList<String>();
    ArrayList<String> fooddescription = new ArrayList<String>();
    ArrayList<String> foodnameoforganization = new ArrayList<String>();
    ArrayList<String> foodphone = new ArrayList<String>();


    public FreeFoodAdapter(ArrayList<String> foodcity, ArrayList<String> foodcontact, ArrayList<String> fooddescription, ArrayList<String> foodnameoforganization, ArrayList<String> foodphone, int details, Context applicationContext) {

    this.context = applicationContext;
    this.details = details;
    this.foodcity = foodcity;
    this.foodcontact = foodcontact;
    this.fooddescription = fooddescription;
    this.foodnameoforganization = foodnameoforganization;
    this.foodphone = foodphone;

    }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(details, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);


        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        holder.textCity.setText(foodcity.get(position));
        holder.textContact.setText(foodcontact.get(position));
        holder.textDescription.setText(fooddescription.get(position));
        holder.textOrganization.setText(foodnameoforganization.get(position));
        holder.textPhone.setText(foodphone.get(position));

        holder.textContact.setTag(holder);
        holder.textPhone.setTag(holder);
        holder.textPhone.setOnClickListener(clicklistner);
        holder.textContact.setOnClickListener(listener);
    }
    View.OnClickListener clicklistner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            RecyclerViewHolder reviewholder = (RecyclerViewHolder) view.getTag();
            int position = reviewholder.getPosition();
            String no = foodphone.get(position);

            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+no));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);

        }
    };

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            RecyclerViewHolder reviewholder = (RecyclerViewHolder) view.getTag();
            int position = reviewholder.getPosition();

            String url = foodcontact.get(position);

            Toast.makeText(context,"Redirecting to"+url,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent);

        }
    };



    @Override
    public int getItemCount() {
        return foodcity.size();
    }
}
