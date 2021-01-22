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

public class TransportationAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    LayoutInflater inflater;
    Context context;
    int details;

     ArrayList<String> transcity = new ArrayList<String>();
     ArrayList<String> transcontact = new ArrayList<String>();
     ArrayList<String> transdescription = new ArrayList<String>();
     ArrayList<String> transnameoforganization = new ArrayList<String>();
     ArrayList<String> transphone = new ArrayList<String>();

    public TransportationAdapter(ArrayList<String> transcity, ArrayList<String> transcontact, ArrayList<String> transdescription, ArrayList<String> transnameoforganization, ArrayList<String> transphone, int details, Context applicationContext) {

        this.context = applicationContext;
        this.details = details;
        this.transcity = transcity;
        this.transcontact = transcontact;
        this.transdescription = transdescription;
        this.transnameoforganization = transnameoforganization;
        this.transphone = transphone;

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


        holder.textCity.setText(transcity.get(position));
        holder.textContact.setText(transcontact.get(position));
        holder.textDescription.setText(transdescription.get(position));
        holder.textOrganization.setText(transnameoforganization.get(position));
        holder.textPhone.setText(transphone.get(position));
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
            String no = transphone.get(position);

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
            String url = transcontact.get(position);

            Toast.makeText(context,"Redirecting to"+url,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent);


        }
    };


    @Override
    public int getItemCount() {
        return transcity.size();
    }
}
