package com.amar.covid19telangana;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.CollectionFood.CollectionFoodMain;
import com.amar.covid19telangana.HealthWorkerAssigning.HealthWorkerAssigning;
import com.amar.covid19telangana.MigrantLabour.LabourDetails;
import com.amar.covid19telangana.Orphan.OrphanHome;
import com.amar.covid19telangana.RetrofitClass.Accommodation;
import com.amar.covid19telangana.RetrofitClass.Ambulance;
import com.amar.covid19telangana.RetrofitClass.Fire;
import com.amar.covid19telangana.RetrofitClass.FreeFood;
import com.amar.covid19telangana.RetrofitClass.Fundraisers;
import com.amar.covid19telangana.RetrofitClass.GovHelpline;
import com.amar.covid19telangana.RetrofitClass.Hospital;
import com.amar.covid19telangana.RetrofitClass.Other;
import com.amar.covid19telangana.RetrofitClass.Police;
import com.amar.covid19telangana.RetrofitClass.Testinglab;
import com.amar.covid19telangana.RetrofitClass.Transportation;
import com.amar.covid19telangana.Unorganizedworker.UnorganizedMain;
import com.amar.covid19telangana.ViewHolder.MainRecyclerViewHolder;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TileRecyclerAdapter extends RecyclerView.Adapter<TitleViewHolder> {

    ArrayList<Integer> title = new ArrayList<>();
    ArrayList<Integer> iconarray = new ArrayList<>();
    Context context;
    LayoutInflater inflater;
     public TileRecyclerAdapter(Context applicationContext, ArrayList<Integer> title, ArrayList<Integer> iconarray) {

         this.title = title;
         this.context = applicationContext;
         this.iconarray =iconarray;
         inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public TitleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.title,parent,false);
        TitleViewHolder titleViewHolder = new TitleViewHolder(view);

        return titleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TitleViewHolder holder, int position) {

         holder.titletxt.setText(title.get(position));
         holder.titlebtn.setTag(holder);
         Picasso.with(context).load(iconarray.get(position)).resize(50,50).into(holder.titleimg);
         holder.titlebtn.setOnClickListener(clickListner);
    }


    @Override
    public int getItemCount() {
        return title.size();
    }
    View.OnClickListener clickListner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            TitleViewHolder vholder = (TitleViewHolder) view.getTag();
            int position = vholder.getPosition();


            switch (position) {

                case 0:
                    Intent intent0 = new Intent(context,  LabourDetails.class);
                    intent0.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent0);
                    break;
                case 1:
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://policeportal.tspolice.gov.in/"));
                    intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent1);
                    break;
                case 2:
                    Intent intent2 = new Intent(context, Helpline.class);
                    intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent2);
                    break;
                case 3:
                    Intent intent3 = new Intent(context, UnorganizedMain.class);
                    intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent3);
                    break;
                case 4:
                    Intent intent4 = new Intent(context, CollectionFoodMain.class);
                    intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent4);
                    break;
                case 5:
                    Intent intent5 = new Intent(context, HealthWorkerAssigning.class);
                    intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent5);
                    break;
                case 6:
                    Intent intent6 = new Intent(context, OrphanHome.class);
                    intent6.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent6);
                    break;
                case 7:
                    Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.healthfrog.in/chemists/medical-store/"));
                    intent7.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent7);
                    break;
                case 8:
                    Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mygov.in/task/join-war-against-covid-19-register-volunteer/"));
                    intent8.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent8);
                    break;


                case 9:
                    Intent intent9 = new Intent(context, Testinglab.class);
                    intent9.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent9);
                    break;
                case 10:
                    Intent intent10 = new Intent(context, FreeFood.class);
                    intent10.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent10);
                    break;
                case 11:
                    Intent intent11 = new Intent(context, Fundraisers.class);
                    intent11.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent11);
                    break;
                case 12:
                    Intent intent12 = new Intent(context, Hospital.class);
                    intent12.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent12);
                    break;
                case 13:
                    Intent intent13 = new Intent(context, Police.class);
                    intent13.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent13);
                    break;
                case 14:
                    Intent intent14 = new Intent(context, GovHelpline.class);
                    intent14.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent14);
                    break;
                case 15:
                    Intent intent15 = new Intent(context, Accommodation.class);
                    intent15.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent15);
                    break;
                case 16:
                    Intent intent16 = new Intent(context, Transportation.class);
                    intent16.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent16);
                    break;
                case 17:
                    Intent intent17 = new Intent(context, Fire.class);
                    intent17.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent17);
                    break;
                case 18:
                    Intent intent18 = new Intent(context, Ambulance.class);
                    intent18.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent18);
                    break;
                case 19:
                    Intent intent19 = new Intent(context, Other.class);
                    intent19.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent19);
                    break;

            }
        }
    };

}

