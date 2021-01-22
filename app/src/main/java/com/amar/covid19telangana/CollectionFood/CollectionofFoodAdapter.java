package com.amar.covid19telangana.CollectionFood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.Unorganizedworker.UnorganizedAdapter;
import com.amar.covid19telangana.Unorganizedworker.UnorganizedPojo;

import java.util.ArrayList;

public class CollectionofFoodAdapter extends RecyclerView.Adapter<CollectionofFoodAdapter.CollectionofFoodViewHolder>{

    ArrayList<CollectionFoodPojo> collectionFoodlist  = new ArrayList<>();

    public CollectionofFoodAdapter(ArrayList<CollectionFoodPojo> collectionFoodlist) {

        this.collectionFoodlist = collectionFoodlist;

    }

    @NonNull
    @Override
    public CollectionofFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.collectionoffoodlist,parent,false);

        CollectionofFoodViewHolder collectionofFoodViewHolder = new CollectionofFoodViewHolder(view);


        return collectionofFoodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CollectionofFoodViewHolder holder, int position) {


        holder.collectionofFoodname.setText(collectionFoodlist.get(position).getName());
        holder.collectionofFoodphonetxt.setText(collectionFoodlist.get(position).getPhoneno());
        holder.collectionofFoodgendertxt.setText(collectionFoodlist.get(position).getGender());
        holder.collectionofFoodaddresstxt.setText(collectionFoodlist.get(position).getAddress());
        holder.collectionofFoodavailabletxt.setText(collectionFoodlist.get(position).getFoodavailable());
        holder.collectionofFoodquantitytxt.setText(collectionFoodlist.get(position).getQuantity());

    }

    @Override
    public int getItemCount() {

        return collectionFoodlist.size();
    }

    public class CollectionofFoodViewHolder extends RecyclerView.ViewHolder {
        TextView collectionofFoodname,collectionofFoodphonetxt,collectionofFoodgendertxt,collectionofFoodaddresstxt,collectionofFoodavailabletxt,collectionofFoodquantitytxt;
        public CollectionofFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            collectionofFoodname = (TextView) itemView.findViewById(R.id.collectionoffoodadminname);
            collectionofFoodphonetxt = (TextView) itemView.findViewById(R.id.collectionoffoodadminphonetxt);
            collectionofFoodgendertxt = (TextView) itemView.findViewById(R.id.collectionoffoodadmingendertxt);
            collectionofFoodaddresstxt = (TextView) itemView.findViewById(R.id.collectionoffoodadminaddresstxt);
            collectionofFoodavailabletxt = (TextView) itemView.findViewById(R.id.collectionoffoodadminavailabletxt);
            collectionofFoodquantitytxt = (TextView) itemView.findViewById(R.id.collectionoffoodadminquantitytxt);




        }
    }
}
