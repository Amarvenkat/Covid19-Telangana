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

public class GovHelplineAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    LayoutInflater inflater;
    Context context;
    int details;
    ArrayList<String> govhelpcity = new ArrayList<String>();
    ArrayList<String> govhelpcontact = new ArrayList<String>();
    ArrayList<String> govhelpdescription = new ArrayList<String>();
    ArrayList<String> govhelpnameoforganization = new ArrayList<String>();
    ArrayList<String> govhelpphone = new ArrayList<String>();

    public GovHelplineAdapter(ArrayList<String> govhelpcity, ArrayList<String> govhelpcontact, ArrayList<String> govhelpdescription, ArrayList<String> govhelpnameoforganization, ArrayList<String> govhelpphone, int details, Context applicationContext) {

        this.context = applicationContext;
        this.details = details;
        this.govhelpcity = govhelpcity;
        this.govhelpcontact = govhelpcontact;
        this.govhelpdescription = govhelpdescription;
        this.govhelpnameoforganization = govhelpnameoforganization;
        this.govhelpphone = govhelpphone;

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

        holder.textCity.setText(govhelpcity.get(position));
        holder.textContact.setText(govhelpcontact.get(position));
        holder.textDescription.setText(govhelpdescription.get(position));
        holder.textOrganization.setText(govhelpnameoforganization.get(position));
        holder.textPhone.setText(govhelpphone.get(position));
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
            String no = govhelpphone.get(position);

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

            String url = govhelpcontact.get(position);

            Toast.makeText(context,"Redirecting to"+url,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent);

        }
    };


    @Override
    public int getItemCount() {
        return govhelpcity.size();
    }
}
