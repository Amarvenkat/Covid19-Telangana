package com.amar.covid19telangana.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.Selfassesment.RiskPerson;

import java.util.List;

public class FirebaseAdapter extends RecyclerView.Adapter<FirebaseAdapter.FirebaseViewHolder> {
    private List<RiskPerson>listData;


    public FirebaseAdapter(List<RiskPerson> listData) {
        this.listData = listData;

    }

    @NonNull
    @Override
    public FirebaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.firebaseholder,parent,false);

        return new FirebaseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FirebaseViewHolder holder, int position) {
        RiskPerson ld=listData.get(position);

        holder.txtname.setText(ld.getRiskname());
        holder.txtaddress.setText(ld.getRiskaddress());
        holder.txtphoneno.setText(ld.getRiskphoneno());
        holder.txtgender.setText(ld.getRiskgender());
        holder.txtlat.setText(ld.getLatitude());
        holder.txtlon.setText(ld.getLongitude());



    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class FirebaseViewHolder extends RecyclerView.ViewHolder{
        private TextView txtname,txtaddress,txtgender,txtphoneno,txtlat,txtlon;
        public FirebaseViewHolder(View itemView) {
            super(itemView);
            txtname=(TextView)itemView.findViewById(R.id.firedbnametxt);
            txtaddress = (TextView)itemView.findViewById(R.id.firedbaddresstxt);
            txtgender = (TextView)itemView.findViewById(R.id.firedbgendertxt);
            txtphoneno = (TextView)itemView.findViewById(R.id.firedbphonetxt);
            txtlat = (TextView)itemView.findViewById(R.id.firedblattxt);
            txtlon = (TextView)itemView.findViewById(R.id.firedblontxt);



        }
    }
}
