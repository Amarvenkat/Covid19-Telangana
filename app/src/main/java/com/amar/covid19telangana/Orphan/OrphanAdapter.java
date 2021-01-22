package com.amar.covid19telangana.Orphan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

import java.util.ArrayList;

public class OrphanAdapter extends RecyclerView.Adapter<OrphanViewHolder> {

    ArrayList<OrphanPojo> orphanlist;
    public OrphanAdapter(ArrayList<OrphanPojo> orphanlist) {

        this.orphanlist = orphanlist;
    }


    @NonNull
    @Override
    public OrphanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orphanlist,parent,false);
        OrphanViewHolder orphanViewHolder = new OrphanViewHolder(view);
        return orphanViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrphanViewHolder holder, int position) {

        holder.orphanadminname.setText(orphanlist.get(position).getName());
        holder.orphanadminaddresstxt.setText(orphanlist.get(position).getAddress());
        holder.orphanadmingendertxt.setText(orphanlist.get(position).getGender());
        holder.orphanadminphonetxt.setText(orphanlist.get(position).getPhoneno());
        holder.orphanadminhelp.setText(orphanlist.get(position).getHelp());
        holder.orphanadminliving.setText(orphanlist.get(position).getOrphanliving());
        holder.orphanadminorphanliving.setText(orphanlist.get(position).getOrphanorphanliving());
        holder.orphanadminshelding.setText(orphanlist.get(position).getOrphanshelding());


    }

    @Override
    public int getItemCount() {
        return orphanlist.size();
    }
}
