package com.amar.covid19telangana.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class LiveViewHolder  extends RecyclerView.ViewHolder{

    public TextView livestate,totalstate,activestate,deathstate,recoveredstate;


    public LiveViewHolder(@NonNull View itemView) {
        super(itemView);

        livestate = (TextView) itemView.findViewById(R.id.livestate);
        totalstate = (TextView) itemView.findViewById(R.id.livetotalstate);
        activestate = (TextView) itemView.findViewById(R.id.liveactivestate);
        deathstate = (TextView) itemView.findViewById(R.id.livedeathstate);
        recoveredstate = (TextView) itemView.findViewById(R.id.liverecoveredstate);

    }
}
