package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.ViewHolder.RecyclerViewHolder;

import java.util.ArrayList;

public class AmbulanceAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

        LayoutInflater inflater;
        Context context;
        int details;

     ArrayList<String> ambucity = new ArrayList<String>();
     ArrayList<String> ambucontact = new ArrayList<String>();
     ArrayList<String> ambudescription = new ArrayList<String>();
     ArrayList<String> ambunameoforganization = new ArrayList<String>();
     ArrayList<String> ambuphone = new ArrayList<String>();


    public AmbulanceAdapter(ArrayList<String> ambucity, ArrayList<String> ambucontact, ArrayList<String> ambudescription, ArrayList<String> ambunameoforganization, ArrayList<String> ambuphone, int details, Context applicationContext) {

        this.context = applicationContext;
        this.details = details;
        this.ambucity = ambucity;
        this.ambucontact = ambucontact;
        this.ambudescription = ambudescription;
        this.ambunameoforganization = ambunameoforganization;
        this.ambuphone = ambuphone;


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

        holder.textCity.setText(ambucity.get(position));
        holder.textContact.setText(ambucontact.get(position));
        holder.textDescription.setText(ambudescription.get(position));
        holder.textOrganization.setText(ambunameoforganization.get(position));
        holder.textPhone.setText(ambuphone.get(position));
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
            String no = ambuphone.get(position);

            Log.d("Tag" ,"Phone no "+no);

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

            String url = ambucontact.get(position);

            Toast.makeText(context,"Redirecting to"+url,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent);

        }
    };


    @Override
    public int getItemCount() {
        return ambucity.size();
    }
}
