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

public class PoliceAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    LayoutInflater inflater;
    Context context;
    int details;

     ArrayList<String> policecity = new ArrayList<String>();
     ArrayList<String> policecontact = new ArrayList<String>();
     ArrayList<String> policedescription = new ArrayList<String>();
     ArrayList<String> policenameoforganization = new ArrayList<String>();
     ArrayList<String> policephone = new ArrayList<String>();

    public PoliceAdapter(ArrayList<String> policecity, ArrayList<String> policecontact, ArrayList<String> policedescription, ArrayList<String> policenameoforganization, ArrayList<String> policephone, int details, Context applicationContext) {

    this.context = applicationContext;
    this.details = details;
    this.policecity = policecity;
    this.policecontact = policecontact;
    this.policedescription = policedescription;
    this.policenameoforganization = policenameoforganization;
    this.policephone = policephone;


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

        holder.textCity.setText(policecity.get(position));
        holder.textContact.setText(policecontact.get(position));
        holder.textDescription.setText(policedescription.get(position));
        holder.textOrganization.setText(policenameoforganization.get(position));
        holder.textPhone.setText(policephone.get(position));
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
            String no = policephone.get(position);

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

            String url = policecontact.get(position);

            Toast.makeText(context,"Redirecting to"+url,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent);

        }
    };



    @Override
    public int getItemCount() {
        return policecity.size();
    }
}
