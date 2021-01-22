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

public class TestinglabAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    LayoutInflater inflater;
    Context context;
    int details;
    ArrayList<String> testcity = new ArrayList<String>();
    ArrayList<String> testcontact = new ArrayList<String>();
    ArrayList<String> testdescription = new ArrayList<String>();
    ArrayList<String> testnameoforganization = new ArrayList<String>();
    ArrayList<String> testphone = new ArrayList<String>();


    public TestinglabAdapter(ArrayList<String> testcity, ArrayList<String> testcontact, ArrayList<String> testdescription, ArrayList<String> testnameoforganization, ArrayList<String> testphone, int details, Context context) {

        this.context   = context;
        this.testcity = testcity;
        this.details   = details;
        this.testcontact = testcontact;
        this.testdescription = testdescription;
        this.testnameoforganization = testnameoforganization;
        this.testphone = testphone;
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


        holder.textCity.setText(testcity.get(position));
        holder.textContact.setText(testcontact.get(position));
        holder.textDescription.setText(testdescription.get(position));
        holder.textOrganization.setText(testnameoforganization.get(position));
        holder.textPhone.setText(testphone.get(position));


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
            String no = testphone.get(position);

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
            Toast.makeText(context,"url"+position,Toast.LENGTH_SHORT).show();

            String url = testcontact.get(position);

            Toast.makeText(context,"Redirecting to "+url,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent);

        }
    };

    @Override
    public int getItemCount() {
        return testcity.size();
    }
}
