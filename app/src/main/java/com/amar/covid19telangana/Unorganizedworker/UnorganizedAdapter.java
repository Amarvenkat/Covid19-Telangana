package com.amar.covid19telangana.Unorganizedworker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.MigrantLabour.LabourPojo;
import com.amar.covid19telangana.R;

import java.util.ArrayList;

public class UnorganizedAdapter extends RecyclerView.Adapter<UnorganizedAdapter.UnorganizedViewHolder> {

     ArrayList<UnorganizedPojo> unorganizedworkerlist  = new ArrayList<>();

    public UnorganizedAdapter(ArrayList<UnorganizedPojo> unorganizedworkerlist) {
        this.unorganizedworkerlist = unorganizedworkerlist;
    }

    @NonNull
    @Override
    public UnorganizedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.unorganizedlist,parent,false);

        UnorganizedViewHolder viewHolder = new UnorganizedViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UnorganizedViewHolder holder, int position) {
        UnorganizedPojo uw= unorganizedworkerlist.get(position);
        holder.unorganizedworkername.setText(uw.getName());
        holder.unorganizedworkerphonetxt.setText(uw.getPhoneno());
        holder.unorganizedworkergendertxt.setText(uw.getGender());
        holder.unorganizedworkeraddresstxt.setText(uw.getAddress());
        holder.unorganizedworkeragetxt.setText(uw.getAge());
        holder.unorganizedworkerworktxt.setText(uw.getNatureofwork());
        holder.unorganizedworkermaritaltxt.setText(uw.getMaritalstatus());
        holder.unorganizedworkerhelptxt.setText(uw.getHelp());
        holder.unorganizedworkerdependentmaletxt.setText(uw.getMaledependent());
        holder.unorganizedworkerdependentfemaletxt.setText(uw.getFemaledependant());


    }

    @Override
    public int getItemCount() {
        return unorganizedworkerlist.size();
    }


    public class UnorganizedViewHolder extends RecyclerView.ViewHolder {

        TextView unorganizedworkername,unorganizedworkerphonetxt,unorganizedworkergendertxt,unorganizedworkeraddresstxt,unorganizedworkeragetxt,unorganizedworkerworktxt,
                unorganizedworkermaritaltxt,unorganizedworkerhelptxt,unorganizedworkerdependentmaletxt,unorganizedworkerdependentfemaletxt;
        public UnorganizedViewHolder(@NonNull View itemView) {
            super(itemView);

            unorganizedworkername = (TextView) itemView.findViewById(R.id.unorganizedworkername);
            unorganizedworkerphonetxt =(TextView) itemView.findViewById(R.id.unorganizedworkerphonetxt);
            unorganizedworkergendertxt = (TextView) itemView.findViewById(R.id.unorganizedworkergendertxt);
            unorganizedworkeraddresstxt = (TextView) itemView.findViewById(R.id.unorganizedworkeraddresstxt);
            unorganizedworkeragetxt = (TextView) itemView.findViewById(R.id.unorganizedworkeragetxt);
            unorganizedworkerworktxt = (TextView) itemView.findViewById(R.id.unorganizedworkerworktxt);
            unorganizedworkermaritaltxt = (TextView) itemView.findViewById(R.id.unorganizedworkermaritaltxt);
            unorganizedworkerhelptxt =(TextView) itemView.findViewById(R.id.unorganizedworkerhelptxt);
            unorganizedworkerdependentmaletxt =(TextView) itemView.findViewById(R.id.unorganizedworkerdependentmaletxt);
            unorganizedworkerdependentfemaletxt =(TextView) itemView.findViewById(R.id.unorganizedworkerdependentfemaletxt);


        }
    }
}
