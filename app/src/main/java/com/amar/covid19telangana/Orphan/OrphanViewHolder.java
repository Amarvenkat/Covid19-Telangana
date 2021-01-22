package com.amar.covid19telangana.Orphan;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;

public class OrphanViewHolder extends RecyclerView.ViewHolder {

    TextView orphanadminname,orphanadminphonetxt,orphanadmingendertxt,orphanadminaddresstxt,orphanadminhelp,orphanadminliving,orphanadminorphanliving,orphanadminshelding;
    public OrphanViewHolder(@NonNull View itemView) {
        super(itemView);

        orphanadminname = (TextView) itemView.findViewById(R.id.orphanadminname);
        orphanadminphonetxt = (TextView) itemView.findViewById(R.id.orphanadminphonetxt);
        orphanadmingendertxt = (TextView) itemView.findViewById(R.id.orphanadmingendertxt);
        orphanadminaddresstxt = (TextView) itemView.findViewById(R.id.orphanadminaddresstxt);
        orphanadminhelp = (TextView) itemView.findViewById(R.id.orphanadminhelp);
        orphanadminliving = (TextView) itemView.findViewById(R.id.orphanadminliving);
        orphanadminorphanliving = (TextView) itemView.findViewById(R.id.orphanadminorphanliving);
        orphanadminshelding = (TextView) itemView.findViewById(R.id.orphanadminshelding);


    }
}
