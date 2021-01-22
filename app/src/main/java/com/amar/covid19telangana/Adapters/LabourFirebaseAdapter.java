package com.amar.covid19telangana.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.MigrantLabour.LabourPojo;
import com.amar.covid19telangana.R;

import java.util.ArrayList;

public class LabourFirebaseAdapter extends RecyclerView.Adapter<LabourFirebaseAdapter.LabourFirebaseViewHolder>{

    private ArrayList<LabourPojo> labourlist  = new ArrayList<>();

    public LabourFirebaseAdapter(ArrayList<LabourPojo> labourlist) {

        this.labourlist = labourlist;
    }

    @NonNull
    @Override
    public LabourFirebaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.labourfirebaseholder,parent,false);

        return new LabourFirebaseAdapter.LabourFirebaseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LabourFirebaseViewHolder holder, int position) {

        LabourPojo ld=labourlist.get(position);

        holder.labourfiredbtxtname.setText(ld.getName());
        holder.labourfiredbtxtaddress.setText(ld.getAddress());
        holder.labourfiredbtxtphoneno.setText(ld.getPhoneno());
        holder.labourfiredbtxtgender.setText(ld.getGender());
        holder.labourfiredbtxtlat.setText(ld.getLatitude());
        holder.labourfiredbtxtlon.setText(ld.getLongitude());

        holder.labourfiredbhtname.setText(ld.getHtname());
        holder.labourfiredbhtaddress.setText(ld.getHtaddress());
        holder.labourfiredbhtdistrict.setText(ld.getHtdistrict());
        holder.labourfiredbhtstate.setText(ld.getHtstate());
        holder.labourfiredbhtcontactno.setText(ld.getHtcontactno());

        holder.labourfiredbmtcompanyname.setText(ld.getMtcompanyname());
        holder.labourfiredbnoofadult.setText(ld.getNoofadult());
        holder.labourfiredbnoofchild.setText(ld.getNoofchild());
        holder.labourfiredbnoofmale.setText(ld.getNoofmale());
        holder.labourfiredbnooffemale.setText(ld.getNooffemale());
        holder.labourfiredbmtcompanyownername.setText(ld.getMtcompanyownername());
        holder.labourfiredbmtcompanyaddress.setText(ld.getMtcompanyaddress());

        holder.labourfiredbmtdistrict.setText(ld.getMtdistrict());
        holder.labourfiredbmtstate.setText(ld.getMtstate());
        holder.labourfiredbnoofdependant.setText(ld.getNoofdependant());
        holder.labourfiredbjobstatus.setText(ld.getJobstatus());
        holder.labourfiredbmaritalstatus.setText(ld.getMaritalstatus());

    }

    @Override
    public int getItemCount() {
        return labourlist.size();
    }

    public class LabourFirebaseViewHolder extends RecyclerView.ViewHolder {

        private TextView labourfiredbtxtname,labourfiredbtxtaddress,labourfiredbtxtgender,labourfiredbtxtphoneno,labourfiredbtxtlat,
                labourfiredbtxtlon,labourfiredbhtname,labourfiredbhtaddress,labourfiredbhtdistrict,
                labourfiredbhtstate,labourfiredbhtcontactno,labourfiredbmtcompanyname,labourfiredbnoofadult,labourfiredbnoofchild,labourfiredbnoofmale,
                labourfiredbnooffemale,labourfiredbmtcompanyownername,labourfiredbmtcompanyaddress,
                labourfiredbmtdistrict,labourfiredbmtstate,labourfiredbnoofdependant,labourfiredbjobstatus,labourfiredbmaritalstatus;

        public LabourFirebaseViewHolder(@NonNull View itemView) {
            super(itemView);

            labourfiredbtxtname=(TextView)itemView.findViewById(R.id.labourfiredbnametxt);
            labourfiredbtxtaddress = (TextView)itemView.findViewById(R.id.labourfiredbaddresstxt);
            labourfiredbtxtgender = (TextView)itemView.findViewById(R.id.labourfiredbgendertxt);
            labourfiredbtxtphoneno = (TextView)itemView.findViewById(R.id.labourfiredbphonetxt);
            labourfiredbtxtlat = (TextView)itemView.findViewById(R.id.labourfiredblattxt);
            labourfiredbtxtlon = (TextView)itemView.findViewById(R.id.labourfiredblontxt);
            labourfiredbhtname = (TextView)itemView.findViewById(R.id.labourfiredbhtname);
            labourfiredbhtaddress = (TextView)itemView.findViewById(R.id.labourfiredbhtaddress);
            labourfiredbhtdistrict = (TextView) itemView.findViewById(R.id.labourfiredbhtdistrict);
            labourfiredbhtstate = (TextView) itemView.findViewById(R.id.labourfiredbhtstate);
            labourfiredbhtcontactno = (TextView) itemView.findViewById(R.id.labourfiredbhtcontactno);
            labourfiredbmtcompanyname = (TextView) itemView.findViewById(R.id.labourfiredbmtcompanyname);
            labourfiredbmtcompanyownername = (TextView) itemView.findViewById(R.id.labourfiredbmtcompanyownername);
            labourfiredbmtcompanyaddress = (TextView) itemView.findViewById(R.id.labourfiredbmtcompanyaddress);
            labourfiredbmtdistrict = (TextView) itemView.findViewById(R.id.labourfiredbmtdistrict);
            labourfiredbmtstate = (TextView) itemView.findViewById(R.id.labourfiredbmtstate);
            labourfiredbjobstatus = (TextView) itemView.findViewById(R.id.labourfiredbjobstatus);
            labourfiredbmaritalstatus = (TextView) itemView.findViewById(R.id.labourfiredbmaritalstatus);
            labourfiredbnoofdependant = (TextView) itemView.findViewById(R.id.labourfiredbnoofdependant);
            labourfiredbnoofadult = (TextView) itemView.findViewById(R.id.labourfiredbnoofadult);
            labourfiredbnoofchild = (TextView) itemView.findViewById(R.id.labourfiredbnoofchild);
            labourfiredbnoofmale = (TextView) itemView.findViewById(R.id.labourfiredbnoofmale);
            labourfiredbnooffemale = (TextView) itemView.findViewById(R.id.labourfiredbnooffemale);

        }
    }
}
