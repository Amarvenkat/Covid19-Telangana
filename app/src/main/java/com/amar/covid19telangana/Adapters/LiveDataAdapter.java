package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.ViewHolder.LiveViewHolder;
import com.amar.covid19telangana.RetrofitClass.StateWise;

import java.util.List;
import java.util.zip.Inflater;

public class LiveDataAdapter extends RecyclerView.Adapter<LiveViewHolder> {

    Inflater inflater;
    Context context;
    List<StateWise> state;
    int live_state;


    public LiveDataAdapter(List<StateWise> state, int live_state, Context applicationContext) {

        this.context = applicationContext;
        this.live_state = live_state;
        this.state = state;



    }

    @NonNull
    @Override
    public LiveViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(live_state,parent,false);
        LiveViewHolder holder = new LiveViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull LiveViewHolder holder, int position) {

        String currentstate = state.get(position).getState();
        String currentstatestring =  currentstate.concat(":");
        Integer activeInt = state.get(position).getActive();
        Integer confirmedInt = state.get(position).getConfirmed();
        Integer deathInt = state.get(position).getDeaths();
        Integer recoveredInt = state.get(position).getRecovered();

        holder.livestate.setText(currentstatestring);
        holder.totalstate.setText(confirmedInt.toString());
        holder.activestate.setText(activeInt.toString());
        holder.deathstate.setText(deathInt.toString());
        holder.recoveredstate.setText(recoveredInt.toString());




    }

    @Override
    public int getItemCount() {
        return state.size();
    }
}
