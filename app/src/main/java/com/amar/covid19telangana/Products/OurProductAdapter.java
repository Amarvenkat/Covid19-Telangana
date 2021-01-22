package com.amar.covid19telangana.Products;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.ViewHolder.NewsMainViewHolder;
import com.amar.covid19telangana.ViewHolder.RecyclerViewHolder;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.QuerySnapshot;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

class OurProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    private static final String SELLEMAIL ="sellemail" ;
    private static final String SELLTRADELISENCEDETAILS ="selltradelinsencedetails" ;
    private static final String SELLPRODUCTNAME ="sellproductname" ;
    private static final String SELLBRANDNAME = "sellbrandname";
    private static final String SELLSTOCKAVAILABILITY ="sellstockavailability" ;
    private static final String SELLPRICE = "sellprice";
    private static final String SELLPRODUCTDESCRIPTION = "sellproductdescription";
    private static final String MINTYPE ="mintype" ;
    public  static final String SELLCOMPANYNAME  = "sellcompanyname";
    public  static final String  SELLADDRESS = "first";
    public  static final String  SELLCONTACTNUMBER = "first";
    public  static final String  IMGURL = "imgurl";

    ArrayList<ProductsPojo> images = new ArrayList<>();
    Context context;

    public OurProductAdapter(Context applicationContext, ArrayList<ProductsPojo> images) {


        this.context = applicationContext;
        this.images = images;

    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.productholder, parent, false);

        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        holder.ourProducttext.setText(images.get(position).getStringproductname());
        Picasso.with(context).load(images.get(position).getUrl()).fit().into(holder.ourProductImg);
        holder.ourProductcard.setTag(holder);
        holder.ourProductcard.setOnClickListener(clickListner);



    }
    View.OnClickListener clickListner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            ProductViewHolder viewHolder = (ProductViewHolder) view.getTag();
            int position = viewHolder.getPosition();

            Bundle bundle = new Bundle();

            Intent intent = new Intent(context,ProductDetails.class);
            bundle.putString(SELLCOMPANYNAME,images.get(position).getStringcompanyname());
            bundle.putString(SELLADDRESS,images.get(position).getStringaddress());
            bundle.putString(SELLCONTACTNUMBER,images.get(position).getStringsellcontactnumber());
            bundle.putString(SELLEMAIL,images.get(position).getStringsellemail());
            bundle.putString(SELLTRADELISENCEDETAILS,images.get(position).getStringtradelisencedetails());
            bundle.putString(SELLPRODUCTNAME,images.get(position).getStringproductname());
            bundle.putString(SELLBRANDNAME,images.get(position).getStringbrandname());
            bundle.putString(SELLSTOCKAVAILABILITY,images.get(position).getStringstockavailability());
            bundle.putString(SELLPRICE,images.get(position).getStringprice());
            bundle.putString(SELLPRODUCTDESCRIPTION,images.get(position).getStringproductdescription());
            bundle.putString(IMGURL, images.get(position).getUrl());
            intent.putExtras(bundle);

            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent);

        }
    };


    @Override
    public int getItemCount() {
        return images.size();
    }
}
